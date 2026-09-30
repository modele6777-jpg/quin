package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h7g implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ n7g a;
    public final /* synthetic */ h8g b;
    public final /* synthetic */ h8g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public h7g(n7g n7gVar, h8g h8gVar, h8g h8gVar2, int i, View view) {
        this.a = n7gVar;
        this.b = h8gVar;
        this.c = h8gVar2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        v7g p7gVar;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        n7g n7gVar = this.a;
        m7g m7gVar = n7gVar.a;
        m7gVar.e(animatedFraction);
        float fC = m7gVar.c();
        PathInterpolator pathInterpolator = j7g.e;
        int i = Build.VERSION.SDK_INT;
        h8g h8gVar = this.b;
        if (i >= 36) {
            p7gVar = new u7g(h8gVar);
        } else if (i >= 35) {
            p7gVar = new t7g(h8gVar);
        } else if (i >= 34) {
            p7gVar = new s7g(h8gVar);
        } else if (i >= 31) {
            p7gVar = new r7g(h8gVar);
        } else if (i >= 30) {
            p7gVar = new q7g(h8gVar);
        } else {
            p7gVar = i >= 29 ? new p7g(h8gVar) : new o7g(h8gVar);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            e8g e8gVar = h8gVar.a;
            if (i3 == 0) {
                p7gVar.d(i2, e8gVar.i(i2));
            } else {
                x47 x47VarI = e8gVar.i(i2);
                x47 x47VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                p7gVar.d(i2, h8g.a(x47VarI, (int) (((double) ((x47VarI.a - x47VarI2.a) * f)) + 0.5d), (int) (((double) ((x47VarI.b - x47VarI2.b) * f)) + 0.5d), (int) (((double) ((x47VarI.c - x47VarI2.c) * f)) + 0.5d), (int) (((double) ((x47VarI.d - x47VarI2.d) * f)) + 0.5d)));
            }
        }
        j7g.h(this.e, p7gVar.b(), Collections.singletonList(n7gVar));
    }
}
