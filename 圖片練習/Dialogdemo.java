package �Ϥ��m��;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dialogdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ѽ�1 ����ܮ�
		JOptionPane.showMessageDialog(null, "���~");
		
		//�Ѽ�2 ��ܮؤ������ܰT��
		//�Ѽ�3 ��ܮؤ������D�T��
		//�Ѽ�4 ��ܮؤ�����������		
		
		JOptionPane.showMessageDialog(null, "���ѦY�F�S?","�N�H�ݷx",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "���ѦY�F�S?","�N�H�ݷx",JOptionPane.WARNING_MESSAGE);
		
		//�Ѽ�5 ��ܮ���ܪ��Ϥ���H	
		
		JOptionPane.showMessageDialog(null, "���ѦY�F�S?","�N�H�ݷx",JOptionPane.WARNING_MESSAGE,new ImageIcon("image/�T�W�y��.jpg"));

		//��ܮؿ��
		JOptionPane.showInputDialog(null, "�Y�F��?","���D",0,new ImageIcon("image/�T�W�y��.jpg"),
				
		                 new String[]{"1.�Y�F","2.���A����","3.���Ѥ@�_�Y�t!"},
		                 "�q�{��"
		);
		
		//��ܮا��Yes or NO
		JOptionPane.showConfirmDialog(null, "�쩳�h���h�Y");	
		
		

	}

}
