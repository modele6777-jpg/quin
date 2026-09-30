package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rw8 {
    public final xof a;
    public final q9b b;
    public final cx8 c;
    public final whb d;

    public rw8(xof xofVar, q9b q9bVar, cx8 cx8Var) {
        this.a = xofVar;
        this.b = q9bVar;
        this.c = cx8Var;
        this.d = cx8Var.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(zn2 zn2Var) {
        lw8 lw8Var;
        Instant instantExpiredAt;
        u7e u7eVarM35getSubscriptionType;
        q0e q0eVar = this.d.a;
        if (zn2Var instanceof lw8) {
            lw8Var = (lw8) zn2Var;
            int i = lw8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lw8Var.label = i - Integer.MIN_VALUE;
            } else {
                lw8Var = new lw8(this, zn2Var);
            }
        } else {
            lw8Var = new lw8(this, zn2Var);
        }
        Object objB = lw8Var.result;
        int i2 = lw8Var.label;
        g7e g7eVarE = null;
        if (i2 == 0) {
            jzb.q(objB);
            wj5 wj5Var = this.a.b;
            lw8Var.label = 1;
            objB = tm7.B(wj5Var, lw8Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        yof yofVar = (yof) objB;
        QuotaUsage quotaUsageB = ((eab) this.b).b();
        SubscriptionInfo subscription = quotaUsageB != null ? quotaUsageB.getSubscription() : null;
        if (subscription != null && (u7eVarM35getSubscriptionType = subscription.m35getSubscriptionType()) != null) {
            g7eVarE = u7eVarM35getSubscriptionType.e();
        }
        boolean z = g7eVarE == g7e.d && (instantExpiredAt = subscription.expiredAt()) != null && instantExpiredAt.isAfter(Instant.now());
        mfc mfcVarC = k8b.c();
        Set setO1 = s72.o1(r8c.c(mfcVarC));
        List<TarotSkinIdentify> listM = r8c.m(yofVar.f);
        ArrayList arrayList = new ArrayList(t72.u(listM, 10));
        for (TarotSkinIdentify tarotSkinIdentifyE : listM) {
            tarotSkinIdentifyE.getClass();
            if (r8c.k(tarotSkinIdentifyE)) {
                tarotSkinIdentifyE = r8c.e(mfcVarC);
            }
            arrayList.add(tarotSkinIdentifyE);
        }
        Set setO2 = s72.o1(arrayList);
        uw8 uw8Var = new uw8(setO1, setO2, iw8.a);
        return new hw8(new tw8(setO2.size(), z, quotaUsageB != null && quotaUsageB.getHasPurchasedAllTarotCards()), uw8Var, this.c.a(uw8Var.a()), yofVar.g.name(), ((sw8) q0eVar.getValue()).c, ((sw8) q0eVar.getValue()).a == gmd.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zn2 zn2Var) {
        mw8 mw8Var;
        zw8 zw8Var;
        if (zn2Var instanceof mw8) {
            mw8Var = (mw8) zn2Var;
            int i = mw8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mw8Var.label = i - Integer.MIN_VALUE;
            } else {
                mw8Var = new mw8(this, zn2Var);
            }
        } else {
            mw8Var = new mw8(this, zn2Var);
        }
        Object obj = mw8Var.result;
        int i2 = mw8Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            zw8 zw8Var2 = zw8.a;
            wj5 wj5Var = this.a.b;
            mw8Var.L$0 = zw8Var2;
            mw8Var.label = 1;
            Object objB = tm7.B(wj5Var, mw8Var);
            if (objB != bw2Var) {
                obj = objB;
                zw8Var = zw8Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zw8Var = (zw8) mw8Var.L$0;
        jzb.q(obj);
        String strName = ((yof) obj).g.name();
        mw8Var.L$0 = null;
        mw8Var.label = 2;
        zw8Var.getClass();
        Object objA = ypa.a.a(new vw8(strName, null), mw8Var);
        return objA == bw2Var ? bw2Var : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:91:0x022e  */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0262, code lost:
    
        if (defpackage.zw8.b(r0, r2) == r8) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r17, defpackage.zn2 r18) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw8.c(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zn2 zn2Var) {
        ow8 ow8Var;
        Object objA;
        if (zn2Var instanceof ow8) {
            ow8Var = (ow8) zn2Var;
            int i = ow8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow8Var.label = i - Integer.MIN_VALUE;
            } else {
                ow8Var = new ow8(this, zn2Var);
            }
        } else {
            ow8Var = new ow8(this, zn2Var);
        }
        Object objA2 = ow8Var.result;
        int i2 = ow8Var.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objA2);
            ow8Var.label = 1;
            objA2 = a(ow8Var);
            if (objA2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            jzb.q(objA2);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objA2);
                return objA2;
            }
            jzb.q(objA2);
        }
        ow8Var.L$0 = null;
        ow8Var.label = 3;
        objA = a(ow8Var);
        if (objA == obj) {
            return obj;
        }
        return objA;
        hw8 hw8Var = (hw8) objA2;
        if (hw8Var.a.a()) {
            js3 js3Var = ga4.a;
            wg6 wg6Var = mk8.a.f;
            pw8 pw8Var = new pw8(this, hw8Var, null);
            ow8Var.L$0 = null;
            ow8Var.label = 2;
            if (ynb.p0(wg6Var, pw8Var, ow8Var) != obj) {
                ow8Var.L$0 = null;
                ow8Var.label = 3;
                objA = a(ow8Var);
                if (objA == obj) {
                    return objA;
                }
            }
        } else {
            ow8Var.L$0 = null;
            ow8Var.label = 3;
            objA = a(ow8Var);
            if (objA == obj) {
                return objA;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) {
        qw8 qw8Var;
        if (zn2Var instanceof qw8) {
            qw8Var = (qw8) zn2Var;
            int i = qw8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qw8Var.label = i - Integer.MIN_VALUE;
            } else {
                qw8Var = new qw8(this, zn2Var);
            }
        } else {
            qw8Var = new qw8(this, zn2Var);
        }
        Object obj = qw8Var.result;
        int i2 = qw8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            qw8Var.label = 1;
            Object objD = d(qw8Var);
            Object obj2 = bw2.a;
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
