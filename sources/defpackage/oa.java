package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.AppSettings;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oa extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(cb cbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oa oaVar = new oa(this.this$0, xn2Var);
        oaVar.L$0 = obj;
        return oaVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:9:0x0031, B:45:0x0127, B:47:0x0140, B:48:0x014a, B:16:0x0057, B:37:0x00ea, B:41:0x010d, B:40:0x00f9, B:19:0x0074, B:33:0x00c6, B:22:0x0080, B:29:0x009e, B:25:0x0089), top: B:65:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:9:0x0031, B:45:0x0127, B:47:0x0140, B:48:0x014a, B:16:0x0057, B:37:0x00ea, B:41:0x010d, B:40:0x00f9, B:19:0x0074, B:33:0x00c6, B:22:0x0080, B:29:0x009e, B:25:0x0089), top: B:65:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x019f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        cb cbVar;
        Throwable thA;
        cb cbVar2;
        cb cbVar3;
        AppSettings appSettings;
        Boolean boolValueOf;
        isa isaVar;
        cb cbVar4;
        AppSettings appSettings2;
        String strD;
        isa isaVar2;
        cb cbVar5;
        AppSettings appSettings3;
        int i;
        String strB0;
        int i2 = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                cb cbVar6 = this.this$0;
                d56 d56Var = cbVar6.a;
                this.L$0 = null;
                this.L$1 = cbVar6;
                this.L$2 = null;
                this.label = 1;
                Object objK = d56Var.k(this);
                if (objK != bw2Var) {
                    cbVar2 = cbVar6;
                    obj = objK;
                }
                return bw2Var;
            }
            if (i2 == 1) {
                cbVar2 = (cb) this.L$1;
                jzb.q(obj);
            } else {
                if (i2 == 2) {
                    AppSettings appSettings4 = (AppSettings) this.L$3;
                    cbVar3 = (cb) this.L$1;
                    jzb.q(obj);
                    appSettings = appSettings4;
                    hs3 hs3Var = xqa.r0;
                    boolValueOf = Boolean.valueOf(appSettings.getEnableYearlySubUnlockAllCards());
                    isaVar = hs3Var.a;
                    this.L$0 = null;
                    this.L$1 = cbVar3;
                    this.L$2 = null;
                    this.L$3 = appSettings;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 3;
                    if (bsa.n(isaVar, boolValueOf, this) == bw2Var) {
                        cbVar4 = cbVar3;
                        appSettings2 = appSettings;
                        hs3 hs3Var2 = xqa.s0;
                        if (appSettings2.getExperimentVariants().isEmpty()) {
                            strD = "";
                        } else {
                            xh7 xh7Var = fzc.a;
                            Map<String, String> experimentVariants = appSettings2.getExperimentVariants();
                            xh7Var.getClass();
                            p4e p4eVar = p4e.a;
                            strD = xh7Var.d(new qh6(p4eVar, p4eVar, 1), experimentVariants);
                        }
                        isaVar2 = hs3Var2.a;
                        this.L$0 = null;
                        this.L$1 = cbVar4;
                        this.L$2 = null;
                        this.L$3 = appSettings2;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.label = 4;
                        if (bsa.n(isaVar2, strD, this) != bw2Var) {
                            cbVar5 = cbVar4;
                            appSettings3 = appSettings2;
                        }
                    }
                    return bw2Var;
                }
                if (i2 == 3) {
                    AppSettings appSettings5 = (AppSettings) this.L$3;
                    cbVar4 = (cb) this.L$1;
                    jzb.q(obj);
                    appSettings2 = appSettings5;
                    hs3 hs3Var3 = xqa.s0;
                    if (appSettings2.getExperimentVariants().isEmpty()) {
                        strD = "";
                    } else {
                        xh7 xh7Var2 = fzc.a;
                        Map<String, String> experimentVariants2 = appSettings2.getExperimentVariants();
                        xh7Var2.getClass();
                        p4e p4eVar2 = p4e.a;
                        strD = xh7Var2.d(new qh6(p4eVar2, p4eVar2, 1), experimentVariants2);
                    }
                    isaVar2 = hs3Var3.a;
                    this.L$0 = null;
                    this.L$1 = cbVar4;
                    this.L$2 = null;
                    this.L$3 = appSettings2;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 4;
                    if (bsa.n(isaVar2, strD, this) != bw2Var) {
                        cbVar5 = cbVar4;
                        appSettings3 = appSettings2;
                    }
                    return bw2Var;
                }
                if (i2 != 4) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AppSettings appSettings6 = (AppSettings) this.L$3;
                cbVar5 = (cb) this.L$1;
                jzb.q(obj);
                appSettings3 = appSettings6;
            }
            String str = appSettings3.getExperimentVariants().get("reading-pack-test-202609");
            int i3 = cb.b;
            cbVar5.getClass();
            i = 0;
            strB0 = pa7.b0(6, str, false);
            if (strB0 != null) {
                x1f.a.f(new ia(strB0, i));
            }
            cbVar5.d().e("Settings fetched: newUserFreeReadingCount=" + appSettings3.getNewUserFreeReadingCount() + ", enableYearlySubUnlockAllCards=" + appSettings3.getEnableYearlySubUnlockAllCards() + ", experimentVariants=" + appSettings3.getExperimentVariants() + ", forceUpdateSince=" + appSettings3.getForceUpdateSince() + ", suggestUpdateSince=" + appSettings3.getSuggestUpdateSince());
            dzbVar = appSettings3;
            cbVar = this.this$0;
            thA = ezb.a(dzbVar);
            if (thA != null) {
                if (!(thA instanceof CancellationException)) {
                    throw thA;
                }
                if (!xo1.C(thA)) {
                    ynb.h0(thA);
                }
                cbVar.d().c("loadAndStoreSettings error", thA);
            }
            if (dzbVar instanceof dzb) {
                return null;
            }
            return dzbVar;
            AppSettings appSettings7 = (AppSettings) obj;
            hs3 hs3Var4 = xqa.q0;
            Integer num = new Integer(appSettings7.getNewUserFreeReadingCount());
            isa isaVar3 = hs3Var4.a;
            this.L$0 = null;
            this.L$1 = cbVar2;
            this.L$2 = null;
            this.L$3 = appSettings7;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.label = 2;
            if (bsa.n(isaVar3, num, this) != bw2Var) {
                cbVar3 = cbVar2;
                appSettings = appSettings7;
                hs3 hs3Var5 = xqa.r0;
                boolValueOf = Boolean.valueOf(appSettings.getEnableYearlySubUnlockAllCards());
                isaVar = hs3Var5.a;
                this.L$0 = null;
                this.L$1 = cbVar3;
                this.L$2 = null;
                this.L$3 = appSettings;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 3;
                if (bsa.n(isaVar, boolValueOf, this) == bw2Var) {
                    cbVar4 = cbVar3;
                    appSettings2 = appSettings;
                    hs3 hs3Var6 = xqa.s0;
                    if (appSettings2.getExperimentVariants().isEmpty()) {
                        strD = "";
                    } else {
                        xh7 xh7Var3 = fzc.a;
                        Map<String, String> experimentVariants3 = appSettings2.getExperimentVariants();
                        xh7Var3.getClass();
                        p4e p4eVar3 = p4e.a;
                        strD = xh7Var3.d(new qh6(p4eVar3, p4eVar3, 1), experimentVariants3);
                    }
                    isaVar2 = hs3Var6.a;
                    this.L$0 = null;
                    this.L$1 = cbVar4;
                    this.L$2 = null;
                    this.L$3 = appSettings2;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 4;
                    if (bsa.n(isaVar2, strD, this) != bw2Var) {
                        cbVar5 = cbVar4;
                        appSettings3 = appSettings2;
                        String str2 = appSettings3.getExperimentVariants().get("reading-pack-test-202609");
                        int i4 = cb.b;
                        cbVar5.getClass();
                        i = 0;
                        strB0 = pa7.b0(6, str2, false);
                        if (strB0 != null) {
                            x1f.a.f(new ia(strB0, i));
                        }
                        cbVar5.d().e("Settings fetched: newUserFreeReadingCount=" + appSettings3.getNewUserFreeReadingCount() + ", enableYearlySubUnlockAllCards=" + appSettings3.getEnableYearlySubUnlockAllCards() + ", experimentVariants=" + appSettings3.getExperimentVariants() + ", forceUpdateSince=" + appSettings3.getForceUpdateSince() + ", suggestUpdateSince=" + appSettings3.getSuggestUpdateSince());
                        dzbVar = appSettings3;
                        cbVar = this.this$0;
                        thA = ezb.a(dzbVar);
                        if (thA != null) {
                            if (!(thA instanceof CancellationException)) {
                                throw thA;
                            }
                            if (!xo1.C(thA)) {
                                ynb.h0(thA);
                            }
                            cbVar.d().c("loadAndStoreSettings error", thA);
                        }
                        if (dzbVar instanceof dzb) {
                            return null;
                        }
                        return dzbVar;
                    }
                }
            }
            return bw2Var;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
