package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sha extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ oha b;
    public final /* synthetic */ tha c;

    public /* synthetic */ sha(tha thaVar, oha ohaVar, int i) {
        this.a = i;
        this.c = thaVar;
        this.b = ohaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        oha ohaVar = this.b;
        tha thaVar = this.c;
        switch (i) {
            case 0:
                thaVar.i(1);
                if (thaVar.C) {
                    ohaVar.post(thaVar.t);
                    thaVar.C = false;
                }
                break;
            case 1:
                thaVar.i(2);
                if (thaVar.C) {
                    ohaVar.post(thaVar.t);
                    thaVar.C = false;
                }
                break;
            default:
                thaVar.i(2);
                if (thaVar.C) {
                    ohaVar.post(thaVar.t);
                    thaVar.C = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        tha thaVar = this.c;
        switch (i) {
            case 0:
                thaVar.i(3);
                break;
            case 1:
                thaVar.i(3);
                break;
            default:
                thaVar.i(3);
                break;
        }
    }
}
