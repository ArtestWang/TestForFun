package Act;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.List;

public class ProcessInstanceController {


    ProcessEngineConfiguration engineConfiguration=
            ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
    ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
    public static void main(String[] args){
       //createActivitiEngine();
//       deploy();
//        startProcess();
        findHistoryTask();
       // findHistoryProcessInstance();
    }


    public static void createActivitiEngine(){

        /*        *1.通过代码形式创建
         *  - 取得ProcessEngineConfiguration对象
         *  - 设置数据库连接属性
         *  - 设置创建表的策略 （当没有表时，自动创建表）
         *  - 通过ProcessEngineConfiguration对象创建 ProcessEngine 对象*/

        //取得ProcessEngineConfiguration对象
        ProcessEngineConfiguration engineConfiguration=ProcessEngineConfiguration.
                createStandaloneProcessEngineConfiguration();
        //设置数据库连接属性
        engineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        engineConfiguration.setJdbcUrl("jdbc:mysql://localhost:3306/sjfx?createDatabaseIfNotExist=true"
                + "&useUnicode=true&characterEncoding=utf8");
        engineConfiguration.setJdbcUsername("root");
        engineConfiguration.setJdbcPassword("mysql");


        // 设置创建表的策略 （当没有表时，自动创建表）
        //       public static final java.lang.String DB_SCHEMA_UPDATE_FALSE = "false";//不会自动创建表，没有表，则抛异常
        //       public static final java.lang.String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";//先删除，再创建表
        //       public static final java.lang.String DB_SCHEMA_UPDATE_TRUE = "true";//假如没有表，则自动创建
        engineConfiguration.setDatabaseSchemaUpdate("true");
        //通过ProcessEngineConfiguration对象创建 ProcessEngine 对象
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        System.out.println("流程引擎创建成功!");

    }


    public static void getInstance(){
        ProcessEngineConfiguration engineConfiguration=
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        //从类加载路径中查找资源  activiti.cfg.xm文件名可以自定义
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        System.out.println("使用配置文件Activiti.cfg.xml获取流程引擎");

    }

    public static void deploy() {

        //获取仓库服务 ：管理流程定义
        ProcessEngineConfiguration engineConfiguration=
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment()//创建一个部署的构建器
                .addClasspathResource("Test.bpmn")//从类路径中添加资源,一次只能添加一个资源
                .name("请求单流程")//设置部署的名称
                .category("办公类别")//设置部署的类别
                .deploy();

        System.out.println("部署的id"+deploy.getId());
        System.out.println("部署的名称"+deploy.getName());
    }

    public static void startProcess(){

        //指定执行我们刚才部署的工作流程
        String processDefiKey="testActiviti";
        //取运行时服务
        ProcessEngineConfiguration engineConfiguration=
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        //取得流程实例
        ProcessInstance pi = runtimeService.startProcessInstanceByKey(processDefiKey);//通过流程定义的key 来执行流程
        System.out.println("流程实例id:"+pi.getId());//流程实例id
        System.out.println("流程定义id:"+pi.getProcessDefinitionId());//输出流程定义的id
    }


    public static void findHistoryProcessInstance(){
        ProcessEngineConfiguration engineConfiguration=
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        HistoricProcessInstance pi = processEngine.getHistoryService()//与历史数据（历史表）相关的Service
                .createHistoricProcessInstanceQuery()//创建历史流程实例查询
                .processInstanceId("")//使用流程实例ID查询
                .singleResult();
        System.out.println("流程实例ID:"+pi.getId());//流程实例ID
        System.out.println("流程定义ID:"+pi.getProcessDefinitionId());//流程定义ID
        System.out.println("流程开始时间:"+pi.getStartTime());
        System.out.println("流程结束时间:"+pi.getEndTime());
    }



    public static void findHistoryTask(){
        String taskAssignee = "dongjinxin";
        ProcessEngineConfiguration engineConfiguration=
                ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine processEngine = engineConfiguration.buildProcessEngine();
        List<HistoricTaskInstance> list = processEngine.getHistoryService()//与历史数据（历史表）相关的Service
                .createHistoricTaskInstanceQuery()//创建历史任务实例查询
                .taskAssignee(taskAssignee)//指定历史任务的办理人
                .list();
        if(list!=null && list.size()>0){
            for(HistoricTaskInstance pi:list){
                System.out.println("流程实例ID:"+pi.getId());//流程实例ID
                System.out.println("流程定义ID:"+pi.getProcessDefinitionId());//流程定义ID
                System.out.println("流程名称:"+pi.getName());
                System.out.println("代理人:"+pi.getAssignee());
            }
        }
    }


}
