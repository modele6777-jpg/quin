package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pb3 {
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0066->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0083 -> B:25:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:25:0x0066). Please report as a decompilation issue!!! */
    public final Object a(List list, jc3 jc3Var, zn2 zn2Var) throws Throwable {
        mb3 mb3Var;
        List list2;
        Iterator it;
        mmb mmbVar;
        Throwable th;
        a26 a26Var;
        if (zn2Var instanceof mb3) {
            mb3Var = (mb3) zn2Var;
            int i = mb3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mb3Var.label = i - Integer.MIN_VALUE;
            } else {
                mb3Var = new mb3(this, zn2Var);
            }
        } else {
            mb3Var = new mb3(this, zn2Var);
        }
        Object obj = mb3Var.result;
        int i2 = mb3Var.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            ArrayList arrayList = new ArrayList();
            ob3 ob3Var = new ob3(list, arrayList, null);
            mb3Var.L$0 = arrayList;
            mb3Var.label = 1;
            if (jc3Var.a(ob3Var, mb3Var) != obj2) {
                list2 = arrayList;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) mb3Var.L$0;
            jzb.q(obj);
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) mb3Var.L$1;
            mmbVar = (mmb) mb3Var.L$0;
            try {
                jzb.q(obj);
            } catch (Throwable th2) {
                Object obj3 = mmbVar.element;
                if (obj3 == null) {
                    mmbVar.element = th2;
                } else {
                    bzd.m((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            a26Var = (a26) it.next();
            mb3Var.L$0 = mmbVar;
            mb3Var.L$1 = it;
            mb3Var.label = 2;
            if (a26Var.d(mb3Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) mmbVar.element;
        if (th == null) {
            return wef.a;
        }
        throw th;
        mmb mmbVar2 = new mmb();
        it = list2.iterator();
        mmbVar = mmbVar2;
        while (it.hasNext()) {
            a26Var = (a26) it.next();
            mb3Var.L$0 = mmbVar;
            mb3Var.L$1 = it;
            mb3Var.label = 2;
            if (a26Var.d(mb3Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) mmbVar.element;
        if (th == null) {
            return wef.a;
        }
        throw th;
    }
}
