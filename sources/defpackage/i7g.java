package defpackage;

import ai.askquin.R;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i7g implements View.OnApplyWindowInsetsListener {
    public final h72 a;
    public h8g b;

    public i7g(View view, h72 h72Var) {
        h8g h8gVarB;
        this.a = h72Var;
        WeakHashMap weakHashMap = nvf.a;
        h8g h8gVarA = gvf.a(view);
        if (h8gVarA != null) {
            int i = Build.VERSION.SDK_INT;
            h8gVarB = (i >= 36 ? new u7g(h8gVarA) : i >= 35 ? new t7g(h8gVarA) : i >= 34 ? new s7g(h8gVarA) : i >= 31 ? new r7g(h8gVarA) : i >= 30 ? new q7g(h8gVarA) : i >= 29 ? new p7g(h8gVarA) : new o7g(h8gVarA)).b();
        } else {
            h8gVarB = null;
        }
        this.b = h8gVarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = h8g.c(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        h8g h8gVarC = h8g.c(windowInsets, view);
        e8g e8gVar = h8gVarC.a;
        h8g h8gVarA = this.b;
        if (h8gVarA == null) {
            WeakHashMap weakHashMap = nvf.a;
            h8gVarA = gvf.a(view);
            this.b = h8gVarA;
        }
        if (h8gVarA == null) {
            this.b = h8gVarC;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            h72 h72VarJ = j7g.j(view);
            if (h72VarJ == null || !Objects.equals((h8g) h72VarJ.b, h8gVarC)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                h8g h8gVar = this.b;
                int i = 1;
                while (i <= 512) {
                    x47 x47VarI = e8gVar.i(i);
                    x47 x47VarI2 = h8gVar.a.i(i);
                    int i2 = x47VarI.a;
                    int i3 = x47VarI.d;
                    int i4 = x47VarI.c;
                    int i5 = x47VarI.b;
                    int i6 = x47VarI2.a;
                    int i7 = x47VarI2.d;
                    int[] iArr3 = iArr;
                    int i8 = x47VarI2.c;
                    int i9 = x47VarI2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = h8gVarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    h8g h8gVar2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = j7g.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = j7g.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = j7g.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? j7g.h : null;
                    }
                    n7g n7gVar = new n7g(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    n7gVar.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(n7gVar.a.b());
                    x47 x47VarI3 = e8gVar.i(i12);
                    x47 x47VarI4 = h8gVar2.a.i(i12);
                    int iMin = Math.min(x47VarI3.a, x47VarI4.a);
                    int i13 = x47VarI3.b;
                    int i14 = x47VarI4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = x47VarI3.c;
                    int i16 = x47VarI4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = x47VarI3.d;
                    int i18 = x47VarI4.d;
                    lqb lqbVar = new lqb(19, x47.b(iMin, iMin2, iMin3, Math.min(i17, i18)), x47.b(Math.max(x47VarI3.a, x47VarI4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
                    j7g.g(view, n7gVar, h8gVarC, false);
                    duration.addUpdateListener(new h7g(n7gVar, h8gVarC, h8gVar2, i12, view));
                    duration.addListener(new rwf(n7gVar, view, 1));
                    qu1 qu1Var = new qu1(view, n7gVar, lqbVar, duration, false, 2);
                    if (view != null) {
                        aq9 aq9Var = new aq9(view, qu1Var);
                        view.getViewTreeObserver().addOnPreDrawListener(aq9Var);
                        view.addOnAttachStateChangeListener(aq9Var);
                    } else {
                        r82.g("view == null");
                    }
                    this.b = h8gVarC;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
