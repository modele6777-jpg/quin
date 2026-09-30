package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ps4 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 27, 27, 27);
    public static qs4 c;

    public static void a(vb2 vb2Var, dce dceVar, int i) {
        dce dceVar2;
        int i2 = 23;
        int i3 = 0;
        dce dceVar3 = new dce(0, 0, new znd(i2));
        if ((i & 2) != 0) {
            dceVar2 = new dce(a, b, new znd(i2));
        } else {
            dceVar2 = dceVar;
        }
        View decorView = vb2Var.getWindow().getDecorView();
        decorView.getClass();
        qs4 rs4Var = c;
        if (rs4Var == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 35) {
                rs4Var = new us4();
            } else if (i4 >= 30) {
                rs4Var = new ts4();
            } else if (i4 >= 29) {
                rs4Var = new ss4();
            } else {
                rs4Var = i4 >= 28 ? new rs4() : new qs4();
            }
            c = rs4Var;
        }
        qs4 qs4Var = rs4Var;
        ns4 ns4Var = new ns4(qs4Var, dceVar3, dceVar2, vb2Var, decorView, 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (i3 < viewGroup.getChildCount()) {
            int i5 = i3 + 1;
            View childAt = viewGroup.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof qs4) {
                ns4Var.run();
                Window window = vb2Var.getWindow();
                window.getClass();
                qs4Var.a(window);
            }
            i3 = i5;
        }
        os4 os4Var = new os4(ns4Var, viewGroup.getContext());
        os4Var.setTag(qs4Var);
        os4Var.setVisibility(8);
        os4Var.setWillNotDraw(true);
        viewGroup.addView(os4Var);
        ns4Var.run();
        Window window2 = vb2Var.getWindow();
        window2.getClass();
        qs4Var.a(window2);
    }
}
