package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jpd extends czb implements l26 {
    final /* synthetic */ Iterator<Object> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpd(int i, int i2, Iterator it, boolean z, boolean z2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jpd jpdVar = new jpd(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, xn2Var);
        jpdVar.L$0 = obj;
        return jpdVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125  */
    /* JADX WARN: Code duplicated, block: B:57:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f A[EDGE_INSN: B:74:0x016f->B:75:0x0171 BREAK  A[LOOP:0: B:46:0x00f7->B:63:0x0145]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0194  */
    /* JADX WARN: Code duplicated, block: B:85:0x019a  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00a0 A[SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        int i2;
        y4c y4cVar;
        int i3;
        Iterator<Object> it;
        ArrayList arrayList;
        Iterator<Object> it2;
        int i4;
        int i5;
        Object next;
        int i6;
        Object[] objArr;
        int i7;
        y4c y4cVar2;
        Object next2;
        int i8;
        int i9;
        Object arrayList2;
        int i10;
        Object[] array;
        Object arrayList3;
        dyc dycVar = (dyc) this.L$0;
        int i11 = this.label;
        boolean z = true;
        bw2 bw2Var = bw2.a;
        if (i11 == 0) {
            jzb.q(obj);
            int i12 = this.$size;
            i = UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i12 <= 1024) {
                i = i12;
            }
            i2 = this.$step - i12;
            if (i2 >= 0) {
                arrayList = new ArrayList(i);
                it2 = this.$iterator;
                i4 = i2;
                i5 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i5 > 0) {
                        i5--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == this.$size) {
                            this.L$0 = dycVar;
                            this.L$1 = arrayList;
                            this.L$2 = it2;
                            this.L$3 = null;
                            this.I$0 = i;
                            this.I$1 = i4;
                            this.I$2 = i5;
                            this.label = 1;
                            dycVar.c(this, arrayList);
                            return bw2Var;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.I$1 = i4;
                    this.I$2 = i5;
                    this.label = 2;
                    dycVar.c(this, arrayList);
                    return bw2Var;
                }
            } else {
                y4cVar = new y4c(0, new Object[i]);
                i3 = i;
                it = this.$iterator;
                while (true) {
                    i6 = y4cVar.b;
                    objArr = y4cVar.a;
                    if (it.hasNext()) {
                        if (this.$partialWindows) {
                            i7 = i3;
                            y4cVar2 = y4cVar;
                            break;
                        }
                    } else {
                        next2 = it.next();
                        if (y4cVar.c() != i6) {
                            qc0.p("ring buffer is full");
                            return null;
                        }
                        int i13 = y4cVar.c;
                        boolean z2 = z;
                        int i14 = y4cVar.d;
                        objArr[(i13 + i14) % i6] = next2;
                        y4cVar.d = i14 + 1;
                        if (y4cVar.c() == i6) {
                            i8 = y4cVar.d;
                            i9 = this.$size;
                            if (i8 < i9) {
                                if (this.$reuseBuffer) {
                                    arrayList2 = y4cVar;
                                } else {
                                    arrayList2 = new ArrayList(y4cVar);
                                }
                                this.L$0 = dycVar;
                                this.L$1 = y4cVar;
                                this.L$2 = it;
                                this.L$3 = null;
                                this.I$0 = i3;
                                this.I$1 = i2;
                                this.label = 3;
                                dycVar.c(this, arrayList2);
                                return bw2Var;
                            }
                            i10 = i6 + (i6 >> 1) + 1;
                            if (i10 <= i9) {
                                i9 = i10;
                            }
                            if (y4cVar.c == 0) {
                                array = Arrays.copyOf(objArr, i9);
                            } else {
                                array = y4cVar.toArray(new Object[i9]);
                            }
                            y4cVar = new y4c(y4cVar.d, array);
                        }
                        z = z2;
                    }
                }
                if (y4cVar2.d > this.$step) {
                    if (this.$reuseBuffer) {
                        arrayList3 = y4cVar2;
                    } else {
                        arrayList3 = new ArrayList(y4cVar2);
                    }
                    this.L$0 = dycVar;
                    this.L$1 = y4cVar2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i7;
                    this.I$1 = i2;
                    this.label = 4;
                    dycVar.c(this, arrayList3);
                    return bw2Var;
                }
                if (!y4cVar2.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i7;
                    this.I$1 = i2;
                    this.label = 5;
                    dycVar.c(this, y4cVar2);
                    return bw2Var;
                }
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    i2 = this.I$1;
                    i3 = this.I$0;
                    it = (Iterator) this.L$2;
                    y4cVar = (y4c) this.L$1;
                    jzb.q(obj);
                    y4cVar.d(this.$step);
                    while (true) {
                        i6 = y4cVar.b;
                        objArr = y4cVar.a;
                        if (it.hasNext()) {
                            if (this.$partialWindows) {
                                i7 = i3;
                                y4cVar2 = y4cVar;
                                break;
                            }
                        } else {
                            next2 = it.next();
                            if (y4cVar.c() != i6) {
                                qc0.p("ring buffer is full");
                                return null;
                            }
                            int i15 = y4cVar.c;
                            boolean z3 = z;
                            int i16 = y4cVar.d;
                            objArr[(i15 + i16) % i6] = next2;
                            y4cVar.d = i16 + 1;
                            if (y4cVar.c() == i6) {
                                i8 = y4cVar.d;
                                i9 = this.$size;
                                if (i8 < i9) {
                                    if (this.$reuseBuffer) {
                                        arrayList2 = y4cVar;
                                    } else {
                                        arrayList2 = new ArrayList(y4cVar);
                                    }
                                    this.L$0 = dycVar;
                                    this.L$1 = y4cVar;
                                    this.L$2 = it;
                                    this.L$3 = null;
                                    this.I$0 = i3;
                                    this.I$1 = i2;
                                    this.label = 3;
                                    dycVar.c(this, arrayList2);
                                    return bw2Var;
                                }
                                i10 = i6 + (i6 >> 1) + 1;
                                if (i10 <= i9) {
                                    i9 = i10;
                                }
                                if (y4cVar.c == 0) {
                                    array = Arrays.copyOf(objArr, i9);
                                } else {
                                    array = y4cVar.toArray(new Object[i9]);
                                }
                                y4cVar = new y4c(y4cVar.d, array);
                            }
                            z = z3;
                        }
                    }
                } else if (i11 == 4) {
                    i2 = this.I$1;
                    i7 = this.I$0;
                    y4cVar2 = (y4c) this.L$1;
                    jzb.q(obj);
                    y4cVar2.d(this.$step);
                } else {
                    if (i11 != 5) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                if (y4cVar2.d > this.$step) {
                    if (this.$reuseBuffer) {
                        arrayList3 = y4cVar2;
                    } else {
                        arrayList3 = new ArrayList(y4cVar2);
                    }
                    this.L$0 = dycVar;
                    this.L$1 = y4cVar2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i7;
                    this.I$1 = i2;
                    this.label = 4;
                    dycVar.c(this, arrayList3);
                    return bw2Var;
                }
                if (!y4cVar2.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i7;
                    this.I$1 = i2;
                    this.label = 5;
                    dycVar.c(this, y4cVar2);
                    return bw2Var;
                }
            }
            jzb.q(obj);
        } else {
            i5 = this.I$1;
            int i17 = this.I$0;
            it2 = (Iterator) this.L$2;
            arrayList = (ArrayList) this.L$1;
            jzb.q(obj);
            if (this.$reuseBuffer) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(this.$size);
            }
            i = i17;
            i4 = i5;
            while (it2.hasNext()) {
                next = it2.next();
                if (i5 > 0) {
                    i5--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == this.$size) {
                        this.L$0 = dycVar;
                        this.L$1 = arrayList;
                        this.L$2 = it2;
                        this.L$3 = null;
                        this.I$0 = i;
                        this.I$1 = i4;
                        this.I$2 = i5;
                        this.label = 1;
                        dycVar.c(this, arrayList);
                        return bw2Var;
                    }
                }
            }
            if (!arrayList.isEmpty() && (this.$partialWindows || arrayList.size() == this.$size)) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.I$0 = i;
                this.I$1 = i4;
                this.I$2 = i5;
                this.label = 2;
                dycVar.c(this, arrayList);
                return bw2Var;
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jpd) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
