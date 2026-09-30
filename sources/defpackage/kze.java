package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kze {
    public static final kze a = new kze();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(int i, int i2, zn2 zn2Var) {
        gze gzeVar;
        Serializable dzbVar;
        if (zn2Var instanceof gze) {
            gzeVar = (gze) zn2Var;
            int i3 = gzeVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gzeVar.label = i3 - Integer.MIN_VALUE;
            } else {
                gzeVar = new gze(this, zn2Var);
            }
        } else {
            gzeVar = new gze(this, zn2Var);
        }
        Object obj = gzeVar.result;
        int i4 = gzeVar.label;
        try {
            if (i4 == 0) {
                jzb.q(obj);
                ypa ypaVar = ypa.a;
                hze hzeVar = new hze(i, i2, null);
                gzeVar.L$0 = null;
                gzeVar.I$0 = i;
                gzeVar.I$1 = i2;
                gzeVar.label = 1;
                Object objA = ypaVar.a(hzeVar, gzeVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i4 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = Boolean.TRUE;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        hf8.Q.getClass();
        ef8.a("TomorrowReminderGuideCohort").c("Failed to capture launch cohort", thA);
        return Boolean.FALSE;
    }
}
