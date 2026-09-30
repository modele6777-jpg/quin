package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.aic;
import defpackage.blb;
import defpackage.gp3;
import defpackage.gt4;
import defpackage.gyd;
import defpackage.hyd;
import defpackage.i12;
import defpackage.ipd;
import defpackage.iw7;
import defpackage.iyd;
import defpackage.jyd;
import defpackage.ks0;
import defpackage.lqb;
import defpackage.nvf;
import defpackage.qc0;
import defpackage.skb;
import defpackage.tkb;
import defpackage.ukb;
import defpackage.wwg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends tkb {
    public final lqb A;
    public final int B;
    public boolean C;
    public boolean D;
    public jyd E;
    public final Rect F;
    public final gyd G;
    public final boolean H;
    public int[] I;
    public final wwg J;
    public final int o;
    public final ipd[] p;
    public final gt4 q;
    public final gt4 r;
    public final int s;
    public int t;
    public final iw7 u;
    public boolean v;
    public final BitSet x;
    public boolean w = false;
    public int y = -1;
    public int z = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.o = -1;
        this.v = false;
        lqb lqbVar = new lqb(8, false);
        this.A = lqbVar;
        this.B = 2;
        this.F = new Rect();
        this.G = new gyd(this);
        this.H = true;
        this.J = new wwg(24, this);
        skb skbVarC = tkb.C(context, attributeSet, i, i2);
        int i3 = skbVarC.a;
        if (i3 != 0 && i3 != 1) {
            qc0.j("invalid orientation.");
            throw null;
        }
        b(null);
        if (i3 != this.s) {
            this.s = i3;
            gt4 gt4Var = this.q;
            this.q = this.r;
            this.r = gt4Var;
            g0();
        }
        int i4 = skbVarC.b;
        b(null);
        if (i4 != this.o) {
            lqbVar.c();
            g0();
            this.o = i4;
            this.x = new BitSet(this.o);
            this.p = new ipd[this.o];
            for (int i5 = 0; i5 < this.o; i5++) {
                this.p[i5] = new ipd(this, i5);
            }
            g0();
        }
        boolean z = skbVarC.c;
        b(null);
        jyd jydVar = this.E;
        if (jydVar != null && jydVar.v != z) {
            jydVar.v = z;
        }
        this.v = z;
        g0();
        iw7 iw7Var = new iw7();
        iw7Var.a = true;
        iw7Var.f = 0;
        iw7Var.g = 0;
        this.u = iw7Var;
        this.q = gt4.b(this, this.s);
        this.r = gt4.b(this, 1 - this.s);
    }

    public static int S0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public final int A0() {
        int iU = u();
        if (iU == 0) {
            return 0;
        }
        return tkb.B(t(iU - 1));
    }

    public final int B0(int i) {
        int iG = this.p[0].g(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int iG2 = this.p[i2].g(i);
            if (iG2 > iG) {
                iG = iG2;
            }
        }
        return iG;
    }

    public final int C0(int i) {
        int iJ = this.p[0].j(i);
        for (int i2 = 1; i2 < this.o; i2++) {
            int iJ2 = this.p[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[LOOP:0: B:23:0x003c->B:27:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[LOOP:1: B:32:0x0063->B:36:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0051 A[EDGE_INSN: B:62:0x0051->B:29:0x0051 BREAK  A[LOOP:0: B:23:0x003c->B:27:0x004d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0078 A[EDGE_INSN: B:64:0x0078->B:38:0x0078 BREAK  A[LOOP:1: B:32:0x0063->B:36:0x0074], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public final void D0(int i, int i2, int i3) {
        int i4;
        int i5;
        lqb lqbVar;
        int[] iArr;
        int iA0;
        ArrayList arrayList;
        int size;
        iyd iydVar;
        int size2;
        int i6;
        int i7;
        int[] iArr2;
        int iA1 = this.w ? A0() : z0();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            lqbVar = this.A;
            iArr = (int[]) lqbVar.b;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) lqbVar.c;
                if (arrayList == null) {
                    i7 = -1;
                } else {
                    size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            iydVar = null;
                            break;
                        }
                        iydVar = (iyd) ((ArrayList) lqbVar.c).get(size);
                        if (iydVar.a == i5) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (iydVar != null) {
                        ((ArrayList) lqbVar.c).remove(iydVar);
                    }
                    size2 = ((ArrayList) lqbVar.c).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size2) {
                            i6 = -1;
                            break;
                        } else if (((iyd) ((ArrayList) lqbVar.c).get(i6)).a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        iyd iydVar2 = (iyd) ((ArrayList) lqbVar.c).get(i6);
                        ((ArrayList) lqbVar.c).remove(i6);
                        i7 = iydVar2.a;
                    } else {
                        i7 = -1;
                    }
                }
                iArr2 = (int[]) lqbVar.b;
                if (i7 == -1) {
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) lqbVar.b).length;
                } else {
                    Arrays.fill((int[]) lqbVar.b, i5, Math.min(i7 + 1, iArr2.length), -1);
                }
            }
            if (i3 != 1) {
                lqbVar.m(i, i2);
            } else if (i3 != 2) {
                lqbVar.n(i, i2);
            } else if (i3 == 8) {
                lqbVar.n(i, 1);
                lqbVar.m(i2, 1);
            }
            if (i4 <= iA1) {
                return;
            }
            if (this.w) {
                iA0 = z0();
            } else {
                iA0 = A0();
            }
            if (i5 <= iA0) {
                g0();
            }
        }
        i4 = i + i2;
        i5 = i;
        lqbVar = this.A;
        iArr = (int[]) lqbVar.b;
        if (iArr != null) {
            arrayList = (ArrayList) lqbVar.c;
            if (arrayList == null) {
                i7 = -1;
            } else {
                size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        iydVar = null;
                        break;
                    }
                    iydVar = (iyd) ((ArrayList) lqbVar.c).get(size);
                    if (iydVar.a == i5) {
                        break;
                        break;
                    }
                    size--;
                }
                if (iydVar != null) {
                    ((ArrayList) lqbVar.c).remove(iydVar);
                }
                size2 = ((ArrayList) lqbVar.c).size();
                i6 = 0;
                while (true) {
                    if (i6 < size2) {
                        i6 = -1;
                        break;
                    } else {
                        if (((iyd) ((ArrayList) lqbVar.c).get(i6)).a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    iyd iydVar3 = (iyd) ((ArrayList) lqbVar.c).get(i6);
                    ((ArrayList) lqbVar.c).remove(i6);
                    i7 = iydVar3.a;
                } else {
                    i7 = -1;
                }
            }
            iArr2 = (int[]) lqbVar.b;
            if (i7 == -1) {
                Arrays.fill(iArr2, i5, iArr2.length, -1);
                int length2 = ((int[]) lqbVar.b).length;
            } else {
                Arrays.fill((int[]) lqbVar.b, i5, Math.min(i7 + 1, iArr2.length), -1);
            }
        }
        if (i3 != 1) {
            lqbVar.m(i, i2);
        } else if (i3 != 2) {
            lqbVar.n(i, i2);
        } else if (i3 == 8) {
            lqbVar.n(i, 1);
            lqbVar.m(i2, 1);
        }
        if (i4 <= iA1) {
            return;
        }
        if (this.w) {
            iA0 = z0();
        } else {
            iA0 = A0();
        }
        if (i5 <= iA0) {
            g0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002a A[SYNTHETIC] */
    public final View E0() {
        boolean z;
        boolean z2;
        int iU = u();
        int i = iU - 1;
        int i2 = this.o;
        BitSet bitSet = new BitSet(i2);
        bitSet.set(0, i2, true);
        byte b = (this.s == 1 && F0()) ? (byte) 1 : (byte) -1;
        if (this.w) {
            iU = -1;
        } else {
            i = 0;
        }
        int i3 = i < iU ? 1 : -1;
        while (i != iU) {
            View viewT = t(i);
            hyd hydVar = (hyd) viewT.getLayoutParams();
            boolean z3 = bitSet.get(hydVar.e.e);
            gt4 gt4Var = this.q;
            if (z3) {
                ipd ipdVar = hydVar.e;
                if (this.w) {
                    int i4 = ipdVar.c;
                    if (i4 == Integer.MIN_VALUE) {
                        ipdVar.b();
                        i4 = ipdVar.c;
                    }
                    if (i4 < gt4Var.i()) {
                        ((hyd) ((View) ks0.f(1, ipdVar.a)).getLayoutParams()).getClass();
                        return viewT;
                    }
                } else {
                    int i5 = ipdVar.b;
                    ArrayList arrayList = ipdVar.a;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        hyd hydVar2 = (hyd) view.getLayoutParams();
                        ipdVar.b = ((StaggeredGridLayoutManager) ipdVar.f).q.g(view);
                        hydVar2.getClass();
                        i5 = ipdVar.b;
                    }
                    if (i5 > gt4Var.m()) {
                        ((hyd) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewT;
                    }
                }
                bitSet.clear(hydVar.e.e);
            }
            i += i3;
            if (i != iU) {
                View viewT2 = t(i);
                if (this.w) {
                    int iD = gt4Var.d(viewT);
                    int iD2 = gt4Var.d(viewT2);
                    if (iD >= iD2) {
                        if (iD == iD2) {
                            if (hydVar.e.e - ((hyd) viewT2.getLayoutParams()).e.e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewT;
                }
                int iG = gt4Var.g(viewT);
                int iG2 = gt4Var.g(viewT2);
                if (iG <= iG2) {
                    if (iG == iG2) {
                        if (hydVar.e.e - ((hyd) viewT2.getLayoutParams()).e.e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewT;
            }
        }
        return null;
    }

    @Override // defpackage.tkb
    public final boolean F() {
        return this.B != 0;
    }

    public final boolean F0() {
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = nvf.a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public final void G0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.F;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.H(view));
        }
        hyd hydVar = (hyd) view.getLayoutParams();
        int iS0 = S0(i, ((ViewGroup.MarginLayoutParams) hydVar).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) hydVar).rightMargin + rect.right);
        int iS1 = S0(i2, ((ViewGroup.MarginLayoutParams) hydVar).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) hydVar).bottomMargin + rect.bottom);
        if (o0(view, iS0, iS1, hydVar)) {
            view.measure(iS0, iS1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018b  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:265:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01de A[SYNTHETIC] */
    public final void H0(gp3 gp3Var, blb blbVar, boolean z) {
        int i;
        boolean z2;
        boolean z3;
        jyd jydVar;
        int iU;
        int i2;
        int iB;
        int iB2;
        int iU2;
        boolean z4;
        int i3;
        boolean z5;
        jyd jydVar2 = this.E;
        gyd gydVar = this.G;
        if (!(jydVar2 == null && this.y == -1) && blbVar.b() == 0) {
            b0(gp3Var);
            gydVar.a();
            return;
        }
        boolean z6 = gydVar.e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = gydVar.g;
        boolean z7 = (z6 && this.y == -1 && this.E == null) ? false : true;
        ipd[] ipdVarArr = this.p;
        int i4 = this.o;
        lqb lqbVar = this.A;
        if (z7) {
            gydVar.a();
            jyd jydVar3 = this.E;
            gt4 gt4Var = this.q;
            if (jydVar3 != null) {
                int i5 = jydVar3.c;
                if (i5 > 0) {
                    if (i5 == i4) {
                        for (int i6 = 0; i6 < i4; i6++) {
                            ipdVarArr[i6].c();
                            jyd jydVar4 = this.E;
                            int i7 = jydVar4.d[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                i7 += jydVar4.w ? gt4Var.i() : gt4Var.m();
                            }
                            ipd ipdVar = ipdVarArr[i6];
                            ipdVar.b = i7;
                            ipdVar.c = i7;
                        }
                    } else {
                        jydVar3.d = null;
                        jydVar3.c = 0;
                        jydVar3.e = 0;
                        jydVar3.f = null;
                        jydVar3.g = null;
                        jydVar3.a = jydVar3.b;
                    }
                }
                jyd jydVar5 = this.E;
                this.D = jydVar5.x;
                boolean z8 = jydVar5.v;
                b(null);
                jyd jydVar6 = this.E;
                if (jydVar6 != null && jydVar6.v != z8) {
                    jydVar6.v = z8;
                }
                this.v = z8;
                g0();
                N0();
                jyd jydVar7 = this.E;
                int i8 = jydVar7.a;
                if (i8 != -1) {
                    this.y = i8;
                    gydVar.c = jydVar7.w;
                } else {
                    gydVar.c = this.w;
                }
                if (jydVar7.e > 1) {
                    lqbVar.b = jydVar7.f;
                    lqbVar.c = jydVar7.g;
                }
            } else {
                N0();
                gydVar.c = this.w;
            }
            if (blbVar.f || (i3 = this.y) == -1) {
                if (this.C) {
                    int iB3 = blbVar.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iB2 = 0;
                            break;
                        }
                        iB2 = tkb.B(t(iU2));
                        if (iB2 < 0 && iB2 < iB3) {
                            break;
                        } else {
                            iU2--;
                        }
                    }
                } else {
                    int iB4 = blbVar.b();
                    iU = u();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iU) {
                            iB2 = 0;
                            break;
                        }
                        iB = tkb.B(t(i2));
                        if (iB < 0 && iB < iB4) {
                            iB2 = iB;
                            break;
                        }
                        i2++;
                    }
                }
                gydVar.a = iB2;
                gydVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else if (i3 < 0 || i3 >= blbVar.b()) {
                this.y = -1;
                this.z = Integer.MIN_VALUE;
                if (this.C) {
                    int iB5 = blbVar.b();
                    iU2 = u() - 1;
                    while (true) {
                        if (iU2 < 0) {
                            iB2 = 0;
                            break;
                        } else {
                            iB2 = tkb.B(t(iU2));
                            if (iB2 < 0) {
                            }
                            iU2--;
                        }
                    }
                } else {
                    int iB6 = blbVar.b();
                    iU = u();
                    i2 = 0;
                    while (true) {
                        if (i2 >= iU) {
                            iB2 = 0;
                            break;
                        } else {
                            iB = tkb.B(t(i2));
                            if (iB < 0) {
                            }
                            i2++;
                        }
                    }
                }
                gydVar.a = iB2;
                gydVar.b = Integer.MIN_VALUE;
                z4 = true;
            } else {
                jyd jydVar8 = this.E;
                if (jydVar8 == null || jydVar8.a == -1 || jydVar8.c < 1) {
                    View viewP = p(this.y);
                    if (viewP != null) {
                        gydVar.a = this.w ? A0() : z0();
                        if (this.z != Integer.MIN_VALUE) {
                            if (gydVar.c) {
                                gydVar.b = (gt4Var.i() - this.z) - gt4Var.d(viewP);
                            } else {
                                gydVar.b = (gt4Var.m() + this.z) - gt4Var.g(viewP);
                            }
                        } else if (gt4Var.e(viewP) > gt4Var.n()) {
                            gydVar.b = gydVar.c ? gt4Var.i() : gt4Var.m();
                        } else {
                            int iG = gt4Var.g(viewP) - gt4Var.m();
                            if (iG < 0) {
                                gydVar.b = -iG;
                            } else {
                                int i9 = gt4Var.i() - gt4Var.d(viewP);
                                if (i9 < 0) {
                                    gydVar.b = i9;
                                } else {
                                    gydVar.b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i10 = this.y;
                        gydVar.a = i10;
                        int i11 = this.z;
                        if (i11 == Integer.MIN_VALUE) {
                            if (u() != 0) {
                                if ((i10 < z0()) != this.w) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                            } else if (this.w) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            gydVar.c = z5;
                            gt4 gt4Var2 = staggeredGridLayoutManager.q;
                            gydVar.b = z5 ? gt4Var2.i() : gt4Var2.m();
                        } else {
                            boolean z9 = gydVar.c;
                            gt4 gt4Var3 = staggeredGridLayoutManager.q;
                            if (z9) {
                                gydVar.b = gt4Var3.i() - i11;
                            } else {
                                gydVar.b = gt4Var3.m() + i11;
                            }
                        }
                        z4 = true;
                        gydVar.d = true;
                    }
                } else {
                    gydVar.b = Integer.MIN_VALUE;
                    gydVar.a = this.y;
                }
                z4 = true;
            }
            gydVar.e = z4;
        }
        if (this.E == null && this.y == -1 && !(gydVar.c == this.C && F0() == this.D)) {
            lqbVar.c();
            i = 1;
            gydVar.d = true;
        } else {
            i = 1;
        }
        if (u() > 0 && ((jydVar = this.E) == null || jydVar.c < i)) {
            if (gydVar.d) {
                for (int i12 = 0; i12 < i4; i12++) {
                    ipdVarArr[i12].c();
                    int i13 = gydVar.b;
                    if (i13 != Integer.MIN_VALUE) {
                        ipd ipdVar2 = ipdVarArr[i12];
                        ipdVar2.b = i13;
                        ipdVar2.c = i13;
                    }
                }
            } else if (z7 || gydVar.f == null) {
                for (int i14 = 0; i14 < i4; i14++) {
                    ipd ipdVar3 = ipdVarArr[i14];
                    boolean z10 = this.w;
                    int i15 = gydVar.b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) ipdVar3.f;
                    int iG2 = z10 ? ipdVar3.g(Integer.MIN_VALUE) : ipdVar3.j(Integer.MIN_VALUE);
                    ipdVar3.c();
                    if (iG2 != Integer.MIN_VALUE && ((!z10 || iG2 >= staggeredGridLayoutManager2.q.i()) && (z10 || iG2 <= staggeredGridLayoutManager2.q.m()))) {
                        if (i15 != Integer.MIN_VALUE) {
                            iG2 += i15;
                        }
                        ipdVar3.c = iG2;
                        ipdVar3.b = iG2;
                    }
                }
                int length = ipdVarArr.length;
                int[] iArr = gydVar.f;
                if (iArr == null || iArr.length < length) {
                    gydVar.f = new int[staggeredGridLayoutManager.p.length];
                }
                for (int i16 = 0; i16 < length; i16++) {
                    gydVar.f[i16] = ipdVarArr[i16].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i17 = 0; i17 < i4; i17++) {
                    ipd ipdVar4 = ipdVarArr[i17];
                    ipdVar4.c();
                    int i18 = gydVar.f[i17];
                    ipdVar4.b = i18;
                    ipdVar4.c = i18;
                }
            }
        }
        o(gp3Var);
        iw7 iw7Var = this.u;
        iw7Var.a = false;
        gt4 gt4Var4 = this.r;
        int iN = gt4Var4.n();
        this.t = iN / i4;
        View.MeasureSpec.makeMeasureSpec(iN, gt4Var4.k());
        Q0(gydVar.a);
        if (gydVar.c) {
            P0(-1);
            u0(gp3Var, iw7Var, blbVar);
            P0(1);
            iw7Var.c = gydVar.a + iw7Var.d;
            u0(gp3Var, iw7Var, blbVar);
        } else {
            P0(1);
            u0(gp3Var, iw7Var, blbVar);
            P0(-1);
            iw7Var.c = gydVar.a + iw7Var.d;
            u0(gp3Var, iw7Var, blbVar);
        }
        if (gt4Var4.k() != 1073741824) {
            int iU3 = u();
            float fMax = 0.0f;
            for (int i19 = 0; i19 < iU3; i19++) {
                View viewT = t(i19);
                float fE = gt4Var4.e(viewT);
                if (fE >= fMax) {
                    ((hyd) viewT.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fE);
                }
            }
            int i20 = this.t;
            int iRound = Math.round(fMax * i4);
            if (gt4Var4.k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, gt4Var4.n());
            }
            this.t = iRound / i4;
            View.MeasureSpec.makeMeasureSpec(iRound, gt4Var4.k());
            if (this.t != i20) {
                for (int i21 = 0; i21 < iU3; i21++) {
                    View viewT2 = t(i21);
                    hyd hydVar = (hyd) viewT2.getLayoutParams();
                    hydVar.getClass();
                    boolean zF0 = F0();
                    int i22 = this.s;
                    if (zF0 && i22 == 1) {
                        int i23 = -((i4 - 1) - hydVar.e.e);
                        viewT2.offsetLeftAndRight((this.t * i23) - (i23 * i20));
                    } else {
                        int i24 = hydVar.e.e;
                        int i25 = this.t * i24;
                        int i26 = i24 * i20;
                        if (i22 == 1) {
                            viewT2.offsetLeftAndRight(i25 - i26);
                        } else {
                            viewT2.offsetTopAndBottom(i25 - i26);
                        }
                    }
                }
            }
        }
        if (u() <= 0) {
            z2 = true;
        } else if (this.w) {
            z2 = true;
            x0(gp3Var, blbVar, true);
            y0(gp3Var, blbVar, false);
        } else {
            z2 = true;
            y0(gp3Var, blbVar, true);
            x0(gp3Var, blbVar, false);
        }
        if (!z || blbVar.f || this.B == 0 || u() <= 0 || E0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.J);
            }
            if (s0()) {
                z3 = z2;
            } else {
                z3 = false;
            }
        }
        if (blbVar.f) {
            gydVar.a();
        }
        this.C = gydVar.c;
        this.D = F0();
        if (z3) {
            gydVar.a();
            H0(gp3Var, blbVar, false);
        }
    }

    @Override // defpackage.tkb
    public final void I(int i) {
        super.I(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            ipd ipdVar = this.p[i2];
            int i3 = ipdVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ipdVar.b = i3 + i;
            }
            int i4 = ipdVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ipdVar.c = i4 + i;
            }
        }
    }

    public final boolean I0(int i) {
        if (this.s == 0) {
            return (i == -1) != this.w;
        }
        return ((i == -1) == this.w) == F0();
    }

    @Override // defpackage.tkb
    public final void J(int i) {
        super.J(i);
        for (int i2 = 0; i2 < this.o; i2++) {
            ipd ipdVar = this.p[i2];
            int i3 = ipdVar.b;
            if (i3 != Integer.MIN_VALUE) {
                ipdVar.b = i3 + i;
            }
            int i4 = ipdVar.c;
            if (i4 != Integer.MIN_VALUE) {
                ipdVar.c = i4 + i;
            }
        }
    }

    public final void J0(int i) {
        int iZ0;
        int i2;
        if (i > 0) {
            iZ0 = A0();
            i2 = 1;
        } else {
            iZ0 = z0();
            i2 = -1;
        }
        iw7 iw7Var = this.u;
        iw7Var.a = true;
        Q0(iZ0);
        P0(i2);
        iw7Var.c = iZ0 + iw7Var.d;
        iw7Var.b = Math.abs(i);
    }

    @Override // defpackage.tkb
    public final void K() {
        this.A.c();
        for (int i = 0; i < this.o; i++) {
            this.p[i].c();
        }
    }

    public final void K0(gp3 gp3Var, iw7 iw7Var) {
        if (!iw7Var.a || iw7Var.i) {
            return;
        }
        int i = iw7Var.b;
        int i2 = iw7Var.e;
        if (i == 0) {
            if (i2 == -1) {
                L0(gp3Var, iw7Var.g);
                return;
            } else {
                M0(gp3Var, iw7Var.f);
                return;
            }
        }
        int i3 = this.o;
        ipd[] ipdVarArr = this.p;
        int i4 = 1;
        if (i2 == -1) {
            int i5 = iw7Var.f;
            int iJ = ipdVarArr[0].j(i5);
            while (i4 < i3) {
                int iJ2 = ipdVarArr[i4].j(i5);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i4++;
            }
            int i6 = i5 - iJ;
            int iMin = iw7Var.g;
            if (i6 >= 0) {
                iMin -= Math.min(i6, iw7Var.b);
            }
            L0(gp3Var, iMin);
            return;
        }
        int i7 = iw7Var.g;
        int iG = ipdVarArr[0].g(i7);
        while (i4 < i3) {
            int iG2 = ipdVarArr[i4].g(i7);
            if (iG2 < iG) {
                iG = iG2;
            }
            i4++;
        }
        int i8 = iG - iw7Var.g;
        int iMin2 = iw7Var.f;
        if (i8 >= 0) {
            iMin2 += Math.min(i8, iw7Var.b);
        }
        M0(gp3Var, iMin2);
    }

    @Override // defpackage.tkb
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.J);
        }
        for (int i = 0; i < this.o; i++) {
            this.p[i].c();
        }
        recyclerView.requestLayout();
    }

    public final void L0(gp3 gp3Var, int i) {
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            gt4 gt4Var = this.q;
            if (gt4Var.g(viewT) < i || gt4Var.p(viewT) < i) {
                return;
            }
            hyd hydVar = (hyd) viewT.getLayoutParams();
            hydVar.getClass();
            if (hydVar.e.a.size() == 1) {
                return;
            }
            ipd ipdVar = hydVar.e;
            ArrayList arrayList = ipdVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            hyd hydVar2 = (hyd) view.getLayoutParams();
            hydVar2.e = null;
            if (hydVar2.a.g() || hydVar2.a.j()) {
                ipdVar.d -= ((StaggeredGridLayoutManager) ipdVar.f).q.e(view);
            }
            if (size == 1) {
                ipdVar.b = Integer.MIN_VALUE;
            }
            ipdVar.c = Integer.MIN_VALUE;
            d0(viewT, gp3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0048  */
    /* JADX WARN: Code duplicated, block: B:34:0x004f  */
    @Override // defpackage.tkb
    public final View M(View view, int i, gp3 gp3Var, blb blbVar) {
        View viewY;
        int i2;
        if (u() != 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || (viewY = recyclerView.y(view)) == null || ((ArrayList) this.a.b).contains(viewY)) {
                viewY = null;
            }
            if (viewY != null) {
                N0();
                int i3 = this.s;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? i3 == 0 : !(i != 130 || i3 != 1)) {
                                    i2 = 1;
                                }
                            } else if (i3 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (i3 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (i3 != 1 && F0()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (i3 != 1 && F0()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    hyd hydVar = (hyd) viewY.getLayoutParams();
                    hydVar.getClass();
                    ipd ipdVar = hydVar.e;
                    int iA0 = i2 == 1 ? A0() : z0();
                    Q0(iA0);
                    P0(i2);
                    iw7 iw7Var = this.u;
                    iw7Var.c = iw7Var.d + iA0;
                    iw7Var.b = (int) (this.q.n() * 0.33333334f);
                    iw7Var.h = true;
                    iw7Var.a = false;
                    u0(gp3Var, iw7Var, blbVar);
                    this.C = this.w;
                    View viewH = ipdVar.h(iA0, i2);
                    if (viewH != null && viewH != viewY) {
                        return viewH;
                    }
                    boolean zI0 = I0(i2);
                    ipd[] ipdVarArr = this.p;
                    int i4 = this.o;
                    if (zI0) {
                        for (int i5 = i4 - 1; i5 >= 0; i5--) {
                            View viewH2 = ipdVarArr[i5].h(iA0, i2);
                            if (viewH2 != null && viewH2 != viewY) {
                                return viewH2;
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < i4; i6++) {
                            View viewH3 = ipdVarArr[i6].h(iA0, i2);
                            if (viewH3 != null && viewH3 != viewY) {
                                return viewH3;
                            }
                        }
                    }
                    boolean z = (this.v ^ true) == (i2 == -1);
                    View viewP = p(z ? ipdVar.d() : ipdVar.e());
                    if (viewP != null && viewP != viewY) {
                        return viewP;
                    }
                    if (I0(i2)) {
                        for (int i7 = i4 - 1; i7 >= 0; i7--) {
                            if (i7 != ipdVar.e) {
                                View viewP2 = p(z ? ipdVarArr[i7].d() : ipdVarArr[i7].e());
                                if (viewP2 != null && viewP2 != viewY) {
                                    return viewP2;
                                }
                            }
                        }
                    } else {
                        for (int i8 = 0; i8 < i4; i8++) {
                            View viewP3 = p(z ? ipdVarArr[i8].d() : ipdVarArr[i8].e());
                            if (viewP3 != null && viewP3 != viewY) {
                                return viewP3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void M0(gp3 gp3Var, int i) {
        while (u() > 0) {
            View viewT = t(0);
            gt4 gt4Var = this.q;
            if (gt4Var.d(viewT) > i || gt4Var.o(viewT) > i) {
                return;
            }
            hyd hydVar = (hyd) viewT.getLayoutParams();
            hydVar.getClass();
            if (hydVar.e.a.size() == 1) {
                return;
            }
            ipd ipdVar = hydVar.e;
            ArrayList arrayList = ipdVar.a;
            View view = (View) arrayList.remove(0);
            hyd hydVar2 = (hyd) view.getLayoutParams();
            hydVar2.e = null;
            if (arrayList.size() == 0) {
                ipdVar.c = Integer.MIN_VALUE;
            }
            if (hydVar2.a.g() || hydVar2.a.j()) {
                ipdVar.d -= ((StaggeredGridLayoutManager) ipdVar.f).q.e(view);
            }
            ipdVar.b = Integer.MIN_VALUE;
            d0(viewT, gp3Var);
        }
    }

    @Override // defpackage.tkb
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (u() > 0) {
            View viewW0 = w0(false);
            View viewV0 = v0(false);
            if (viewW0 == null || viewV0 == null) {
                return;
            }
            int iB = tkb.B(viewW0);
            int iB2 = tkb.B(viewV0);
            if (iB < iB2) {
                accessibilityEvent.setFromIndex(iB);
                accessibilityEvent.setToIndex(iB2);
            } else {
                accessibilityEvent.setFromIndex(iB2);
                accessibilityEvent.setToIndex(iB);
            }
        }
    }

    public final void N0() {
        if (this.s == 1 || !F0()) {
            this.w = this.v;
        } else {
            this.w = !this.v;
        }
    }

    public final int O0(int i, gp3 gp3Var, blb blbVar) {
        if (u() == 0 || i == 0) {
            return 0;
        }
        J0(i);
        iw7 iw7Var = this.u;
        int iU0 = u0(gp3Var, iw7Var, blbVar);
        if (iw7Var.b >= iU0) {
            i = i < 0 ? -iU0 : iU0;
        }
        this.q.q(-i);
        this.C = this.w;
        iw7Var.b = 0;
        K0(gp3Var, iw7Var);
        return i;
    }

    public final void P0(int i) {
        iw7 iw7Var = this.u;
        iw7Var.e = i;
        iw7Var.d = this.w != (i == -1) ? -1 : 1;
    }

    public final void Q0(int i) {
        iw7 iw7Var = this.u;
        boolean z = false;
        iw7Var.b = 0;
        iw7Var.c = i;
        RecyclerView recyclerView = this.b;
        gt4 gt4Var = this.q;
        if (recyclerView == null || !recyclerView.v) {
            iw7Var.g = gt4Var.h();
            iw7Var.f = 0;
        } else {
            iw7Var.f = gt4Var.m();
            iw7Var.g = gt4Var.i();
        }
        iw7Var.h = false;
        iw7Var.a = true;
        if (gt4Var.k() == 0 && gt4Var.h() == 0) {
            z = true;
        }
        iw7Var.i = z;
    }

    @Override // defpackage.tkb
    public final void R(int i, int i2) {
        D0(i, i2, 1);
    }

    public final void R0(ipd ipdVar, int i, int i2) {
        int i3 = ipdVar.d;
        int i4 = ipdVar.e;
        BitSet bitSet = this.x;
        if (i != -1) {
            int i5 = ipdVar.c;
            if (i5 == Integer.MIN_VALUE) {
                ipdVar.b();
                i5 = ipdVar.c;
            }
            if (i5 - i3 >= i2) {
                bitSet.set(i4, false);
                return;
            }
            return;
        }
        int i6 = ipdVar.b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ipdVar.a.get(0);
            hyd hydVar = (hyd) view.getLayoutParams();
            ipdVar.b = ((StaggeredGridLayoutManager) ipdVar.f).q.g(view);
            hydVar.getClass();
            i6 = ipdVar.b;
        }
        if (i6 + i3 <= i2) {
            bitSet.set(i4, false);
        }
    }

    @Override // defpackage.tkb
    public final void S() {
        this.A.c();
        g0();
    }

    @Override // defpackage.tkb
    public final void T(int i, int i2) {
        D0(i, i2, 8);
    }

    @Override // defpackage.tkb
    public final void U(int i, int i2) {
        D0(i, i2, 2);
    }

    @Override // defpackage.tkb
    public final void V(int i, int i2) {
        D0(i, i2, 4);
    }

    @Override // defpackage.tkb
    public final void W(gp3 gp3Var, blb blbVar) {
        H0(gp3Var, blbVar, true);
    }

    @Override // defpackage.tkb
    public final void X(blb blbVar) {
        this.y = -1;
        this.z = Integer.MIN_VALUE;
        this.E = null;
        this.G.a();
    }

    @Override // defpackage.tkb
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof jyd) {
            jyd jydVar = (jyd) parcelable;
            this.E = jydVar;
            if (this.y != -1) {
                jydVar.a = -1;
                jydVar.b = -1;
                jydVar.d = null;
                jydVar.c = 0;
                jydVar.e = 0;
                jydVar.f = null;
                jydVar.g = null;
            }
            g0();
        }
    }

    @Override // defpackage.tkb
    public final Parcelable Z() {
        int iJ;
        int iM;
        int[] iArr;
        jyd jydVar = this.E;
        if (jydVar != null) {
            jyd jydVar2 = new jyd();
            jydVar2.c = jydVar.c;
            jydVar2.a = jydVar.a;
            jydVar2.b = jydVar.b;
            jydVar2.d = jydVar.d;
            jydVar2.e = jydVar.e;
            jydVar2.f = jydVar.f;
            jydVar2.v = jydVar.v;
            jydVar2.w = jydVar.w;
            jydVar2.x = jydVar.x;
            jydVar2.g = jydVar.g;
            return jydVar2;
        }
        jyd jydVar3 = new jyd();
        jydVar3.v = this.v;
        jydVar3.w = this.C;
        jydVar3.x = this.D;
        lqb lqbVar = this.A;
        if (lqbVar == null || (iArr = (int[]) lqbVar.b) == null) {
            jydVar3.e = 0;
        } else {
            jydVar3.f = iArr;
            jydVar3.e = iArr.length;
            jydVar3.g = (ArrayList) lqbVar.c;
        }
        if (u() <= 0) {
            jydVar3.a = -1;
            jydVar3.b = -1;
            jydVar3.c = 0;
            return jydVar3;
        }
        jydVar3.a = this.C ? A0() : z0();
        View viewV0 = this.w ? v0(true) : w0(true);
        jydVar3.b = viewV0 != null ? tkb.B(viewV0) : -1;
        int i = this.o;
        jydVar3.c = i;
        jydVar3.d = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            boolean z = this.C;
            gt4 gt4Var = this.q;
            ipd[] ipdVarArr = this.p;
            if (z) {
                iJ = ipdVarArr[i2].g(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = gt4Var.i();
                    iJ -= iM;
                }
            } else {
                iJ = ipdVarArr[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = gt4Var.m();
                    iJ -= iM;
                }
            }
            jydVar3.d[i2] = iJ;
        }
        return jydVar3;
    }

    @Override // defpackage.tkb
    public final void a0(int i) {
        if (i == 0) {
            s0();
        }
    }

    @Override // defpackage.tkb
    public final void b(String str) {
        RecyclerView recyclerView;
        if (this.E != null || (recyclerView = this.b) == null) {
            return;
        }
        recyclerView.f(str);
    }

    @Override // defpackage.tkb
    public final boolean c() {
        return this.s == 0;
    }

    @Override // defpackage.tkb
    public final boolean d() {
        return this.s == 1;
    }

    @Override // defpackage.tkb
    public final boolean e(ukb ukbVar) {
        return ukbVar instanceof hyd;
    }

    @Override // defpackage.tkb
    public final void g(int i, int i2, blb blbVar, i12 i12Var) {
        iw7 iw7Var;
        int iG;
        if (this.s != 0) {
            i = i2;
        }
        if (u() == 0 || i == 0) {
            return;
        }
        J0(i);
        int[] iArr = this.I;
        int i3 = this.o;
        if (iArr == null || iArr.length < i3) {
            this.I = new int[i3];
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            iw7Var = this.u;
            if (i4 >= i3) {
                break;
            }
            int i6 = iw7Var.d;
            ipd[] ipdVarArr = this.p;
            if (i6 == -1) {
                int i7 = iw7Var.f;
                iG = i7 - ipdVarArr[i4].j(i7);
            } else {
                iG = ipdVarArr[i4].g(iw7Var.g) - iw7Var.g;
            }
            if (iG >= 0) {
                this.I[i5] = iG;
                i5++;
            }
            i4++;
        }
        Arrays.sort(this.I, 0, i5);
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = iw7Var.c;
            if (i9 < 0 || i9 >= blbVar.b()) {
                return;
            }
            i12Var.b(iw7Var.c, this.I[i8]);
            iw7Var.c += iw7Var.d;
        }
    }

    @Override // defpackage.tkb
    public final int h0(int i, gp3 gp3Var, blb blbVar) {
        return O0(i, gp3Var, blbVar);
    }

    @Override // defpackage.tkb
    public final int i(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return aic.f(blbVar, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // defpackage.tkb
    public final int i0(int i, gp3 gp3Var, blb blbVar) {
        return O0(i, gp3Var, blbVar);
    }

    @Override // defpackage.tkb
    public final int j(blb blbVar) {
        return t0(blbVar);
    }

    @Override // defpackage.tkb
    public final int k(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return aic.h(blbVar, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // defpackage.tkb
    public final int l(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return aic.f(blbVar, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // defpackage.tkb
    public final void l0(Rect rect, int i, int i2) {
        int iF;
        int iF2;
        int iZ = z() + y();
        int iX = x() + A();
        int i3 = this.s;
        int i4 = this.o;
        if (i3 == 1) {
            int iHeight = rect.height() + iX;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = nvf.a;
            iF2 = tkb.f(i2, iHeight, recyclerView.getMinimumHeight());
            iF = tkb.f(i, (this.t * i4) + iZ, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iZ;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = nvf.a;
            iF = tkb.f(i, iWidth, recyclerView2.getMinimumWidth());
            iF2 = tkb.f(i2, (this.t * i4) + iX, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iF, iF2);
    }

    @Override // defpackage.tkb
    public final int m(blb blbVar) {
        return t0(blbVar);
    }

    @Override // defpackage.tkb
    public final int n(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return aic.h(blbVar, this.q, w0(z), v0(z), this, this.H);
    }

    @Override // defpackage.tkb
    public final ukb q() {
        return this.s == 0 ? new hyd(-2, -1) : new hyd(-1, -2);
    }

    @Override // defpackage.tkb
    public final ukb r(Context context, AttributeSet attributeSet) {
        return new hyd(context, attributeSet);
    }

    @Override // defpackage.tkb
    public final boolean r0() {
        return this.E == null;
    }

    @Override // defpackage.tkb
    public final ukb s(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new hyd((ViewGroup.MarginLayoutParams) layoutParams) : new hyd(layoutParams);
    }

    public final boolean s0() {
        int iZ0;
        if (u() != 0 && this.B != 0 && this.f) {
            if (this.w) {
                iZ0 = A0();
                z0();
            } else {
                iZ0 = z0();
                A0();
            }
            if (iZ0 == 0 && E0() != null) {
                this.A.c();
                this.e = true;
                g0();
                return true;
            }
        }
        return false;
    }

    public final int t0(blb blbVar) {
        if (u() == 0) {
            return 0;
        }
        boolean z = !this.H;
        return aic.g(blbVar, this.q, w0(z), v0(z), this, this.H, this.w);
    }

    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public final int u0(gp3 gp3Var, iw7 iw7Var, blb blbVar) {
        int i;
        int i2;
        ipd[] ipdVarArr;
        int iB0;
        BitSet bitSet;
        ipd[] ipdVarArr2;
        ipd ipdVar;
        ?? r5;
        int iJ;
        int iE;
        int iE2;
        int i3;
        BitSet bitSet2;
        int i4;
        int i5;
        gp3 gp3Var2 = gp3Var;
        BitSet bitSet3 = this.x;
        int i6 = this.o;
        bitSet3.set(0, i6, true);
        iw7 iw7Var2 = this.u;
        if (iw7Var2.i) {
            i = iw7Var.e;
            i2 = i == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = iw7Var.e;
            i2 = i == 1 ? iw7Var.g + iw7Var.b : iw7Var.f - iw7Var.b;
        }
        int i7 = 0;
        while (true) {
            ipdVarArr = this.p;
            if (i7 >= i6) {
                break;
            }
            if (!ipdVarArr[i7].a.isEmpty()) {
                R0(ipdVarArr[i7], i, i2);
            }
            i7++;
        }
        boolean z = this.w;
        gt4 gt4Var = this.q;
        int i8 = z ? gt4Var.i() : gt4Var.m();
        boolean z2 = false;
        while (true) {
            int i9 = iw7Var.c;
            if (i9 < 0 || i9 >= blbVar.b() || (!iw7Var2.i && bitSet3.isEmpty())) {
                break;
            }
            View view = gp3Var2.p(iw7Var.c, Long.MAX_VALUE).a;
            iw7Var.c += iw7Var.d;
            hyd hydVar = (hyd) view.getLayoutParams();
            int iB = hydVar.a.b();
            lqb lqbVar = this.A;
            int[] iArr = (int[]) lqbVar.b;
            int i10 = (iArr == null || iB >= iArr.length) ? -1 : iArr[iB];
            if (i10 == -1) {
                if (I0(iw7Var.e)) {
                    i5 = i6 - 1;
                    i6 = -1;
                    i4 = -1;
                } else {
                    i4 = 1;
                    i5 = 0;
                }
                ipd ipdVar2 = null;
                int i11 = i4;
                if (iw7Var.e == 1) {
                    int iM = gt4Var.m();
                    ipdVarArr2 = ipdVarArr;
                    int i12 = i5;
                    int i13 = Integer.MAX_VALUE;
                    while (i12 != i6) {
                        int i14 = i12;
                        ipd ipdVar3 = ipdVarArr2[i14];
                        BitSet bitSet4 = bitSet3;
                        int iG = ipdVar3.g(iM);
                        if (iG < i13) {
                            i13 = iG;
                            ipdVar2 = ipdVar3;
                        }
                        i12 = i14 + i11;
                        bitSet3 = bitSet4;
                    }
                    bitSet = bitSet3;
                } else {
                    bitSet = bitSet3;
                    ipdVarArr2 = ipdVarArr;
                    int i15 = gt4Var.i();
                    int i16 = i5;
                    int i17 = Integer.MIN_VALUE;
                    while (i16 != i6) {
                        ipd ipdVar4 = ipdVarArr2[i16];
                        int i18 = i6;
                        int iJ2 = ipdVar4.j(i15);
                        if (iJ2 > i17) {
                            i17 = iJ2;
                            ipdVar2 = ipdVar4;
                        }
                        i16 += i11;
                        i6 = i18;
                    }
                }
                ipdVar = ipdVar2;
                lqbVar.f(iB);
                ((int[]) lqbVar.b)[iB] = ipdVar.e;
            } else {
                bitSet = bitSet3;
                i6 = i6;
                ipdVarArr2 = ipdVarArr;
                ipdVar = ipdVarArr2[i10];
            }
            hydVar.e = ipdVar;
            if (iw7Var.e == 1) {
                r5 = 0;
                a(view, -1, false);
            } else {
                r5 = 0;
                a(view, 0, false);
            }
            int i19 = this.s;
            if (i19 == 1) {
                G0(view, tkb.v(r5, this.t, this.k, r5, ((ViewGroup.MarginLayoutParams) hydVar).width), tkb.v(true, this.n, this.l, x() + A(), ((ViewGroup.MarginLayoutParams) hydVar).height));
            } else {
                G0(view, tkb.v(true, this.m, this.k, z() + y(), ((ViewGroup.MarginLayoutParams) hydVar).width), tkb.v(false, this.t, this.l, 0, ((ViewGroup.MarginLayoutParams) hydVar).height));
            }
            if (iw7Var.e == 1) {
                iE = ipdVar.g(i8);
                iJ = gt4Var.e(view) + iE;
            } else {
                iJ = ipdVar.j(i8);
                iE = iJ - gt4Var.e(view);
            }
            int i20 = iw7Var.e;
            ipd ipdVar5 = hydVar.e;
            if (i20 == 1) {
                ipdVar5.getClass();
                hyd hydVar2 = (hyd) view.getLayoutParams();
                hydVar2.e = ipdVar5;
                ArrayList arrayList = ipdVar5.a;
                arrayList.add(view);
                ipdVar5.c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    ipdVar5.b = Integer.MIN_VALUE;
                }
                if (hydVar2.a.g() || hydVar2.a.j()) {
                    ipdVar5.d = ((StaggeredGridLayoutManager) ipdVar5.f).q.e(view) + ipdVar5.d;
                }
            } else {
                ipdVar5.getClass();
                hyd hydVar3 = (hyd) view.getLayoutParams();
                hydVar3.e = ipdVar5;
                ArrayList arrayList2 = ipdVar5.a;
                arrayList2.add(0, view);
                ipdVar5.b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    ipdVar5.c = Integer.MIN_VALUE;
                }
                if (hydVar3.a.g() || hydVar3.a.j()) {
                    ipdVar5.d = ((StaggeredGridLayoutManager) ipdVar5.f).q.e(view) + ipdVar5.d;
                }
            }
            boolean zF0 = F0();
            gt4 gt4Var2 = this.r;
            if (zF0 && i19 == 1) {
                i3 = gt4Var2.i() - (((i6 - 1) - ipdVar.e) * this.t);
                iE2 = i3 - gt4Var2.e(view);
            } else {
                int iM2 = (ipdVar.e * this.t) + gt4Var2.m();
                int iE3 = gt4Var2.e(view) + iM2;
                iE2 = iM2;
                i3 = iE3;
            }
            z2 = true;
            if (i19 == 1) {
                tkb.H(view, iE2, iE, i3, iJ);
            } else {
                tkb.H(view, iE, iE2, iJ, i3);
            }
            R0(ipdVar, iw7Var2.e, i2);
            gp3Var2 = gp3Var;
            K0(gp3Var2, iw7Var2);
            if (iw7Var2.h && view.hasFocusable()) {
                bitSet2 = bitSet;
                bitSet2.set(ipdVar.e, false);
            } else {
                bitSet2 = bitSet;
            }
            bitSet3 = bitSet2;
            i6 = i6;
            ipdVarArr = ipdVarArr2;
        }
        if (!z2) {
            K0(gp3Var2, iw7Var2);
        }
        if (iw7Var2.e == -1) {
            iB0 = gt4Var.m() - C0(gt4Var.m());
        } else {
            iB0 = B0(gt4Var.i()) - gt4Var.i();
        }
        if (iB0 > 0) {
            return Math.min(iw7Var.b, iB0);
        }
        return 0;
    }

    public final View v0(boolean z) {
        gt4 gt4Var = this.q;
        int iM = gt4Var.m();
        int i = gt4Var.i();
        View view = null;
        for (int iU = u() - 1; iU >= 0; iU--) {
            View viewT = t(iU);
            int iG = gt4Var.g(viewT);
            int iD = gt4Var.d(viewT);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final View w0(boolean z) {
        gt4 gt4Var = this.q;
        int iM = gt4Var.m();
        int i = gt4Var.i();
        int iU = u();
        View view = null;
        for (int i2 = 0; i2 < iU; i2++) {
            View viewT = t(i2);
            int iG = gt4Var.g(viewT);
            if (gt4Var.d(viewT) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewT;
                }
                if (view == null) {
                    view = viewT;
                }
            }
        }
        return view;
    }

    public final void x0(gp3 gp3Var, blb blbVar, boolean z) {
        int i;
        int iB0 = B0(Integer.MIN_VALUE);
        if (iB0 != Integer.MIN_VALUE && (i = this.q.i() - iB0) > 0) {
            int i2 = i - (-O0(-i, gp3Var, blbVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.q.q(i2);
        }
    }

    public final void y0(gp3 gp3Var, blb blbVar, boolean z) {
        int iM;
        int iC0 = C0(Integer.MAX_VALUE);
        if (iC0 != Integer.MAX_VALUE && (iM = iC0 - this.q.m()) > 0) {
            int iO0 = iM - O0(iM, gp3Var, blbVar);
            if (!z || iO0 <= 0) {
                return;
            }
            this.q.q(-iO0);
        }
    }

    public final int z0() {
        if (u() == 0) {
            return 0;
        }
        return tkb.B(t(0));
    }
}
