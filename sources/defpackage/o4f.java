package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o4f {
    public static final o4f e = new o4f(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final yx4 c;
    public Object[] d;

    public o4f(int i, int i2, Object[] objArr, yx4 yx4Var) {
        this.a = i;
        this.b = i2;
        this.c = yx4Var;
        this.d = objArr;
    }

    public static o4f k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, yx4 yx4Var) {
        if (i3 > 30) {
            return new o4f(0, 0, new Object[]{obj, obj2, obj3, obj4}, yx4Var);
        }
        int iF = jrb.f(i, i3);
        int iF2 = jrb.f(i2, i3);
        if (iF != iF2) {
            return new o4f((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, yx4Var);
        }
        return new o4f(0, 1 << iF, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, yx4Var)}, yx4Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, yx4 yx4Var) {
        Object obj3 = this.d[i];
        o4f o4fVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, v(i), i3, obj, obj2, i4 + 5, yx4Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = o4fVarK;
        qd0.Z(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        x67 x67VarX = mh3.X(mh3.c0(0, this.d.length), 2);
        int i = x67VarX.a;
        int i2 = x67VarX.b;
        int i3 = x67VarX.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!pa7.t(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, Object obj, int i2) {
        int iF = 1 << jrb.f(i, i2);
        if (i(iF)) {
            return pa7.t(obj, this.d[f(iF)]);
        }
        if (!j(iF)) {
            return false;
        }
        o4f o4fVarS = s(t(iF));
        if (i2 == 30) {
            return o4fVarS.c(obj) != -1;
        }
        return o4fVarS.d(i, obj, i2 + 5);
    }

    public final boolean e(o4f o4fVar) {
        if (this == o4fVar) {
            return true;
        }
        if (this.b == o4fVar.b && this.a == o4fVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == o4fVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8 A[LOOP:2: B:44:0x00b7->B:48:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd A[EDGE_INSN: B:62:0x00cd->B:51:0x00cd BREAK  A[LOOP:1: B:35:0x008c->B:42:0x00b2], SYNTHETIC] */
    public final boolean g(o4f o4fVar, l26 l26Var) {
        int i;
        int length;
        o4fVar.getClass();
        if (this == o4fVar) {
            return true;
        }
        int i2 = this.a;
        if (i2 == o4fVar.a && (i = this.b) == o4fVar.b) {
            if (i2 == 0 && i == 0) {
                Object[] objArr = this.d;
                if (objArr.length == o4fVar.d.length) {
                    Iterable iterableX = mh3.X(mh3.c0(0, objArr.length), 2);
                    if ((iterableX instanceof Collection) && ((Collection) iterableX).isEmpty()) {
                        return true;
                    }
                    Iterator it = iterableX.iterator();
                    while (((y67) it).c) {
                        int iNextInt = ((q67) it).nextInt();
                        Object obj = o4fVar.d[iNextInt];
                        Object objV = o4fVar.v(iNextInt);
                        int iC = c(obj);
                        if (!(iC != -1 ? ((Boolean) l26Var.z(v(iC), objV)).booleanValue() : false)) {
                        }
                    }
                    return true;
                }
            } else {
                int iBitCount = Integer.bitCount(i2) * 2;
                x67 x67VarX = mh3.X(mh3.c0(0, iBitCount), 2);
                int i3 = x67VarX.a;
                int i4 = x67VarX.b;
                int i5 = x67VarX.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    length = this.d.length;
                    while (iBitCount < length) {
                        if (!s(iBitCount).g(o4fVar.s(iBitCount), l26Var)) {
                            break;
                        }
                        iBitCount++;
                    }
                    return true;
                }
                while (pa7.t(this.d[i3], o4fVar.d[i3]) && ((Boolean) l26Var.z(v(i3), o4fVar.v(i3))).booleanValue()) {
                    if (i3 == i4) {
                        length = this.d.length;
                        while (iBitCount < length) {
                            if (!s(iBitCount).g(o4fVar.s(iBitCount), l26Var)) {
                                break;
                                break;
                            }
                            iBitCount++;
                        }
                        return true;
                    }
                    i3 += i5;
                }
            }
        }
        return false;
    }

    public final Object h(int i, Object obj, int i2) {
        int iF = 1 << jrb.f(i, i2);
        if (i(iF)) {
            int iF2 = f(iF);
            if (pa7.t(obj, this.d[iF2])) {
                return v(iF2);
            }
            return null;
        }
        if (!j(iF)) {
            return null;
        }
        o4f o4fVarS = s(t(iF));
        if (i2 != 30) {
            return o4fVarS.h(i, obj, i2 + 5);
        }
        int iC = o4fVarS.c(obj);
        if (iC != -1) {
            return o4fVarS.v(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final o4f l(int i, y8a y8aVar) {
        y8aVar.h(y8aVar.f - 1);
        y8aVar.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != y8aVar.b) {
            return new o4f(0, 0, jrb.j(i, objArr), y8aVar.b);
        }
        this.d = jrb.j(i, objArr);
        return this;
    }

    public final o4f m(int i, Object obj, Object obj2, int i2, y8a y8aVar) {
        o4f o4fVarM;
        int iF = 1 << jrb.f(i, i2);
        boolean zI = i(iF);
        yx4 yx4Var = this.c;
        if (zI) {
            int iF2 = f(iF);
            if (!pa7.t(obj, this.d[iF2])) {
                y8aVar.h(y8aVar.f + 1);
                yx4 yx4Var2 = y8aVar.b;
                if (yx4Var != yx4Var2) {
                    return new o4f(this.a ^ iF, this.b | iF, a(iF2, iF, i, obj, obj2, i2, yx4Var2), yx4Var2);
                }
                this.d = a(iF2, iF, i, obj, obj2, i2, yx4Var2);
                this.a ^= iF;
                this.b |= iF;
                return this;
            }
            y8aVar.d = v(iF2);
            if (v(iF2) != obj2) {
                if (yx4Var == y8aVar.b) {
                    this.d[iF2 + 1] = obj2;
                    return this;
                }
                y8aVar.e++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF2 + 1] = obj2;
                return new o4f(this.a, this.b, objArrCopyOf, y8aVar.b);
            }
        } else {
            if (!j(iF)) {
                y8aVar.h(y8aVar.f + 1);
                yx4 yx4Var3 = y8aVar.b;
                int iF3 = f(iF);
                Object[] objArr2 = this.d;
                if (yx4Var != yx4Var3) {
                    return new o4f(this.a | iF, this.b, jrb.g(objArr2, iF3, obj, obj2), yx4Var3);
                }
                this.d = jrb.g(objArr2, iF3, obj, obj2);
                this.a |= iF;
                return this;
            }
            int iT = t(iF);
            o4f o4fVarS = s(iT);
            if (i2 == 30) {
                int iC = o4fVarS.c(obj);
                if (iC != -1) {
                    y8aVar.d = o4fVarS.v(iC);
                    if (o4fVarS.c == y8aVar.b) {
                        o4fVarS.d[iC + 1] = obj2;
                        o4fVarM = o4fVarS;
                    } else {
                        y8aVar.e++;
                        Object[] objArr3 = o4fVarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        objArrCopyOf2[iC + 1] = obj2;
                        o4fVarM = new o4f(0, 0, objArrCopyOf2, y8aVar.b);
                    }
                } else {
                    y8aVar.h(y8aVar.f + 1);
                    o4fVarM = new o4f(0, 0, jrb.g(o4fVarS.d, 0, obj, obj2), y8aVar.b);
                }
            } else {
                o4fVarM = o4fVarS.m(i, obj, obj2, i2 + 5, y8aVar);
            }
            if (o4fVarS != o4fVarM) {
                return u(iT, iF, o4fVarM, y8aVar.b);
            }
        }
        return this;
    }

    public final o4f n(o4f o4fVar, int i, qw3 qw3Var, y8a y8aVar) {
        o4f o4fVar2;
        Object[] objArr;
        o4f o4fVarK;
        o4fVar.getClass();
        if (this == o4fVar) {
            qw3Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            yx4 yx4Var = y8aVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + o4fVar.d.length);
            int length = this.d.length;
            x67 x67VarX = mh3.X(mh3.c0(0, o4fVar.d.length), 2);
            int i3 = x67VarX.a;
            int i4 = x67VarX.b;
            int i5 = x67VarX.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(o4fVar.d[i3]) != -1) {
                        qw3Var.a++;
                    } else {
                        Object[] objArr3 = o4fVar.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != o4fVar.d.length) {
                    return length == objArrCopyOf.length ? new o4f(0, 0, objArrCopyOf, yx4Var) : new o4f(0, 0, Arrays.copyOf(objArrCopyOf, length), yx4Var);
                }
            }
            return this;
        }
        int i6 = this.b | o4fVar.b;
        int i7 = this.a;
        int i8 = o4fVar.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (pa7.t(this.d[f(iLowestOneBit)], o4fVar.d[o4fVar.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            qc0.p("Check failed.");
            return null;
        }
        if (pa7.t(this.c, y8aVar.b) && this.a == i11 && this.b == i6) {
            o4fVar2 = this;
        } else {
            o4fVar2 = new o4f(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = o4fVar2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (j(iLowestOneBit2)) {
                o4fVarK = s(t(iLowestOneBit2));
                if (o4fVar.j(iLowestOneBit2)) {
                    o4fVarK = o4fVarK.n(o4fVar.s(o4fVar.t(iLowestOneBit2)), i + 5, qw3Var, y8aVar);
                    objArr = objArr4;
                } else if (o4fVar.i(iLowestOneBit2)) {
                    int iF = o4fVar.f(iLowestOneBit2);
                    Object obj = o4fVar.d[iF];
                    Object objV = o4fVar.v(iF);
                    int i14 = y8aVar.f;
                    objArr = objArr4;
                    o4fVarK = o4fVarK.m(obj != null ? obj.hashCode() : i2, obj, objV, i + 5, y8aVar);
                    if (y8aVar.f == i14) {
                        qw3Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (o4fVar.j(iLowestOneBit2)) {
                    o4f o4fVarS = o4fVar.s(o4fVar.t(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (o4fVarS.d(obj2 != null ? obj2.hashCode() : 0, obj2, i15)) {
                            qw3Var.a++;
                            o4fVarK = o4fVarS;
                        } else {
                            o4fVarK = o4fVarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(iF2), i15, y8aVar);
                        }
                    } else {
                        o4fVarK = o4fVarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objV2 = v(iF3);
                    int iF4 = o4fVar.f(iLowestOneBit2);
                    Object obj4 = o4fVar.d[iF4];
                    o4fVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, objV2, obj4 != null ? obj4.hashCode() : 0, obj4, o4fVar.v(iF4), i + 5, y8aVar.b);
                }
            }
            objArr[length2] = o4fVarK;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (o4fVar.i(iLowestOneBit3)) {
                int iF5 = o4fVar.f(iLowestOneBit3);
                Object[] objArr5 = o4fVar2.d;
                objArr5[i17] = o4fVar.d[iF5];
                objArr5[i17 + 1] = o4fVar.v(iF5);
                if (i(iLowestOneBit3)) {
                    qw3Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = o4fVar2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = v(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(o4fVar2)) {
            return o4fVar.e(o4fVar2) ? o4fVar : o4fVar2;
        }
        return this;
    }

    public final o4f o(int i, Object obj, int i2, y8a y8aVar) {
        o4f o4fVarO;
        int iF = 1 << jrb.f(i, i2);
        if (i(iF)) {
            int iF2 = f(iF);
            if (pa7.t(obj, this.d[iF2])) {
                return q(iF2, iF, y8aVar);
            }
        } else if (j(iF)) {
            int iT = t(iF);
            o4f o4fVarS = s(iT);
            if (i2 == 30) {
                int iC = o4fVarS.c(obj);
                o4fVarO = iC != -1 ? o4fVarS.l(iC, y8aVar) : o4fVarS;
            } else {
                o4fVarO = o4fVarS.o(i, obj, i2 + 5, y8aVar);
            }
            return r(o4fVarS, o4fVarO, iT, iF, y8aVar.b);
        }
        return this;
    }

    public final o4f p(int i, Object obj, Object obj2, int i2, y8a y8aVar) {
        y8a y8aVar2;
        o4f o4fVarP;
        int iF = 1 << jrb.f(i, i2);
        if (i(iF)) {
            int iF2 = f(iF);
            return (pa7.t(obj, this.d[iF2]) && pa7.t(obj2, v(iF2))) ? q(iF2, iF, y8aVar) : this;
        }
        if (!j(iF)) {
            return this;
        }
        int iT = t(iF);
        o4f o4fVarS = s(iT);
        if (i2 == 30) {
            int iC = o4fVarS.c(obj);
            o4fVarP = (iC == -1 || !pa7.t(obj2, o4fVarS.v(iC))) ? o4fVarS : o4fVarS.l(iC, y8aVar);
            y8aVar2 = y8aVar;
        } else {
            y8aVar2 = y8aVar;
            o4fVarP = o4fVarS.p(i, obj, obj2, i2 + 5, y8aVar2);
        }
        return r(o4fVarS, o4fVarP, iT, iF, y8aVar2.b);
    }

    public final o4f q(int i, int i2, y8a y8aVar) {
        y8aVar.h(y8aVar.f - 1);
        y8aVar.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != y8aVar.b) {
            return new o4f(i2 ^ this.a, this.b, jrb.j(i, objArr), y8aVar.b);
        }
        this.d = jrb.j(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final o4f r(o4f o4fVar, o4f o4fVar2, int i, int i2, yx4 yx4Var) {
        if (o4fVar2 != null) {
            return (o4fVar2 != o4fVar || (o4fVar2.d.length == 2 && o4fVar2.b == 0)) ? u(i, i2, o4fVar2, yx4Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != yx4Var) {
            Object[] objArr2 = new Object[objArr.length - 1];
            qd0.d0(0, i, 6, objArr, objArr2);
            qd0.Z(i, i + 1, objArr.length, objArr, objArr2);
            return new o4f(this.a, this.b ^ i2, objArr2, yx4Var);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        qd0.d0(0, i, 6, objArr, objArr3);
        qd0.Z(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final o4f s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (o4f) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final o4f u(int i, int i2, o4f o4fVar, yx4 yx4Var) {
        if (o4fVar.d.length != 2 || o4fVar.b != 0) {
            Object[] objArr = this.d;
            if (this.c == yx4Var) {
                objArr[i] = o4fVar;
                return this;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[i] = o4fVar;
            return new o4f(this.a, this.b, objArrCopyOf, yx4Var);
        }
        if (this.d.length == 1) {
            o4fVar.a = this.b;
            return o4fVar;
        }
        int iF = f(i2);
        Object[] objArr2 = this.d;
        Object[] objArr3 = o4fVar.d;
        Object obj = objArr3[0];
        Object obj2 = objArr3[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length + 1);
        qd0.Z(i + 2, i + 1, objArr2.length, objArrCopyOf2, objArrCopyOf2);
        qd0.Z(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new o4f(this.a ^ i2, this.b ^ i2, objArrCopyOf2, yx4Var);
    }

    public final Object v(int i) {
        return this.d[i + 1];
    }
}
