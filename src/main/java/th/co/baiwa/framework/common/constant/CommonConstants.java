package th.co.baiwa.framework.common.constant;

public class CommonConstants {
	
	public static final class FLAG {
		public static final String Y_FLAG = "Y";
		public static final String N_FLAG = "N";
	}
	
	public static final class ENCODING {
		public static final String UTF8 = "UTF-8";
	}
	
	public static final class SPRING_BEAN_NAME {
		public static final String MESSAGE_SESSION_BEAN = "messageSessionBean";
	}
	
	// Using in Security Module, for checking this User is authenticate already
	public static final String ROLE_USER = "ROLE_USER";
	
	// System User
	public static final class BACKEND_USER {
		public static final String SYSTEM = "SYSTEM";
	}
	
	public static final class ANGULAR2 {
		public static final String VIWE_NAME = "baiwa/common/templates/angular2-body";
		public static final String APP_NAME = "mainTsName";
	}
	
	public static final class EditDataTableAction {
		public static final String CREATE = "create";
		public static final String EDIT = "edit";
		public static final String REMOVE = "remove";
	}
	
}
