/**
 * 
 */
package org.sogrey.mydialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

/**
 * @author Administrator
 *
 */
public class Mainactivity extends Activity {
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Dialog dialog = new Dialog(this);
        
        // setContentView��������Ϊһ��ViewҲ���Լ򵥵�ָ����ԴID
        // LayoutInflater
        // li=(LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        // View v=li.inflate(R.layout.dialog_layout, null);
        // dialog.setContentView(v);
        dialog.setContentView(R.layout.dialog_layout);

        dialog.setTitle("Custom Dialog");

        /* 
         * ��ȡʥ����Ĵ��ڶ��󼰲����������޸ĶԻ���Ĳ�������,
         * ����ֱ�ӵ���getWindow(),��ʾ������Activity��Window
         * ����,�����������ͬ���ķ�ʽ�ı����Activity������.
         */
        Window dialogWindow = dialog.getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        dialogWindow.setGravity(Gravity.LEFT | Gravity.TOP);

        /*
         * lp.x��lp.y��ʾ�����ԭʼλ�õ�ƫ��.
         * ������ֵ����Gravity.LEFTʱ,�Ի�����������,����lp.x�ͱ�ʾ�����ߵ�ƫ��,��ֵ����.
         * ������ֵ����Gravity.RIGHTʱ,�Ի���������ұ�,����lp.x�ͱ�ʾ����ұߵ�ƫ��,��ֵ����.
         * ������ֵ����Gravity.TOPʱ,�Ի���������ϱ�,����lp.y�ͱ�ʾ����ϱߵ�ƫ��,��ֵ����.
         * ������ֵ����Gravity.BOTTOMʱ,�Ի���������±�,����lp.y�ͱ�ʾ����±ߵ�ƫ��,��ֵ����.
         * ������ֵ����Gravity.CENTER_HORIZONTALʱ
         * ,�Ի���ˮƽ����,����lp.x�ͱ�ʾ��ˮƽ���е�λ���ƶ�lp.x����,��ֵ�����ƶ�,��ֵ�����ƶ�.
         * ������ֵ����Gravity.CENTER_VERTICALʱ
         * ,�Ի���ֱ����,����lp.y�ͱ�ʾ�ڴ�ֱ���е�λ���ƶ�lp.y����,��ֵ�����ƶ�,��ֵ�����ƶ�.
         * gravity��Ĭ��ֵΪGravity.CENTER,��Gravity.CENTER_HORIZONTAL |
         * Gravity.CENTER_VERTICAL.
         * 
         * ����setGravity�Ĳ���ֵΪGravity.LEFT | Gravity.TOPʱ�Ի���Ӧ�����ڳ�������Ͻ�,����
         * ���ֻ��ϲ���ʱ���־�������ϱ߶���һС�ξ���,���Ҵ�ֱ����ѳ��������Ҳ����������,
         * Gravity.LEFT, Gravity.TOP, Gravity.BOTTOM��Gravity.RIGHT�������,�ݱ߽���һС�ξ���
         */
        lp.x = 100; // ��λ��X����
        lp.y = 100; // ��λ��Y����
        lp.width = 300; // ���
        lp.height = 300; // �߶�
        lp.alpha = 0.7f; // ͸����

        // ��Window��Attributes�ı�ʱϵͳ����ô˺���,����ֱ�ӵ�����Ӧ������Դ��ڲ����ĸ���,Ҳ������setAttributes
        // dialog.onWindowAttributesChanged(lp);
        dialogWindow.setAttributes(lp);

        /*
         * ���Ի���Ĵ�С����Ļ��С�İٷֱ�����
         */
//        WindowManager m = getWindowManager();
//        Display d = m.getDefaultDisplay(); // ��ȡ��Ļ������
//        WindowManager.LayoutParams p = dialogWindow.getAttributes(); // ��ȡ�Ի���ǰ�Ĳ���ֵ
//        p.height = (int) (d.getHeight() * 0.6); // �߶�����Ϊ��Ļ��0.6
//        p.width = (int) (d.getWidth() * 0.65); // �������Ϊ��Ļ��0.65
//        dialogWindow.setAttributes(p);

        dialog.show();

    }
}
