package No32คั2;

public class Nothing {
	private void _private() {
		System.out.println("private");
	}
	
	public void _public() {
		System.out.println("public");
	}
	
	protected void _protected() {
		System.out.println("protected");
	}
	
	void _default() {
		System.out.println("default");
	}
	
	class OtherPackageChecker extends Other{
		public OtherPackageChecker() {
			Nothing nothing = new Nothing();
			nothing._public();
			nothing._protected();
			nothing._default();
			nothing._private();
		}
	}

}

