package kr.ac.kopo;

public class Calc {
	enum State{
		INIT, LEFT, OP, RIGHT, RESULT
	}
	State state = State.INIT;
	int display;
	int left;
	String op;
	

	public int getDisplay() {
		return display;
	}

	public void click(String btn) {
		try {
			int digit = Integer.valueOf(btn);
			NumClick(digit);
		}
		catch (NumberFormatException e) {
			OpratorClick(btn);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private void OpratorClick(String btn) {
		if(btn.equals("C")) {
			state = State.INIT;
			display = 0;
			return;
		}
		
		if(state == State.LEFT) {
			if(isOp(btn)) {
				state = State.OP;
				left = display;
				op = btn;
			}
		}
		else if(state == State.OP) {
			if(isOp(btn)) {
				op = btn;
			}
		}
		else if(state == State.RIGHT) {
			if(btn.equals("E")) {
				state = State.RESULT;
				Calculation();
			}
		}
		else if(state == State.RESULT) {
			if(isOp(btn)) {
				state = State.OP;
				left = display;
				op = btn;
			}
		}
	}

	private void NumClick(int digit) {
		// 초기 상태에서 숫자를 입력 받을 경우
		if(state == State.INIT) {
			state = State.LEFT;
			display = digit;
		}
		else if((state == State.LEFT) || (state == State.RIGHT)){
			display = display * 10 + digit;
		}
		else if(state == State.OP) {
			state = State.RIGHT;
			display = digit;
		}
		else if(state == State.RESULT) {
			state = State.LEFT;
			left = display;
			display = digit;
		}
	}
	
	private boolean isOp(String btn) {
		if(btn.equals("add") || btn.equals("sub") || btn.equals("mul") || btn.equals("div")) {
			return true;
		}
		return false;
	}
	
	private void Calculation() {
		switch (op) {
		case "add":
			display = left + display;
			break;
		case "sub":
			display = left - display;
			break;
		case "mul":
			display = left * display;
			break;
		case "div":
			display = left / display;
			break;
		}
	}
}
