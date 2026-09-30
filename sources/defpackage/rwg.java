package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rwg extends oxg {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ vxg v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg(vxg vxgVar, String str, String str2, Bundle bundle) {
        super(vxgVar, true);
        this.f = str;
        this.g = str2;
        this.w = bundle;
        Objects.requireNonNull(vxgVar);
        this.v = vxgVar;
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = this.v.f;
                oa7.A(mugVar);
                mugVar.clearConditionalUserProperty(this.f, this.g, (Bundle) this.w);
                break;
            case 1:
                mug mugVar2 = this.v.f;
                oa7.A(mugVar2);
                mugVar2.getConditionalUserProperties(this.f, this.g, (fug) this.w);
                break;
            default:
                mug mugVar3 = this.v.f;
                oa7.A(mugVar3);
                mugVar3.setCurrentScreenByScionActivityInfo((iwg) this.w, this.f, this.g, this.a);
                break;
        }
    }

    @Override // defpackage.oxg
    public void b() {
        switch (this.e) {
            case 1:
                ((fug) this.w).x(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg(vxg vxgVar, String str, String str2, fug fugVar) {
        super(vxgVar, true);
        this.f = str;
        this.g = str2;
        this.w = fugVar;
        Objects.requireNonNull(vxgVar);
        this.v = vxgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg(vxg vxgVar, iwg iwgVar, String str, String str2) {
        super(vxgVar, true);
        this.w = iwgVar;
        this.f = str;
        this.g = str2;
        Objects.requireNonNull(vxgVar);
        this.v = vxgVar;
    }
}
