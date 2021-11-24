package windowProgramming;

public class Window {
	// window 창을 만든다고 생각
	// 가로, 세로 길이
	private int width;
	private int height;
	// 보일때, 안보일때( 현재 보이는가? )
	private boolean isVisible;
	// 창의 위치(좌표)
	private int top;
	private int left;
	
	//private니까 get, set 메소드 만들기
	// get
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	public void setTop(int top) {
		this.top = top;
	}
	public int getTop() {
		return top;
	}
	
	public void setLeft(int left) {
		this.left = left;
	}
	public int getLeft() {
		return left;
	}
	
}
