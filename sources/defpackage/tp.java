package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tp implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ tp(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                ex exVar = androidComposeView.f1;
                if (exVar != null) {
                    int childCount = exVar.getChildCount();
                    while (i2 < childCount) {
                        View childAt = exVar.getChildAt(i2);
                        ax axVar = childAt instanceof ax ? (ax) childAt : null;
                        if (axVar != null && axVar.isLayoutRequested()) {
                            axVar.layout(axVar.getLeft(), axVar.getTop(), axVar.getRight(), axVar.getBottom());
                        }
                        i2++;
                    }
                }
                return wef.a;
            case 1:
                Class cls = AndroidComposeView.X1;
                if (Build.VERSION.SDK_INT > 28 && androidComposeView.isAttachedToWindow()) {
                    if (AndroidComposeView.b2 == null) {
                        ni niVar = new ni(i3);
                        AndroidComposeView.b2 = niVar;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (AndroidComposeView.X1 == null) {
                                AndroidComposeView.X1 = Class.forName("android.os.SystemProperties");
                            }
                            Method declaredMethod = AndroidComposeView.Z1;
                            if (declaredMethod == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls2 = AndroidComposeView.X1;
                                declaredMethod = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                                AndroidComposeView.Z1 = declaredMethod;
                            }
                            if (declaredMethod != null) {
                                declaredMethod.invoke(null, niVar);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    i79 i79Var = AndroidComposeView.a2;
                    synchronized (i79Var) {
                        i79Var.h(androidComposeView);
                    }
                }
                return wef.a;
            case 2:
                Class cls3 = AndroidComposeView.X1;
                Boolean bool = (Boolean) androidComposeView.H0.getValue();
                bool.getClass();
                return bool;
            case 3:
                Class cls4 = AndroidComposeView.X1;
                td8 td8VarC = td8.c(androidComposeView.getConfiguration().getLocales());
                if (td8VarC.a.a.isEmpty()) {
                    td8VarC = td8.c(LocaleList.getDefault());
                }
                int size = td8VarC.a.a.size();
                ArrayList arrayList = new ArrayList(size);
                while (i2 < size) {
                    Locale localeB = td8VarC.b(i2);
                    localeB.getClass();
                    arrayList.add(new rd8(localeB));
                    i2++;
                }
                return new sd8(arrayList);
            default:
                MotionEvent motionEvent = androidComposeView.C1;
                if (motionEvent != null) {
                    boolean zContains = t72.I(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = androidComposeView.C1;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        i2 = 1;
                    }
                    if (zContains && i2 != 0) {
                        androidComposeView.D1 = SystemClock.uptimeMillis();
                        androidComposeView.post(androidComposeView.K1);
                    }
                }
                androidComposeView.Q1.invoke();
                return wef.a;
        }
    }
}
