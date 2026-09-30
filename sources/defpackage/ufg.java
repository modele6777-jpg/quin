package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.android.play.core.assetpacks.b;
import com.google.android.play.core.assetpacks.d;
import com.google.android.play.core.assetpacks.h;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.l;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ufg implements cfg {
    public final /* synthetic */ int a;
    public final bfg b;
    public final bfg c;
    public final bfg d;

    public ufg(ysd ysdVar) {
        this.a = 0;
        oid oidVar = new oid(7, ysdVar);
        bfg bfgVarB = bfg.b(new xgg(oidVar, 0));
        bfg bfgVarB2 = bfg.b(new lqb(21, oidVar, bfgVarB));
        bfg bfgVarB3 = bfg.b(fgg.a);
        bfg bfgVarB4 = bfg.b(new lqb(22, bfgVarB2, bfgVarB));
        bfg bfgVarB5 = bfg.b(new efg(oidVar, bfgVarB3, bfgVarB4, 0));
        int i = 1;
        bfg bfgVarB6 = bfg.b(new ugg(oidVar, 1));
        yea yeaVar = new yea();
        bfg bfgVarB7 = bfg.b(ghg.a);
        bfg bfgVarB8 = bfg.b(new psd(bfgVarB2, yeaVar, bfgVarB3, bfgVarB7));
        bfg bfgVarB9 = bfg.b(lfg.a);
        bfg bfgVarB10 = bfg.b(new lp0(bfgVarB8, yeaVar, bfg.b(new wfg(bfgVarB2, yeaVar, bfgVarB9, bfgVarB3, bfgVarB4, 0)), bfg.b(new g5b(15, bfgVarB2)), bfg.b(new oid(6, bfgVarB2)), bfg.b(new hbc(bfgVarB2, yeaVar, bfgVarB8, bfgVarB7, bfgVarB3, bfgVarB4)), bfg.b(new vea(25, bfgVarB2, yeaVar)), bfg.b(new wfg(bfgVarB2, yeaVar, bfgVarB8, bfgVarB7, bfgVarB3, 1)), bfg.b(new ufg(bfgVarB8, bfgVarB2, bfg.b(new g5b(14, yeaVar)), 2)), 4));
        bfg bfgVarB11 = bfg.b(tfg.a);
        bfg bfgVarB12 = bfg.b(ihg.a);
        bfg bfgVarB13 = bfg.b(new lp0(oidVar, bfgVarB8, bfgVarB10, yeaVar, bfgVarB3, bfgVarB11, bfgVarB7, bfgVarB12, bfgVarB4, 3));
        bfg bfgVarB14 = bfg.b(new efg(oidVar, bfgVarB5, bfg.b(new hc2(bfgVarB6, bfgVarB13, bfgVarB3, oidVar, bfgVarB, bfgVarB7, bfgVarB4, 10)), 1));
        if (((bfg) yeaVar.a) != null) {
            r3.l();
            throw null;
        }
        yeaVar.a = bfgVarB14;
        bfg bfgVarB15 = bfg.b(new wo0(bfgVarB2, yeaVar, bfgVarB13, bfgVarB9, bfg.b(new oid(5, oidVar)), bfgVarB8, bfgVarB3, bfgVarB11, bfgVarB7, bfgVarB4));
        bfg bfgVarB16 = bfg.b(new vrb(11, oidVar));
        bfg bfgVarB17 = bfg.b(new ugg(oidVar, 0));
        this.b = bfg.b(new a82(oidVar, bfgVarB2, bfgVarB15, bfgVarB16, bfgVarB17, 25));
        this.c = bfg.b(new ufg(bfgVarB8, bfgVarB10, bfgVarB17, i));
        this.d = bfg.b(new di2(bfgVarB8, bfgVarB3, bfgVarB4, bfgVarB11, bfg.b(new xgg(oidVar, 1)), yeaVar, bfgVarB9, bfgVarB12));
    }

    @Override // defpackage.cfg
    public /* bridge */ /* synthetic */ Object a() {
        int i = this.a;
        bfg bfgVar = this.b;
        bfg bfgVar2 = this.c;
        bfg bfgVar3 = this.d;
        switch (i) {
            case 1:
                return new agg((k) bfgVar.a(), (h) bfgVar2.a(), (tgg) bfgVar3.a());
            default:
                return new l((k) bfgVar.a(), (b) bfgVar2.a(), (d) bfgVar3.a());
        }
    }

    public /* synthetic */ ufg(bfg bfgVar, bfg bfgVar2, bfg bfgVar3, int i) {
        this.a = i;
        this.b = bfgVar;
        this.c = bfgVar2;
        this.d = bfgVar3;
    }
}
