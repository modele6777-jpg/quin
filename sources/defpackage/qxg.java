package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qxg extends oxg {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ ya5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxg(ya5 ya5Var, Activity activity, int i) {
        super((vxg) ya5Var.b, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = activity;
                this.g = ya5Var;
                super((vxg) ya5Var.b, true);
                break;
            case 2:
                this.f = activity;
                this.g = ya5Var;
                super((vxg) ya5Var.b, true);
                break;
            case 3:
                this.f = activity;
                this.g = ya5Var;
                super((vxg) ya5Var.b, true);
                break;
            case 4:
                this.f = activity;
                this.g = ya5Var;
                super((vxg) ya5Var.b, true);
                break;
            default:
                this.f = activity;
                this.g = ya5Var;
                break;
        }
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = ((vxg) this.g.b).f;
                oa7.A(mugVar);
                mugVar.onActivityStartedByScionActivityInfo(iwg.c(this.f), this.b);
                break;
            case 1:
                mug mugVar2 = ((vxg) this.g.b).f;
                oa7.A(mugVar2);
                mugVar2.onActivityResumedByScionActivityInfo(iwg.c(this.f), this.b);
                break;
            case 2:
                mug mugVar3 = ((vxg) this.g.b).f;
                oa7.A(mugVar3);
                mugVar3.onActivityPausedByScionActivityInfo(iwg.c(this.f), this.b);
                break;
            case 3:
                mug mugVar4 = ((vxg) this.g.b).f;
                oa7.A(mugVar4);
                mugVar4.onActivityStoppedByScionActivityInfo(iwg.c(this.f), this.b);
                break;
            default:
                mug mugVar5 = ((vxg) this.g.b).f;
                oa7.A(mugVar5);
                mugVar5.onActivityDestroyedByScionActivityInfo(iwg.c(this.f), this.b);
                break;
        }
    }
}
