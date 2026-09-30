package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r46 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final ww2 f = new ww2(23);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static flb c(RecyclerView recyclerView, int i, long j) {
        int iC = recyclerView.f.C();
        for (int i2 = 0; i2 < iC; i2++) {
            flb flbVarF = RecyclerView.F(recyclerView.f.A(i2));
            if (flbVarF.c == i && !flbVarF.e()) {
                return null;
            }
        }
        gp3 gp3Var = recyclerView.c;
        try {
            recyclerView.M();
            flb flbVarP = gp3Var.p(i, j);
            if (flbVarP != null) {
                if (!flbVarP.d() || flbVarP.e()) {
                    gp3Var.a(flbVarP, false);
                } else {
                    gp3Var.m(flbVarP.a);
                }
            }
            return flbVarP;
        } finally {
            recyclerView.N(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.J0 && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        i12 i12Var = recyclerView.r1;
        i12Var.a = i;
        i12Var.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    public final void b(long j) {
        q46 q46Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        q46 q46Var2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            i12 i12Var = recyclerView3.r1;
            if (windowVisibility == 0) {
                i12Var.c(recyclerView3, false);
                i += i12Var.d;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                i12 i12Var2 = recyclerView4.r1;
                int iAbs = Math.abs(i12Var2.b) + Math.abs(i12Var2.a);
                for (int i5 = 0; i5 < i12Var2.d * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        q46Var2 = new q46();
                        arrayList.add(q46Var2);
                    } else {
                        q46Var2 = (q46) arrayList.get(i3);
                    }
                    int[] iArr = i12Var2.c;
                    int i6 = iArr[i5 + 1];
                    q46Var2.a = i6 <= iAbs;
                    q46Var2.b = iAbs;
                    q46Var2.c = i6;
                    q46Var2.d = recyclerView4;
                    q46Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (q46Var = (q46) arrayList.get(i7)).d) != null; i7++) {
            flb flbVarC = c(recyclerView, q46Var.e, q46Var.a ? Long.MAX_VALUE : j);
            if (flbVarC != null && flbVarC.b != null && flbVarC.d() && !flbVarC.e() && (recyclerView2 = (RecyclerView) flbVarC.b.get()) != null) {
                if (recyclerView2.S0 && recyclerView2.f.C() != 0) {
                    gp3 gp3Var = recyclerView2.c;
                    rkb rkbVar = recyclerView2.b1;
                    if (rkbVar != null) {
                        rkbVar.e();
                    }
                    tkb tkbVar = recyclerView2.E0;
                    if (tkbVar != null) {
                        tkbVar.b0(gp3Var);
                        recyclerView2.E0.c0(gp3Var);
                    }
                    ((ArrayList) gp3Var.c).clear();
                    gp3Var.k();
                }
                i12 i12Var3 = recyclerView2.r1;
                i12Var3.c(recyclerView2, true);
                if (i12Var3.d != 0) {
                    try {
                        int i8 = x0f.a;
                        Trace.beginSection("RV Nested Prefetch");
                        blb blbVar = recyclerView2.s1;
                        nkb nkbVar = recyclerView2.z;
                        blbVar.c = 1;
                        blbVar.d = nkbVar.a();
                        blbVar.f = false;
                        blbVar.g = false;
                        blbVar.h = false;
                        for (int i9 = 0; i9 < i12Var3.d * 2; i9 += 2) {
                            c(recyclerView2, i12Var3.c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = x0f.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            q46Var.a = false;
            q46Var.b = 0;
            q46Var.c = 0;
            q46Var.d = null;
            q46Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = x0f.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
        } finally {
            this.b = 0L;
            int i3 = x0f.a;
            Trace.endSection();
        }
    }
}
