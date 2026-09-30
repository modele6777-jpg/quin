package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qwg extends oxg {
    public final /* synthetic */ int e;
    public final /* synthetic */ vxg f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwg(vxg vxgVar, Bundle bundle) {
        super(vxgVar, true);
        this.e = 0;
        this.g = bundle;
        Objects.requireNonNull(vxgVar);
        this.f = vxgVar;
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = this.f.f;
                oa7.A(mugVar);
                mugVar.setConditionalUserProperty((Bundle) this.g, this.a);
                break;
            case 1:
                mug mugVar2 = this.f.f;
                oa7.A(mugVar2);
                mugVar2.setMeasurementEnabled(((Boolean) this.g).booleanValue(), this.a);
                break;
            case 2:
                mug mugVar3 = this.f.f;
                oa7.A(mugVar3);
                mugVar3.retrieveAndUploadBatches(new bxg(this, (w36) this.g));
                break;
            case 3:
                mug mugVar4 = this.f.f;
                oa7.A(mugVar4);
                mugVar4.logHealthData(5, "Error with data collection. Data lost.", new tk9((Exception) this.g), new tk9(null), new tk9(null));
                break;
            default:
                mug mugVar5 = this.f.f;
                oa7.A(mugVar5);
                mugVar5.registerOnMeasurementEventListener((pxg) this.g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qwg(vxg vxgVar, Object obj, int i) {
        super(vxgVar, true);
        this.e = i;
        this.g = obj;
        this.f = vxgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwg(vxg vxgVar, Boolean bool) {
        super(vxgVar, true);
        this.e = 1;
        this.g = bool;
        Objects.requireNonNull(vxgVar);
        this.f = vxgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwg(vxg vxgVar, Exception exc) {
        super(vxgVar, false);
        this.e = 3;
        this.g = exc;
        this.f = vxgVar;
    }
}
