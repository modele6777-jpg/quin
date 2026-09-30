package defpackage;

import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.f;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.p;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wfg implements cfg {
    public final /* synthetic */ int a;
    public final bfg b;
    public final yea c;
    public final bfg d;
    public final bfg e;
    public final bfg f;

    public /* synthetic */ wfg(bfg bfgVar, yea yeaVar, bfg bfgVar2, bfg bfgVar3, bfg bfgVar4, int i) {
        this.a = i;
        this.b = bfgVar;
        this.c = yeaVar;
        this.d = bfgVar2;
        this.e = bfgVar3;
        this.f = bfgVar4;
    }

    @Override // defpackage.cfg
    public final Object a() {
        int i = this.a;
        bfg bfgVar = this.f;
        bfg bfgVar2 = this.e;
        bfg bfgVar3 = this.d;
        yea yeaVar = this.c;
        bfg bfgVar4 = this.b;
        switch (i) {
            case 0:
                Object objA = bfgVar4.a();
                return new f((b) objA, new bfg(new fnb(yeaVar)), new bfg(new fnb(bfgVar3)), (egg) bfgVar2.a(), (vgg) bfgVar.a());
            default:
                Object objA2 = bfgVar4.a();
                return new p((b) objA2, new bfg(new fnb(yeaVar)), (k) bfgVar3.a(), new bfg(new fnb(bfgVar2)), (egg) bfgVar.a());
        }
    }
}
