package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p4f {
    public static final p4f e = new p4f(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final jy4 c;
    public Object[] d;

    public p4f(int i, int i2, Object[] objArr, jy4 jy4Var) {
        this.a = i;
        this.b = i2;
        this.c = jy4Var;
        this.d = objArr;
    }

    public static p4f j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, jy4 jy4Var) {
        if (i3 > 30) {
            return new p4f(0, 0, new Object[]{obj, obj2, obj3, obj4}, jy4Var);
        }
        int i4 = rrb.i(i, i3);
        int i5 = rrb.i(i2, i3);
        if (i4 != i5) {
            return new p4f((1 << i4) | (1 << i5), 0, i4 < i5 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, jy4Var);
        }
        return new p4f(0, 1 << i4, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, jy4Var)}, jy4Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, jy4 jy4Var) {
        Object obj3 = this.d[i];
        p4f p4fVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, jy4Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        qd0.d0(0, i, 6, objArr, objArr2);
        qd0.Z(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = p4fVarJ;
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

    public final boolean c(Object obj) {
        x67 x67VarX = mh3.X(mh3.c0(0, this.d.length), 2);
        int i = x67VarX.a;
        int i2 = x67VarX.b;
        int i3 = x67VarX.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!pa7.t(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, Object obj, int i2) {
        int i3 = 1 << rrb.i(i, i2);
        if (h(i3)) {
            return pa7.t(obj, this.d[f(i3)]);
        }
        if (!i(i3)) {
            return false;
        }
        p4f p4fVarS = s(t(i3));
        return i2 == 30 ? p4fVarS.c(obj) : p4fVarS.d(i, obj, i2 + 5);
    }

    public final boolean e(p4f p4fVar) {
        if (this == p4fVar) {
            return true;
        }
        if (this.b == p4fVar.b && this.a == p4fVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == p4fVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, Object obj, int i2) {
        int i3 = 1 << rrb.i(i, i2);
        if (h(i3)) {
            int iF = f(i3);
            if (pa7.t(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(i3)) {
            return null;
        }
        p4f p4fVarS = s(t(i3));
        if (i2 != 30) {
            return p4fVarS.g(i, obj, i2 + 5);
        }
        x67 x67VarX = mh3.X(mh3.c0(0, p4fVarS.d.length), 2);
        int i4 = x67VarX.a;
        int i5 = x67VarX.b;
        int i6 = x67VarX.c;
        if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
            return null;
        }
        while (!pa7.t(obj, p4fVarS.d[i4])) {
            if (i4 == i5) {
                return null;
            }
            i4 += i6;
        }
        return p4fVarS.x(i4);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final p4f k(int i, z8a z8aVar) {
        z8aVar.h(z8aVar.f - 1);
        z8aVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != z8aVar.b) {
            return new p4f(0, 0, rrb.m(i, objArr), z8aVar.b);
        }
        this.d = rrb.m(i, objArr);
        return this;
    }

    public final p4f l(int i, Object obj, Object obj2, int i2, z8a z8aVar) {
        z8a z8aVar2;
        p4f p4fVarL;
        int i3 = 1 << rrb.i(i, i2);
        boolean zH = h(i3);
        jy4 jy4Var = this.c;
        if (zH) {
            int iF = f(i3);
            if (!pa7.t(obj, this.d[iF])) {
                z8aVar.h(z8aVar.f + 1);
                jy4 jy4Var2 = z8aVar.b;
                if (jy4Var != jy4Var2) {
                    return new p4f(this.a ^ i3, this.b | i3, a(iF, i3, i, obj, obj2, i2, jy4Var2), jy4Var2);
                }
                this.d = a(iF, i3, i, obj, obj2, i2, jy4Var2);
                this.a ^= i3;
                this.b |= i3;
                return this;
            }
            z8aVar.d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (jy4Var == z8aVar.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            z8aVar.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new p4f(this.a, this.b, objArrCopyOf, z8aVar.b);
        }
        if (!i(i3)) {
            z8aVar.h(z8aVar.f + 1);
            jy4 jy4Var3 = z8aVar.b;
            int iF2 = f(i3);
            Object[] objArr2 = this.d;
            if (jy4Var != jy4Var3) {
                return new p4f(this.a | i3, this.b, rrb.k(objArr2, iF2, obj, obj2), jy4Var3);
            }
            this.d = rrb.k(objArr2, iF2, obj, obj2);
            this.a |= i3;
            return this;
        }
        int iT = t(i3);
        p4f p4fVarS = s(iT);
        if (i2 == 30) {
            x67 x67VarX = mh3.X(mh3.c0(0, p4fVarS.d.length), 2);
            int i4 = x67VarX.a;
            int i5 = x67VarX.b;
            int i6 = x67VarX.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!pa7.t(obj, p4fVarS.d[i4])) {
                        if (i4 == i5) {
                            z8aVar.h(z8aVar.f + 1);
                            p4fVarL = new p4f(0, 0, rrb.k(p4fVarS.d, 0, obj, obj2), z8aVar.b);
                            break;
                        }
                        i4 += i6;
                    } else {
                        z8aVar.d = p4fVarS.x(i4);
                        if (p4fVarS.c != z8aVar.b) {
                            z8aVar.e++;
                            Object[] objArr3 = p4fVarS.d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                            objArrCopyOf2[i4 + 1] = obj2;
                            p4fVarL = new p4f(0, 0, objArrCopyOf2, z8aVar.b);
                            break;
                        }
                        p4fVarS.d[i4 + 1] = obj2;
                        p4fVarL = p4fVarS;
                        break;
                    }
                }
            } else {
                z8aVar.h(z8aVar.f + 1);
                p4fVarL = new p4f(0, 0, rrb.k(p4fVarS.d, 0, obj, obj2), z8aVar.b);
                break;
            }
            z8aVar2 = z8aVar;
        } else {
            z8aVar2 = z8aVar;
            p4fVarL = p4fVarS.l(i, obj, obj2, i2 + 5, z8aVar2);
        }
        return p4fVarS == p4fVarL ? this : r(iT, p4fVarL, z8aVar2.b);
    }

    public final p4f m(p4f p4fVar, int i, rw3 rw3Var, z8a z8aVar) {
        p4f p4fVar2;
        Object[] objArr;
        p4f p4fVarJ;
        if (this == p4fVar) {
            rw3Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            jy4 jy4Var = z8aVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + p4fVar.d.length);
            int length = this.d.length;
            x67 x67VarX = mh3.X(mh3.c0(0, p4fVar.d.length), 2);
            int i3 = x67VarX.a;
            int i4 = x67VarX.b;
            int i5 = x67VarX.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(p4fVar.d[i3])) {
                        rw3Var.a++;
                    } else {
                        Object[] objArr3 = p4fVar.d;
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
                if (length != p4fVar.d.length) {
                    return length == objArrCopyOf.length ? new p4f(0, 0, objArrCopyOf, jy4Var) : new p4f(0, 0, Arrays.copyOf(objArrCopyOf, length), jy4Var);
                }
            }
            return this;
        }
        int i6 = this.b | p4fVar.b;
        int i7 = this.a;
        int i8 = p4fVar.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (pa7.t(this.d[f(iLowestOneBit)], p4fVar.d[p4fVar.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            epa.b("Check failed.");
        }
        if (pa7.t(this.c, z8aVar.b) && this.a == i11 && this.b == i6) {
            p4fVar2 = this;
        } else {
            p4fVar2 = new p4f(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        }
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = p4fVar2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (i(iLowestOneBit2)) {
                p4fVarJ = s(t(iLowestOneBit2));
                if (p4fVar.i(iLowestOneBit2)) {
                    p4fVarJ = p4fVarJ.m(p4fVar.s(p4fVar.t(iLowestOneBit2)), i + 5, rw3Var, z8aVar);
                    objArr = objArr4;
                } else if (p4fVar.h(iLowestOneBit2)) {
                    int iF = p4fVar.f(iLowestOneBit2);
                    Object obj = p4fVar.d[iF];
                    Object objX = p4fVar.x(iF);
                    int i14 = z8aVar.f;
                    objArr = objArr4;
                    p4fVarJ = p4fVarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, z8aVar);
                    if (z8aVar.f == i14) {
                        rw3Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (p4fVar.i(iLowestOneBit2)) {
                    p4f p4fVarS = p4fVar.s(p4fVar.t(iLowestOneBit2));
                    if (h(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (p4fVarS.d(obj2 != null ? obj2.hashCode() : 0, obj2, i15)) {
                            rw3Var.a++;
                            p4fVarJ = p4fVarS;
                        } else {
                            p4fVarJ = p4fVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i15, z8aVar);
                        }
                    } else {
                        p4fVarJ = p4fVarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objX2 = x(iF3);
                    int iF4 = p4fVar.f(iLowestOneBit2);
                    Object obj4 = p4fVar.d[iF4];
                    p4fVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, p4fVar.x(iF4), i + 5, z8aVar.b);
                }
            }
            objArr[length2] = p4fVarJ;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (p4fVar.h(iLowestOneBit3)) {
                int iF5 = p4fVar.f(iLowestOneBit3);
                Object[] objArr5 = p4fVar2.d;
                objArr5[i17] = p4fVar.d[iF5];
                objArr5[i17 + 1] = p4fVar.x(iF5);
                if (h(iLowestOneBit3)) {
                    rw3Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = p4fVar2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = x(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(p4fVar2)) {
            return p4fVar.e(p4fVar2) ? p4fVar : p4fVar2;
        }
        return this;
    }

    public final p4f n(int i, Object obj, int i2, z8a z8aVar) {
        p4f p4fVarN;
        int i3 = 1 << rrb.i(i, i2);
        if (h(i3)) {
            int iF = f(i3);
            if (pa7.t(obj, this.d[iF])) {
                return p(iF, i3, z8aVar);
            }
        } else if (i(i3)) {
            int iT = t(i3);
            p4f p4fVarS = s(iT);
            if (i2 == 30) {
                x67 x67VarX = mh3.X(mh3.c0(0, p4fVarS.d.length), 2);
                int i4 = x67VarX.a;
                int i5 = x67VarX.b;
                int i6 = x67VarX.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!pa7.t(obj, p4fVarS.d[i4])) {
                            if (i4 == i5) {
                                p4fVarN = p4fVarS;
                                break;
                            }
                            i4 += i6;
                        } else {
                            p4fVarN = p4fVarS.k(i4, z8aVar);
                            break;
                        }
                    }
                } else {
                    p4fVarN = p4fVarS;
                    break;
                }
            } else {
                p4fVarN = p4fVarS.n(i, obj, i2 + 5, z8aVar);
            }
            return q(p4fVarS, p4fVarN, iT, i3, z8aVar.b);
        }
        return this;
    }

    public final p4f o(int i, Object obj, Object obj2, int i2, z8a z8aVar) {
        z8a z8aVar2;
        p4f p4fVarO;
        int i3 = 1 << rrb.i(i, i2);
        if (h(i3)) {
            int iF = f(i3);
            return (pa7.t(obj, this.d[iF]) && pa7.t(obj2, x(iF))) ? p(iF, i3, z8aVar) : this;
        }
        if (!i(i3)) {
            return this;
        }
        int iT = t(i3);
        p4f p4fVarS = s(iT);
        if (i2 == 30) {
            x67 x67VarX = mh3.X(mh3.c0(0, p4fVarS.d.length), 2);
            int i4 = x67VarX.a;
            int i5 = x67VarX.b;
            int i6 = x67VarX.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (!pa7.t(obj, p4fVarS.d[i4]) || !pa7.t(obj2, p4fVarS.x(i4))) {
                        if (i4 == i5) {
                            p4fVarO = p4fVarS;
                            break;
                        }
                        i4 += i6;
                    } else {
                        p4fVarO = p4fVarS.k(i4, z8aVar);
                        break;
                    }
                }
            } else {
                p4fVarO = p4fVarS;
                break;
            }
            z8aVar2 = z8aVar;
        } else {
            z8aVar2 = z8aVar;
            p4fVarO = p4fVarS.o(i, obj, obj2, i2 + 5, z8aVar2);
        }
        return q(p4fVarS, p4fVarO, iT, i3, z8aVar2.b);
    }

    public final p4f p(int i, int i2, z8a z8aVar) {
        z8aVar.h(z8aVar.f - 1);
        z8aVar.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != z8aVar.b) {
            return new p4f(i2 ^ this.a, this.b, rrb.m(i, objArr), z8aVar.b);
        }
        this.d = rrb.m(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final p4f q(p4f p4fVar, p4f p4fVar2, int i, int i2, jy4 jy4Var) {
        jy4 jy4Var2 = this.c;
        if (p4fVar2 != null) {
            return (jy4Var2 == jy4Var || p4fVar != p4fVar2) ? r(i, p4fVar2, jy4Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (jy4Var2 != jy4Var) {
            return new p4f(this.a, this.b ^ i2, rrb.n(i, objArr), jy4Var);
        }
        this.d = rrb.n(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final p4f r(int i, p4f p4fVar, jy4 jy4Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && p4fVar.d.length == 2 && p4fVar.b == 0) {
            p4fVar.a = this.b;
            return p4fVar;
        }
        if (this.c == jy4Var) {
            objArr[i] = p4fVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = p4fVar;
        return new p4f(this.a, this.b, objArrCopyOf, jy4Var);
    }

    public final p4f s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (p4f) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
    
        r15.c = w(r7, r2, (defpackage.p4f) r15.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00dc, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sug u(java.lang.Object r15, int r16, java.lang.Object r17, int r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4f.u(java.lang.Object, int, java.lang.Object, int):sug");
    }

    public final p4f v(int i, Object obj, int i2) {
        p4f p4fVarV;
        int i3 = 1 << rrb.i(i, i2);
        if (h(i3)) {
            int iF = f(i3);
            if (!pa7.t(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new p4f(this.a ^ i3, this.b, rrb.m(iF, objArr), null);
            }
        } else {
            if (!i(i3)) {
                return this;
            }
            int iT = t(i3);
            p4f p4fVarS = s(iT);
            if (i2 == 30) {
                x67 x67VarX = mh3.X(mh3.c0(0, p4fVarS.d.length), 2);
                int i4 = x67VarX.a;
                int i5 = x67VarX.b;
                int i6 = x67VarX.c;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        if (!pa7.t(obj, p4fVarS.d[i4])) {
                            if (i4 == i5) {
                                p4fVarV = p4fVarS;
                                break;
                            }
                            i4 += i6;
                        } else {
                            Object[] objArr2 = p4fVarS.d;
                            if (objArr2.length != 2) {
                                p4fVarV = new p4f(0, 0, rrb.m(i4, objArr2), null);
                                break;
                            }
                            p4fVarV = null;
                            break;
                        }
                    }
                } else {
                    p4fVarV = p4fVarS;
                    break;
                }
            } else {
                p4fVarV = p4fVarS.v(i, obj, i2 + 5);
            }
            if (p4fVarV != null) {
                return p4fVarS != p4fVarV ? w(iT, i3, p4fVarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new p4f(this.a, this.b ^ i3, rrb.n(iT, objArr3), null);
            }
        }
        return null;
    }

    public final p4f w(int i, int i2, p4f p4fVar) {
        Object[] objArr = p4fVar.d;
        if (objArr.length != 2 || p4fVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = p4fVar;
            return new p4f(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            p4fVar.a = this.b;
            return p4fVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        qd0.Z(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        qd0.Z(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new p4f(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
