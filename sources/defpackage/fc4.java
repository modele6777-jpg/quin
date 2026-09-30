package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import java.time.Instant;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fc4 {
    public final String a;
    public final Instant b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fc4(String str, int i) {
        str = (i & 1) != 0 ? ib8.i() : str;
        Instant instantNow = Instant.now();
        instantNow.getClass();
        this(str, instantNow);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8 A[PHI: r1
  0x00c8: PHI (r1v29 java.lang.String) = (r1v28 java.lang.String), (r1v32 java.lang.String), (r1v34 java.lang.String), (r1v35 java.lang.String) binds: [B:45:0x009b, B:53:0x00b4, B:57:0x00be, B:61:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    public final yc4 a(jd4 jd4Var, Instant instant, List list, Operation operation, FailReason failReason, Operation operation2, boolean z, SceneTarot sceneTarot, InterruptedDrawing interruptedDrawing, String str, String str2, List list2, Integer num, Instant instant2, boolean z2, cm4 cm4Var, PhysicalDeckReading physicalDeckReading, List list3, QuotaBlockReason quotaBlockReason) {
        Object next;
        String strY;
        String str3;
        String str4;
        Instant instant3;
        jd4Var.getClass();
        list.getClass();
        list3.getClass();
        List listJ1 = s72.j1(list);
        Iterator it = listJ1.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((ot8) next) instanceof nt8));
        nt8 nt8Var = next instanceof nt8 ? (nt8) next : null;
        Instant instantNow = Instant.now();
        instantNow.getClass();
        Instant instant4 = (cm4Var == null || (instant3 = cm4Var.e) == null) ? instant : instant3;
        boolean z3 = jd4Var instanceof zc4;
        Instant instant5 = this.b;
        if (z3) {
            strY = nk8.y((zc4) jd4Var, instant5);
        } else if (jd4Var instanceof ad4) {
            strY = nk8.y(((ad4) jd4Var).a, instant5);
        } else if (jd4Var instanceof bd4) {
            strY = nk8.y(((ad4) ((bd4) jd4Var).b).a, instant5);
        } else if (jd4Var instanceof gd4) {
            strY = ((gd4) jd4Var).d;
        } else if (jd4Var instanceof fd4) {
            strY = ((fd4) jd4Var).a.d;
        } else {
            if (!(jd4Var instanceof hd4) && !(jd4Var instanceof id4) && !(jd4Var instanceof cd4)) {
                ap.c();
                return null;
            }
            strY = null;
        }
        if (strY != null) {
            str3 = strY;
        } else {
            if (cm4Var == null || (str4 = cm4Var.b) == null) {
                strY = null;
            } else {
                ale.a.getClass();
                ale aleVarH = pzd.h(str4);
                if (aleVarH != null) {
                    strY = aleVarH.j();
                } else {
                    strY = null;
                }
            }
            if (strY != null) {
                str3 = strY;
            } else {
                strY = sceneTarot != null ? sceneTarot.getPattern() : null;
                if (strY != null) {
                    str3 = strY;
                } else {
                    String str5 = nt8Var != null ? nt8Var.a : null;
                    if (str5 == null) {
                        strY = "Untitled";
                        str3 = strY;
                    } else {
                        str3 = str5;
                    }
                }
            }
        }
        return new yc4(this.a, z2, this.b, instantNow, instant4, str3, listJ1.size(), new fb4(jd4Var, listJ1, operation, failReason, operation2, list3, quotaBlockReason, cm4Var, 256), z, sceneTarot, interruptedDrawing, str, str2, list2, num, instant2, null, null, physicalDeckReading, 3866624);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc4)) {
            return false;
        }
        fc4 fc4Var = (fc4) obj;
        return pa7.t(this.a, fc4Var.a) && pa7.t(this.b, fc4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivinationKey(id=" + this.a + ", createAt=" + this.b + ")";
    }

    public fc4(String str, Instant instant) {
        str.getClass();
        instant.getClass();
        this.a = str;
        this.b = instant;
    }
}
