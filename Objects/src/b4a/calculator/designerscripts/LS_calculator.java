package b4a.calculator.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_calculator{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[calculator/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="lbl1.Left=5%x"[calculator/General script]
views.get("lbl1").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 5;BA.debugLine="lbl1.Top=5%y"[calculator/General script]
views.get("lbl1").vw.setTop((int)((5d / 100 * height)));
//BA.debugLineNum = 6;BA.debugLine="lbl1.Width=20%x"[calculator/General script]
views.get("lbl1").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 7;BA.debugLine="lbl1.Height=10%y"[calculator/General script]
views.get("lbl1").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 9;BA.debugLine="lbl2.Left=5%x"[calculator/General script]
views.get("lbl2").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="lbl2.Top=20%y"[calculator/General script]
views.get("lbl2").vw.setTop((int)((20d / 100 * height)));
//BA.debugLineNum = 11;BA.debugLine="lbl2.Width=26%x"[calculator/General script]
views.get("lbl2").vw.setWidth((int)((26d / 100 * width)));
//BA.debugLineNum = 12;BA.debugLine="lbl2.Height=10%y"[calculator/General script]
views.get("lbl2").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 14;BA.debugLine="lbl3.Width=20%x"[calculator/General script]
views.get("lbl3").vw.setWidth((int)((20d / 100 * width)));
//BA.debugLineNum = 15;BA.debugLine="lbl3.Height=10%y"[calculator/General script]
views.get("lbl3").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 16;BA.debugLine="lbl3.Left=5%x"[calculator/General script]
views.get("lbl3").vw.setLeft((int)((5d / 100 * width)));
//BA.debugLineNum = 17;BA.debugLine="lbl3.Bottom=92%y"[calculator/General script]
views.get("lbl3").vw.setTop((int)((92d / 100 * height) - (views.get("lbl3").vw.getHeight())));
//BA.debugLineNum = 19;BA.debugLine="lblrs.Bottom=87.2%y"[calculator/General script]
views.get("lblrs").vw.setTop((int)((87.2d / 100 * height) - (views.get("lblrs").vw.getHeight())));
//BA.debugLineNum = 20;BA.debugLine="lblrs.Height=10%y"[calculator/General script]
views.get("lblrs").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 21;BA.debugLine="lblrs.Left=lbl3.Right+20%x"[calculator/General script]
views.get("lblrs").vw.setLeft((int)((views.get("lbl3").vw.getLeft() + views.get("lbl3").vw.getWidth())+(20d / 100 * width)));
//BA.debugLineNum = 23;BA.debugLine="et1.Top=2.5%y"[calculator/General script]
views.get("et1").vw.setTop((int)((2.5d / 100 * height)));
//BA.debugLineNum = 24;BA.debugLine="et1.Height=10%y"[calculator/General script]
views.get("et1").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 25;BA.debugLine="et1.Left=lbl1.Right+20%x"[calculator/General script]
views.get("et1").vw.setLeft((int)((views.get("lbl1").vw.getLeft() + views.get("lbl1").vw.getWidth())+(20d / 100 * width)));
//BA.debugLineNum = 27;BA.debugLine="et2.Top=17.5%y"[calculator/General script]
views.get("et2").vw.setTop((int)((17.5d / 100 * height)));
//BA.debugLineNum = 28;BA.debugLine="et2.Height=10%y"[calculator/General script]
views.get("et2").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 29;BA.debugLine="et2.Left=lbl2.Right+13%x"[calculator/General script]
views.get("et2").vw.setLeft((int)((views.get("lbl2").vw.getLeft() + views.get("lbl2").vw.getWidth())+(13d / 100 * width)));
//BA.debugLineNum = 31;BA.debugLine="sp1.Width=90%x"[calculator/General script]
views.get("sp1").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 32;BA.debugLine="sp1.Height=10%y"[calculator/General script]
views.get("sp1").vw.setHeight((int)((10d / 100 * height)));
//BA.debugLineNum = 33;BA.debugLine="sp1.HorizontalCenter=50%x"[calculator/General script]
views.get("sp1").vw.setLeft((int)((50d / 100 * width) - (views.get("sp1").vw.getWidth() / 2)));
//BA.debugLineNum = 34;BA.debugLine="sp1.VerticalCenter=50%y"[calculator/General script]
views.get("sp1").vw.setTop((int)((50d / 100 * height) - (views.get("sp1").vw.getHeight() / 2)));

}
}