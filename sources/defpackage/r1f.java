package defpackage;

import android.opengl.GLES20;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r1f implements f8f, ssc {
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public r1f(String str, String str2) throws jb6 {
        int i;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        hkg.Z();
        f(iGlCreateProgram, 35633, str);
        f(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        hkg.a0("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.b = new jy4[iArr2[0]];
        int i2 = 0;
        while (true) {
            i = 6;
            if (i2 >= iArr2[0]) {
                break;
            }
            int i3 = this.a;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i3, 35722, iArr3, 0);
            int i4 = iArr3[0];
            byte[] bArr = new byte[i4];
            GLES20.glGetActiveAttrib(i3, i2, i4, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i5 = 0; i5 < i4; i5++) {
                if (bArr[i5] == 0) {
                    i4 = i5;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i4);
            GLES20.glGetAttribLocation(i3, str3);
            jy4 jy4Var = new jy4(i);
            ((jy4[]) this.b)[i2] = jy4Var;
            ((HashMap) this.d).put(str3, jy4Var);
            i2++;
        }
        this.e = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr4, 0);
        this.c = new y25[iArr4[0]];
        for (int i6 = 0; i6 < iArr4[0]; i6++) {
            int i7 = this.a;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i7, 35719, iArr5, 0);
            int i8 = iArr5[0];
            byte[] bArr2 = new byte[i8];
            GLES20.glGetActiveUniform(i7, i6, i8, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i9 = 0; i9 < i8; i9++) {
                if (bArr2[i9] == 0) {
                    i8 = i9;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i8);
            GLES20.glGetUniformLocation(i7, str4);
            y25 y25Var = new y25(i);
            ((y25[]) this.c)[i6] = y25Var;
            ((HashMap) this.e).put(str4, y25Var);
        }
        hkg.Z();
    }

    public static void f(int i, int i2, String str) throws jb6 {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        hkg.a0(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        hkg.Z();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((he1) it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0208  */
    /* JADX WARN: Code duplicated, block: B:102:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0272  */
    /* JADX WARN: Code duplicated, block: B:117:0x0300  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    @Override // defpackage.ssc
    public void c(d0a d0aVar) {
        SparseArray sparseArray;
        zu1 zu1Var;
        x5f lcaVar;
        x5f lcaVar2;
        int i;
        SparseArray sparseArray2;
        SparseArray sparseArray3 = (SparseArray) this.c;
        SparseIntArray sparseIntArray = (SparseIntArray) this.d;
        zu1 zu1Var2 = (zu1) this.b;
        v5f v5fVar = (v5f) this.e;
        SparseArray sparseArray4 = v5fVar.g;
        SparseBooleanArray sparseBooleanArray = v5fVar.h;
        if (d0aVar.z() != 2) {
            return;
        }
        int i2 = 0;
        rye ryeVar = (rye) v5fVar.b.get(0);
        if ((d0aVar.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            return;
        }
        d0aVar.N(1);
        int iG = d0aVar.G();
        int i3 = 3;
        d0aVar.N(3);
        d0aVar.k(zu1Var2.b, 0, 2);
        zu1Var2.m(0);
        zu1Var2.o(3);
        int i4 = 13;
        v5fVar.q = zu1Var2.g(13);
        d0aVar.k(zu1Var2.b, 0, 2);
        zu1Var2.m(0);
        zu1Var2.o(4);
        d0aVar.N(zu1Var2.g(12));
        sparseArray3.clear();
        sparseIntArray.clear();
        int iA = d0aVar.a();
        while (iA > 0) {
            d0aVar.k(zu1Var2.b, i2, 5);
            zu1Var2.m(i2);
            int iG2 = zu1Var2.g(8);
            zu1Var2.o(i3);
            int iG3 = zu1Var2.g(i4);
            zu1Var2.o(4);
            int iG4 = zu1Var2.g(12);
            int i5 = d0aVar.b;
            int i6 = i5 + iG4;
            String strTrim = null;
            ArrayList arrayList = null;
            int i7 = -1;
            int iZ = 0;
            while (true) {
                zu1Var = zu1Var2;
                if (d0aVar.b < i6) {
                    int iZ2 = d0aVar.z();
                    int iZ3 = d0aVar.b + d0aVar.z();
                    if (iZ3 <= i6) {
                        int i8 = iA;
                        if (iZ2 == 5) {
                            long jB = d0aVar.B();
                            if (jB == 1094921523) {
                                i7 = 129;
                            } else if (jB == 1161904947) {
                                i7 = 135;
                            } else if (jB == 1094921524) {
                                i7 = 172;
                            } else if (jB == 1212503619) {
                                i7 = 36;
                            }
                            i = iZ3;
                            sparseArray2 = sparseArray4;
                        } else if (iZ2 == 106) {
                            i = iZ3;
                            sparseArray2 = sparseArray4;
                            i7 = 129;
                        } else if (iZ2 == 122) {
                            sparseArray2 = sparseArray4;
                            i7 = 135;
                            i = iZ3;
                        } else if (iZ2 == 127) {
                            int iZ4 = d0aVar.z();
                            if (iZ4 == 21) {
                                i7 = 172;
                            } else if (iZ4 == 14) {
                                i7 = 136;
                            } else if (iZ4 == 33) {
                                i7 = 139;
                            }
                            i = iZ3;
                            sparseArray2 = sparseArray4;
                        } else if (iZ2 == 123) {
                            i = iZ3;
                            sparseArray2 = sparseArray4;
                            i7 = 138;
                        } else if (iZ2 == 10) {
                            strTrim = d0aVar.x(3, StandardCharsets.UTF_8).trim();
                            i = iZ3;
                            sparseArray2 = sparseArray4;
                            iZ = d0aVar.z();
                        } else {
                            int i9 = 3;
                            if (iZ2 == 89) {
                                ArrayList arrayList2 = new ArrayList();
                                while (d0aVar.b < iZ3) {
                                    String strTrim2 = d0aVar.x(i9, StandardCharsets.UTF_8).trim();
                                    d0aVar.z();
                                    int i10 = iZ3;
                                    byte[] bArr = new byte[4];
                                    d0aVar.k(bArr, 0, 4);
                                    arrayList2.add(new w5f(strTrim2, bArr));
                                    iZ3 = i10;
                                    sparseArray4 = sparseArray4;
                                    i9 = 3;
                                }
                                i = iZ3;
                                sparseArray2 = sparseArray4;
                                arrayList = arrayList2;
                                i7 = 89;
                            } else {
                                i = iZ3;
                                sparseArray2 = sparseArray4;
                                if (iZ2 == 111) {
                                    i7 = 257;
                                }
                            }
                        }
                        d0aVar.N(i - d0aVar.b);
                        zu1Var2 = zu1Var;
                        iA = i8;
                        sparseArray4 = sparseArray2;
                    }
                }
            }
            SparseArray sparseArray5 = sparseArray4;
            int i11 = iA;
            d0aVar.M(i6);
            os osVar = new os(i7, strTrim, iZ, arrayList, Arrays.copyOfRange(d0aVar.a, i5, i6));
            String str = strTrim;
            if (iG2 == 6 || iG2 == 5) {
                iG2 = i7;
            }
            iA = i11 - (iG4 + 5);
            if (!sparseBooleanArray.get(iG3)) {
                bu3 bu3Var = v5fVar.e;
                if (iG2 == 2) {
                    lcaVar = new lca(new hg6(new vtc(bu3Var.b(osVar), 1), "video/mp2t"));
                } else {
                    if (iG2 == 3 || iG2 == 4) {
                        lcaVar2 = new lca(new t49(str, osVar.j(), "video/mp2t"));
                    } else if (iG2 == 21) {
                        lcaVar = new lca(new or4());
                    } else if (iG2 == 27) {
                        lcaVar = new lca(new ng6(new vtc(bu3Var.b(osVar), 0), false, false));
                    } else if (iG2 == 36) {
                        lcaVar = new lca(new pg6(new vtc(bu3Var.b(osVar), 0)));
                    } else if (iG2 == 45) {
                        lcaVar = new lca(new v49());
                    } else if (iG2 == 89) {
                        lcaVar = new lca(new or4((List) osVar.c));
                    } else if (iG2 == 172) {
                        lcaVar2 = new lca(new b6(str, osVar.j(), "video/mp2t", 1));
                    } else if (iG2 == 257) {
                        lcaVar = new tsc(new gg7("application/vnd.dvb.ait", 18));
                    } else if (iG2 == 138) {
                        lcaVar2 = new lca(new rq4(str, osVar.j(), 4096));
                    } else if (iG2 != 139) {
                        switch (iG2) {
                            case 15:
                                lcaVar2 = new lca(new sh(osVar.j(), str, "video/mp2t", false));
                                break;
                            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                lcaVar = new lca(new kg6(new vtc(bu3Var.b(osVar), 1)));
                                break;
                            case 17:
                                lcaVar2 = new lca(new mu7(str, osVar.j()));
                                break;
                            default:
                                switch (iG2) {
                                    case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                                        lcaVar = new lca(new hg6(new vtc(bu3Var.b(osVar), 1), "video/mp2t"));
                                        break;
                                    case 129:
                                        lcaVar2 = new lca(new b6(str, osVar.j(), "video/mp2t", 0));
                                        break;
                                    case 130:
                                        lcaVar = null;
                                        break;
                                    default:
                                        switch (iG2) {
                                            case 134:
                                                lcaVar = new tsc(new gg7("application/x-scte35", 18));
                                                break;
                                            case 135:
                                                lcaVar2 = new lca(new b6(str, osVar.j(), "video/mp2t", 0));
                                                break;
                                            case 136:
                                                lcaVar2 = new lca(new rq4(str, osVar.j(), 4096));
                                                break;
                                            default:
                                                lcaVar = null;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        lcaVar2 = new lca(new rq4(str, osVar.j(), 5408));
                    }
                    lcaVar = lcaVar2;
                }
                sparseIntArray.put(iG3, iG3);
                sparseArray3.put(iG3, lcaVar);
            }
            zu1Var2 = zu1Var;
            sparseArray4 = sparseArray5;
            i2 = 0;
            i3 = 3;
            i4 = 13;
        }
        SparseArray sparseArray6 = sparseArray4;
        int size = sparseIntArray.size();
        int i12 = 0;
        while (i12 < size) {
            int iKeyAt = sparseIntArray.keyAt(i12);
            int iValueAt = sparseIntArray.valueAt(i12);
            sparseBooleanArray.put(iKeyAt, true);
            v5fVar.i.put(iValueAt, true);
            x5f x5fVar = (x5f) sparseArray3.valueAt(i12);
            if (x5fVar != null) {
                x5fVar.b(ryeVar, v5fVar.l, new xg3(iG, iKeyAt, UserMetadata.MAX_INTERNAL_KEY_SIZE));
                sparseArray = sparseArray6;
                sparseArray.put(iValueAt, x5fVar);
            } else {
                sparseArray = sparseArray6;
            }
            i12++;
            sparseArray6 = sparseArray;
        }
        sparseArray6.remove(this.a);
        v5fVar.m = 0;
        v5fVar.l.j();
        v5fVar.n = true;
    }

    public void d(he1 he1Var) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.contains(he1Var)) {
            return;
        }
        arrayList.add(he1Var);
    }

    public void e(qh2 qh2Var) {
        for (no0 no0Var : qh2Var.b()) {
            ((k79) this.c).a(no0Var, null);
            ((k79) this.c).n(no0Var, qh2Var.i(no0Var), qh2Var.c(no0Var));
        }
    }

    public void g(int i, int i2, int i3) {
        float[] fArrT = t(i);
        float[] fArrT2 = t(i2);
        float[] fArr = {fArrT2[0] - fArrT[0], fArrT2[1] - fArrT[1], fArrT2[2] - fArrT[2]};
        float[] fArrT3 = t(i3);
        float fD = zfe.d(zfe.c(fArr, new float[]{fArrT3[0] - fArrT[0], fArrT3[1] - fArrT[1], fArrT3[2] - fArrT[2]}), zfe.a(zfe.a(s(i), s(i2)), s(i3)));
        ArrayList arrayList = (ArrayList) this.e;
        if (fD < 0.0f) {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i3));
            arrayList.add(Integer.valueOf(i2));
        } else {
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
        }
    }

    public int h(float[] fArr, float[] fArr2, float[] fArr3) {
        ArrayList arrayList = (ArrayList) this.b;
        arrayList.add(Float.valueOf(fArr[0]));
        arrayList.add(Float.valueOf(fArr[1]));
        arrayList.add(Float.valueOf(fArr[2]));
        ArrayList arrayList2 = (ArrayList) this.c;
        arrayList2.add(Float.valueOf(fArr2[0]));
        arrayList2.add(Float.valueOf(fArr2[1]));
        arrayList2.add(Float.valueOf(fArr2[2]));
        ArrayList arrayList3 = (ArrayList) this.d;
        arrayList3.add(Float.valueOf(fArr3[0]));
        arrayList3.add(Float.valueOf(fArr3[1]));
        int i = this.a;
        this.a = i + 1;
        return i;
    }

    @Override // defpackage.f8f
    public c8f i(tnb tnbVar) {
        tnbVar.getClass();
        my7 my7Var = (my7) ((mz0) this.e).d(tnbVar);
        return my7Var != null ? my7Var : ((f8f) ((szc) this.b).c).i(tnbVar);
    }

    public im1 j() {
        ArrayList arrayList = new ArrayList((HashSet) this.b);
        bs9 bs9VarD = bs9.d((k79) this.c);
        int i = this.a;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.d);
        m89 m89Var = (m89) this.e;
        wde wdeVar = wde.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = m89Var.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new im1(arrayList, bs9VarD, i, arrayList2, new wde(arrayMap));
    }

    public ua9 k(int i) {
        return m(i, (ya9) this.b, null, false);
    }

    public ua9 l(String str, boolean z) {
        Object next;
        ya9 ya9Var;
        ua9 ua9Var;
        str.getClass();
        Iterator it = ((el2) fyc.p(new l2(3, (fud) this.c))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ua9Var = (ua9) next;
            if (c5e.v((String) ua9Var.b.f, str, false)) {
                break;
            }
        } while (ua9Var.b.t(str) == null);
        ua9 ua9Var2 = (ua9) next;
        if (ua9Var2 != null) {
            return ua9Var2;
        }
        if (!z || (ya9Var = ((ya9) this.b).c) == null) {
            return null;
        }
        r1f r1fVar = ya9Var.f;
        r1fVar.getClass();
        if (v4e.Q(str)) {
            return null;
        }
        return r1fVar.l(str, true);
    }

    public ua9 m(int i, ua9 ua9Var, ua9 ua9Var2, boolean z) {
        ya9 ya9Var = (ya9) this.b;
        fud fudVar = (fud) this.c;
        ua9 ua9VarM = (ua9) abg.q(fudVar, i);
        if (ua9Var2 != null) {
            if (pa7.t(ua9VarM, ua9Var2) && pa7.t(ua9VarM.c, ua9Var2.c)) {
                return ua9VarM;
            }
            ua9VarM = null;
        } else if (ua9VarM != null) {
            return ua9VarM;
        }
        if (z) {
            Iterator it = ((el2) fyc.p(new l2(3, fudVar))).iterator();
            do {
                if (!it.hasNext()) {
                    ua9VarM = null;
                    break;
                }
                ua9 ua9Var3 = (ua9) it.next();
                ua9VarM = (!(ua9Var3 instanceof ya9) || ua9Var3.equals(ua9Var)) ? null : ((ya9) ua9Var3).f.m(i, ya9Var, ua9Var2, true);
            } while (ua9VarM == null);
        }
        if (ua9VarM != null) {
            return ua9VarM;
        }
        ya9 ya9Var2 = ya9Var.c;
        if (ya9Var2 == null || ya9Var2.equals(ua9Var)) {
            return null;
        }
        ya9 ya9Var3 = ya9Var.c;
        ya9Var3.getClass();
        return ya9Var3.f.m(i, ya9Var, ua9Var2, z);
    }

    public int n(String str) throws jb6 {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        hkg.Z();
        return iGlGetAttribLocation;
    }

    public boolean o(r1f r1fVar, int i) {
        return Objects.equals(((frb[]) this.b)[i], ((frb[]) r1fVar.b)[i]) && Objects.equals(((n55[]) this.c)[i], ((n55[]) r1fVar.c)[i]);
    }

    public boolean p(int i) {
        return ((frb[]) this.b)[i] != null;
    }

    public ta9 q(ta9 ta9Var, gg7 gg7Var, boolean z, ua9 ua9Var) {
        ta9 ta9VarG;
        ya9 ya9Var = (ya9) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = ya9Var.iterator();
        while (true) {
            ab9 ab9Var = (ab9) it;
            ta9VarG = null;
            if (!ab9Var.hasNext()) {
                break;
            }
            ua9 ua9Var2 = (ua9) ab9Var.next();
            ta9VarG = pa7.t(ua9Var2, ua9Var) ? null : ua9Var2.f(gg7Var);
            if (ta9VarG != null) {
                arrayList.add(ta9VarG);
            }
        }
        ta9 ta9Var2 = (ta9) s72.I0(arrayList);
        ya9 ya9Var2 = ya9Var.c;
        if (ya9Var2 != null && z && !ya9Var2.equals(ua9Var)) {
            ta9VarG = ya9Var2.g(gg7Var, ya9Var);
        }
        return (ta9) s72.I0(qd0.k0(new ta9[]{ta9Var, ta9Var2, ta9VarG}));
    }

    public void r(String str) {
        int iHashCode;
        ya9 ya9Var = (ya9) this.b;
        if (str == null) {
            iHashCode = 0;
        } else if (str.equals((String) ya9Var.b.f)) {
            ho7.x("Start destination ", str, " cannot use the same route as the graph ", ya9Var);
            return;
        } else if (v4e.Q(str)) {
            qc0.j("Cannot have an empty start destination route");
            return;
        } else {
            int i = ua9.e;
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.a = iHashCode;
        this.e = str;
    }

    public float[] s(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int i2 = i * 3;
        Object obj = arrayList.get(i2);
        obj.getClass();
        float fFloatValue = ((Number) obj).floatValue();
        Object obj2 = arrayList.get(i2 + 1);
        obj2.getClass();
        float fFloatValue2 = ((Number) obj2).floatValue();
        Object obj3 = arrayList.get(i2 + 2);
        obj3.getClass();
        return new float[]{fFloatValue, fFloatValue2, ((Number) obj3).floatValue()};
    }

    public float[] t(int i) {
        ArrayList arrayList = (ArrayList) this.b;
        int i2 = i * 3;
        Object obj = arrayList.get(i2);
        obj.getClass();
        float fFloatValue = ((Number) obj).floatValue();
        Object obj2 = arrayList.get(i2 + 1);
        obj2.getClass();
        float fFloatValue2 = ((Number) obj2).floatValue();
        Object obj3 = arrayList.get(i2 + 2);
        obj3.getClass();
        return new float[]{fFloatValue, fFloatValue2, ((Number) obj3).floatValue()};
    }

    @Override // defpackage.ssc
    public void b(rye ryeVar, n95 n95Var, xg3 xg3Var) {
    }

    public r1f(ya9 ya9Var) {
        this.b = ya9Var;
        this.c = new fud(0);
    }

    public r1f(frb[] frbVarArr, n55[] n55VarArr, f2f f2fVar, Object obj) {
        pa7.A(frbVarArr.length == n55VarArr.length);
        this.b = frbVarArr;
        this.c = (n55[]) n55VarArr.clone();
        this.d = f2fVar;
        this.e = obj;
        this.a = frbVarArr.length;
    }

    public r1f(szc szcVar, bm3 bm3Var, vf7 vf7Var, int i) {
        szcVar.getClass();
        vf7Var.getClass();
        this.b = szcVar;
        this.c = bm3Var;
        this.a = i;
        ArrayList typeParameters = vf7Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.d = linkedHashMap;
        this.e = ((mf7) ((szc) this.b).b).a.c(new x(25, this));
    }

    public r1f(int i) {
        switch (i) {
            case 2:
                this.b = new HashSet();
                this.c = k79.j();
                this.a = -1;
                this.d = new ArrayList();
                this.e = m89.a();
                break;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = new ArrayList();
                break;
        }
    }

    public r1f(v5f v5fVar, int i) {
        this.e = v5fVar;
        this.b = new zu1(new byte[5], 5);
        this.c = new SparseArray();
        this.d = new SparseIntArray();
        this.a = i;
    }
}
