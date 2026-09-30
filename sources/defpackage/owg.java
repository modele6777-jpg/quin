package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class owg extends oxg {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ vxg w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owg(vxg vxgVar, String str, String str2, Object obj, boolean z) {
        super(vxgVar, true);
        this.f = str;
        this.g = str2;
        this.x = obj;
        this.v = z;
        Objects.requireNonNull(vxgVar);
        this.w = vxgVar;
    }

    @Override // defpackage.oxg
    public final void a() {
        switch (this.e) {
            case 0:
                mug mugVar = this.w.f;
                oa7.A(mugVar);
                mugVar.setUserProperty(this.f, this.g, new tk9(this.x), this.v, this.a);
                break;
            case 1:
                mug mugVar2 = this.w.f;
                oa7.A(mugVar2);
                mugVar2.getUserProperties(this.f, this.g, this.v, (fug) this.x);
                break;
            default:
                long j = this.a;
                long j2 = this.b;
                mug mugVar3 = this.w.f;
                oa7.A(mugVar3);
                mugVar3.logEventWithElapsedTime(this.f, this.g, (Bundle) this.x, this.v, true, j, j2);
                break;
        }
    }

    @Override // defpackage.oxg
    public void b() {
        switch (this.e) {
            case 1:
                ((fug) this.x).x(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owg(vxg vxgVar, String str, String str2, Bundle bundle, boolean z) {
        super(vxgVar, true);
        this.f = str;
        this.g = str2;
        this.x = bundle;
        this.v = z;
        this.w = vxgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owg(vxg vxgVar, String str, String str2, boolean z, fug fugVar) {
        super(vxgVar, true);
        this.f = str;
        this.g = str2;
        this.v = z;
        this.x = fugVar;
        Objects.requireNonNull(vxgVar);
        this.w = vxgVar;
    }
}
