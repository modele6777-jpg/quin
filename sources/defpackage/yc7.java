package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.RedeemPopup;
import tech.chatmind.api.RedeemResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yc7 extends gcg {
    public static final /* synthetic */ int Z = 0;
    public final vz9 X;
    public final vz9 Y;
    public final emb d;
    public final t7 e;
    public final fab f;
    public final q9b g;
    public final rlb v;
    public final l26 w;
    public final l26 x;
    public final vz9 y;
    public final vz9 z;

    public yc7(emb embVar, t7 t7Var, fab fabVar, q9b q9bVar, rlb rlbVar) {
        sz5 sz5Var = new sz5(14);
        sz5 sz5Var2 = new sz5(15);
        this.d = embVar;
        this.e = t7Var;
        this.f = fabVar;
        this.g = q9bVar;
        this.v = rlbVar;
        this.w = sz5Var;
        this.x = sz5Var2;
        this.y = q1c.f(null);
        this.z = q1c.f(l8e.a);
        this.X = q1c.f(r96.a);
        this.Y = q1c.f(null);
    }

    public static String i(String str) {
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < upperCase.length(); i++) {
            char cCharAt = upperCase.charAt(i);
            if (cCharAt != '-') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
    
        if (h(r11, r0) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0144, code lost:
    
        if (defpackage.vfh.q(800, r0) == r8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0146, code lost:
    
        return r8;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00fd, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r10, tech.chatmind.api.RedeemResponse r11, defpackage.x16 r12, defpackage.zn2 r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc7.g(java.lang.String, tech.chatmind.api.RedeemResponse, x16, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [yc7] */
    /* JADX WARN: Type inference failed for: r4v1, types: [hf8] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tech.chatmind.api.RedeemResponse] */
    /* JADX WARN: Type inference failed for: r5v1, types: [tech.chatmind.api.RedeemResponse] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object h(RedeemResponse redeemResponse, zn2 zn2Var) {
        tc7 tc7Var;
        if (zn2Var instanceof tc7) {
            tc7Var = (tc7) zn2Var;
            int i = tc7Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc7Var.label = i - Integer.MIN_VALUE;
            } else {
                tc7Var = new tc7(this, zn2Var);
            }
        } else {
            tc7Var = new tc7(this, zn2Var);
        }
        Object obj = tc7Var.result;
        int i2 = tc7Var.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                rlb rlbVar = this.v;
                tc7Var.L$0 = redeemResponse;
                tc7Var.label = 1;
                Object objA = ((tlb) rlbVar).a(redeemResponse, tc7Var);
                bw2 bw2Var = bw2.a;
                this = objA;
                redeemResponse = bw2Var;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                RedeemResponse redeemResponse2 = (RedeemResponse) tc7Var.L$0;
                jzb.q(obj);
                this = this;
                redeemResponse = redeemResponse2;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.d().h("Redeem entitlement refresh failed; benefitType=" + redeemResponse.getBenefitType(), e2);
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    public final void k(RedeemResponse redeemResponse) {
        List<String> tarotIds;
        RedeemPopup popup = redeemResponse.getPopup();
        if (popup == null) {
            d().g("Redeem success without popup; type=" + redeemResponse.getType());
            return;
        }
        String type = redeemResponse.getType();
        qlb nlbVar = null;
        nlbVar = null;
        nlbVar = null;
        if (!pa7.t(redeemResponse.getType(), "double-1-week") && !pa7.t(redeemResponse.getType(), "gift-card")) {
            boolean zT = pa7.t(redeemResponse.getType(), "redeem-code");
            olb olbVar = olb.a;
            if (zT) {
                String benefitType = redeemResponse.getBenefitType();
                if (benefitType != null) {
                    int iHashCode = benefitType.hashCode();
                    if (iHashCode != -1354575548) {
                        if (iHashCode != -895684237) {
                            if (iHashCode == 110131274 && benefitType.equals("tarot") && ((tarotIds = redeemResponse.getTarotIds()) == null || !tarotIds.isEmpty())) {
                                List<String> tarotIds2 = redeemResponse.getTarotIds();
                                nlbVar = new nlb(tarotIds2 != null ? (String) s72.x0(tarotIds2) : null);
                            } else {
                                nlbVar = olbVar;
                            }
                        } else if (benefitType.equals("spread")) {
                            String spreadId = redeemResponse.getSpreadId();
                            if (s72.o0(jlb.a, spreadId)) {
                                nlbVar = mlb.a;
                            } else if (pa7.t(spreadId, "yearly-2026")) {
                                nlbVar = plb.a;
                            } else {
                                nlbVar = olbVar;
                            }
                        } else {
                            nlbVar = olbVar;
                        }
                    } else if (benefitType.equals("counts")) {
                        nlbVar = llb.a;
                    } else {
                        nlbVar = olbVar;
                    }
                }
            } else {
                nlbVar = olbVar;
            }
        }
        this.z.setValue(new m8e(popup, type, nlbVar));
    }
}
