package No32;

import No32��2.*;

class SameClassChecker{
	public SameClassChecker() {
		//����Ŭ����
		this._public();
		this._protected();
		this._default();
		this._private();	
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
	
	private void _private() {
		System.out.println("private");
	}
}

class SamePackageChecker extends Same{
	public SamePackageChecker() {
		//������Ű��
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
		//same._private();
		
		//���� ��Ű�� ��� ����
		this._public();
		this._protected();
		this._default();
		//this.private();
	}
}

class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		//�ٸ���Ű��
		Other other = new Other();
		other._public();
		//other._protected();
		//other._default();
		//other._private();
		
		//�ٸ� Ŭ����
		this._public();
		this._protected();
		//this._default();
		//this._private();
		
		Nothing nothing = new Nothing();
		nothing._public();
		//nothing._protected();
		//nothing._default();
		//nothing._private();
	}
}
