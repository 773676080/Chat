package main;

import javax.swing.JFrame;

import ui.UiFactory;

public class Start {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO exception
		}
		UiFactory.creatLogin();
	}

}
