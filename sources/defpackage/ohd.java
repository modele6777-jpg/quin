package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ohd {
    public final a26 a;
    public final l26 b;

    public ohd() {
        jhd jhdVar = new jhd(1, null);
        v5c v5cVar = new v5c(2, ypa.a, ypa.class, "edit", "edit(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
        this.a = jhdVar;
        this.b = v5cVar;
    }

    public static List a(p79 p79Var) {
        String str = (String) p79Var.c(xqa.I.a);
        if (str == null) {
            str = "";
        }
        if (v4e.Q(str)) {
            return pu4.a;
        }
        vg7 vg7Var = wg7.d;
        vg7Var.getClass();
        Iterable iterable = (Iterable) vg7Var.b(new dd0(s7a.Companion.serializer(), 0), str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e((s7a) it.next());
        }
        return (List) iterable;
    }

    public static void e(s7a s7aVar) {
        if (v4e.Q(s7aVar.a)) {
            qc0.j("Failed requirement.");
            return;
        }
        if (!pa7.t(s7aVar.b.get("uid"), s7aVar.a)) {
            qc0.j("Failed requirement.");
        } else if (v4e.Q(s7aVar.d)) {
            qc0.j("Failed requirement.");
        } else if (s7aVar.f.isEmpty()) {
            qc0.j("Failed requirement.");
        }
    }

    public static void f(p79 p79Var, ArrayList arrayList) {
        isa isaVar = xqa.I.a;
        if (arrayList.isEmpty()) {
            p79Var.d(isaVar);
            return;
        }
        vg7 vg7Var = wg7.d;
        vg7Var.getClass();
        String strD = vg7Var.d(new dd0(s7a.Companion.serializer(), 0), arrayList);
        p79Var.getClass();
        p79Var.f(isaVar, strD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(s7a s7aVar, zn2 zn2Var) {
        khd khdVar;
        imb imbVar;
        if (zn2Var instanceof khd) {
            khdVar = (khd) zn2Var;
            int i = khdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                khdVar.label = i - Integer.MIN_VALUE;
            } else {
                khdVar = new khd(this, zn2Var);
            }
        } else {
            khdVar = new khd(this, zn2Var);
        }
        Object obj = khdVar.result;
        int i2 = khdVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            s7a s7aVarA = s7a.a(s7aVar, bm8.X(s7aVar.b), s72.o1(s7aVar.f), 29);
            e(s7aVarA);
            imb imbVar2 = new imb();
            lhd lhdVar = new lhd(s7aVarA, this, imbVar2, null);
            khdVar.L$0 = null;
            khdVar.L$1 = null;
            khdVar.L$2 = imbVar2;
            khdVar.label = 1;
            Object objZ = this.b.z(lhdVar, khdVar);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
            imbVar = imbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imbVar = (imb) khdVar.L$2;
            jzb.q(obj);
        }
        return Boolean.valueOf(imbVar.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        mhd mhdVar;
        if (zn2Var instanceof mhd) {
            mhdVar = (mhd) zn2Var;
            int i = mhdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhdVar.label = i - Integer.MIN_VALUE;
            } else {
                mhdVar = new mhd(this, zn2Var);
            }
        } else {
            mhdVar = new mhd(this, zn2Var);
        }
        Object objD = mhdVar.result;
        int i2 = mhdVar.label;
        if (i2 == 0) {
            jzb.q(objD);
            mhdVar.L$0 = this;
            mhdVar.label = 1;
            objD = this.a.d(mhdVar);
            bw2 bw2Var = bw2.a;
            if (objD == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (ohd) mhdVar.L$0;
            jzb.q(objD);
        }
        this.getClass();
        return s72.b1(a((p79) objD), new kv8(13));
    }

    public final Object d(String str, vhd vhdVar, ahd ahdVar) {
        if (v4e.Q(str)) {
            qc0.j("Failed requirement.");
            return null;
        }
        Object objZ = this.b.z(new nhd(this, str, vhdVar, null), ahdVar);
        return objZ == bw2.a ? objZ : wef.a;
    }
}
