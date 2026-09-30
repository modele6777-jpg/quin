package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TemplateCategory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wle {
    public static final List a = t72.I(Integer.valueOf(R.string.template2), Integer.valueOf(R.string.template3), Integer.valueOf(R.string.template4), Integer.valueOf(R.string.template5), Integer.valueOf(R.string.template6), Integer.valueOf(R.string.template7), Integer.valueOf(R.string.template8), Integer.valueOf(R.string.template9), Integer.valueOf(R.string.template10), Integer.valueOf(R.string.template11), Integer.valueOf(R.string.template12), Integer.valueOf(R.string.template13), Integer.valueOf(R.string.template14), Integer.valueOf(R.string.template15), Integer.valueOf(R.string.template16), Integer.valueOf(R.string.template17), Integer.valueOf(R.string.template18), Integer.valueOf(R.string.template19), Integer.valueOf(R.string.template20), Integer.valueOf(R.string.template21), Integer.valueOf(R.string.template22), Integer.valueOf(R.string.template23), Integer.valueOf(R.string.template24), Integer.valueOf(R.string.template25), Integer.valueOf(R.string.template26), Integer.valueOf(R.string.template27));

    public static final void a(final j09 j09Var, final String str, final x16 x16Var, final List list, final int i, final x16 x16Var2, final a26 a26Var, final a26 a26Var2, l46 l46Var, final int i2) {
        int i3;
        l46Var.h0(889481035);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? l46Var.g(list) : l46Var.i(list) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var.e(i) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var.i(x16Var2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var.i(a26Var) ? 1048576 : 524288;
        }
        int i4 = 12582912 & i2;
        pu4 pu4Var = pu4.a;
        if (i4 == 0) {
            i3 |= (i2 & 16777216) == 0 ? l46Var.g(pu4Var) : l46Var.i(pu4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= l46Var.i(a26Var2) ? 67108864 : 33554432;
        }
        if (l46Var.W(i3 & 1, (i3 & 38347923) != 38347922)) {
            List listC1 = list != null ? s72.c1(list, i) : pu4Var;
            boolean z = i < (list != null ? list.size() : 0) && i < 50;
            j18 j18VarA = k18.a(0, 3, l46Var);
            Integer numValueOf = Integer.valueOf(i);
            boolean zG = l46Var.g(j18VarA) | ((i3 & 57344) == 16384);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = new vle(j18VarA, i, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, numValueOf);
            uc0 uc0Var = new uc0(12.0f, true, new qc0(0));
            bx9 bx9VarR = ynb.r(0.0f, 8.0f, 0.0f, 24.0f, 5);
            boolean zI = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608 || ((i3 & 16777216) != 0 && l46Var.i(pu4Var))) | ((234881024 & i3) == 67108864) | l46Var.i(listC1) | ((3670016 & i3) == 1048576) | l46Var.h(z) | ((458752 & i3) == 131072);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                Object tz8Var = new tz8(str, listC1, z, x16Var, a26Var2, a26Var, x16Var2);
                l46Var.p0(tz8Var);
                objR2 = tz8Var;
            }
            af1.s(j09Var, j18VarA, bx9VarR, uc0Var, null, null, false, null, (a26) objR2, l46Var, (i3 & 14) | 24576, 488);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: tle
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wle.a(j09Var, str, x16Var, list, i, x16Var2, a26Var, a26Var2, (l46) obj2, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x016a  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0193  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:159:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:162:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:171:0x0202 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x0204  */
    /* JADX WARN: Code duplicated, block: B:173:0x0207  */
    /* JADX WARN: Code duplicated, block: B:176:0x0210  */
    /* JADX WARN: Code duplicated, block: B:178:0x0226  */
    /* JADX WARN: Code duplicated, block: B:179:0x0240  */
    /* JADX WARN: Code duplicated, block: B:181:0x026d  */
    /* JADX WARN: Code duplicated, block: B:183:0x027f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0299  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:189:0x0315  */
    /* JADX WARN: Code duplicated, block: B:192:0x032b  */
    /* JADX WARN: Code duplicated, block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129 A[ADDED_TO_REGION] */
    public static final void b(j09 j09Var, String str, boolean z, Boolean bool, u51 u51Var, q11 q11Var, x4d x4dVar, mue mueVar, yi4 yi4Var, xw9 xw9Var, boolean z2, x16 x16Var, l46 l46Var, int i, int i2, int i3) {
        j09 j09Var2;
        int i4;
        Object obj;
        int i5;
        int i6;
        u51 u51Var2;
        int i7;
        int i8;
        q11 q11Var2;
        int i9;
        int i10;
        x4d x4dVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        mue mueVar2;
        yi4 yi4Var2;
        xw9 xw9Var2;
        j09 j09Var3;
        q11 q11Var3;
        x4d x4dVar3;
        Boolean bool2;
        boolean z4;
        ojb ojbVarV;
        j09 j09Var4;
        Boolean bool3;
        mue mueVar3;
        yi4 yi4Var3;
        xw9 xw9Var3;
        j09 j09Var5;
        u51 u51Var3;
        q11 q11Var4;
        xw9 xw9Var4;
        x4d x4dVar4;
        int i21;
        yi4 yi4Var4;
        boolean z5;
        float f;
        boolean z6;
        u51 u51VarB;
        q11 q11VarB;
        x4d x4dVar5;
        pr4 pr4Var;
        long jB;
        int i22;
        str.getClass();
        x16Var.getClass();
        l46Var.h0(744453519);
        int i23 = i3 & 1;
        if (i23 != 0) {
            i4 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            obj = str;
            i4 |= l46Var.g(obj) ? 32 : 16;
        } else {
            obj = str;
        }
        if ((i & 384) == 0) {
            i4 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i24 = i3 & 8;
        if (i24 == 0) {
            if ((i & 3072) == 0) {
                i4 |= l46Var.g(bool) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i5 = i4 | 24576;
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    u51Var2 = u51Var;
                    if (l46Var.g(u51Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    q11Var2 = q11Var;
                } else {
                    q11Var2 = q11Var;
                    if ((i & 1572864) == 0) {
                        if (l46Var.g(q11Var2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                }
                i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i10 != 0) {
                    i5 |= 12582912;
                    x4dVar2 = x4dVar;
                } else {
                    x4dVar2 = x4dVar;
                    if ((i & 12582912) == 0) {
                        if (l46Var.g(x4dVar2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i5 |= i11;
                    }
                }
                i12 = i3 & 256;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (l46Var.g(mueVar)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i5 |= i13;
                    }
                    i14 = i3 & 512;
                    if (i14 != 0) {
                        if ((i & 805306368) == 0) {
                            if (l46Var.g(yi4Var)) {
                                i15 = 536870912;
                            } else {
                                i15 = 268435456;
                            }
                            i5 |= i15;
                        }
                        if ((i2 & 6) == 0) {
                            i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                        } else {
                            i16 = i2;
                        }
                        i17 = i3 & 2048;
                        if (i17 != 0) {
                            if ((i2 & 48) == 0) {
                                if (l46Var.h(z2)) {
                                    i18 = 32;
                                } else {
                                    i18 = 16;
                                }
                                i16 |= i18;
                            }
                            if ((i2 & 384) != 0) {
                                if (l46Var.i(x16Var)) {
                                    i22 = 256;
                                } else {
                                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                i16 |= i22;
                            }
                            i19 = i16;
                            i20 = i5;
                            if ((i5 & 306783379) == 306783378 || (i19 & 147) != 146) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (l46Var.W(i20 & 1, z3)) {
                                l46Var.b0();
                                if ((i & 1) != 0 || l46Var.C()) {
                                    if (i23 != 0) {
                                        j09Var4 = g09.a;
                                    } else {
                                        j09Var4 = j09Var2;
                                    }
                                    if (i24 != 0) {
                                        bool3 = null;
                                    } else {
                                        bool3 = bool;
                                    }
                                    if (i6 != 0) {
                                        u51Var2 = null;
                                    }
                                    if (i8 != 0) {
                                        q11Var2 = null;
                                    }
                                    if (i10 != 0) {
                                        x4dVar2 = null;
                                    }
                                    if (i12 != 0) {
                                        mueVar3 = null;
                                    } else {
                                        mueVar3 = mueVar;
                                    }
                                    yi4Var3 = i14 == 0 ? yi4Var : null;
                                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        xw9Var3 = v51.a;
                                        i19 &= -15;
                                    } else {
                                        xw9Var3 = xw9Var;
                                    }
                                    j09Var5 = j09Var4;
                                    u51Var3 = u51Var2;
                                    if (i17 != 0) {
                                        q11Var4 = q11Var2;
                                        xw9Var4 = xw9Var3;
                                        x4dVar4 = x4dVar2;
                                        i21 = i19;
                                        yi4Var4 = yi4Var3;
                                        z5 = true;
                                    } else {
                                        q11Var4 = q11Var2;
                                        xw9Var4 = xw9Var3;
                                        x4dVar4 = x4dVar2;
                                        i21 = i19;
                                        yi4Var4 = yi4Var3;
                                        z5 = z2;
                                    }
                                } else {
                                    l46Var.Z();
                                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i19 &= -15;
                                    }
                                    mueVar3 = mueVar;
                                    z5 = z2;
                                    i21 = i19;
                                    j09Var5 = j09Var2;
                                    u51Var3 = u51Var2;
                                    q11Var4 = q11Var2;
                                    x4dVar4 = x4dVar2;
                                    bool3 = bool;
                                    yi4Var4 = yi4Var;
                                    xw9Var4 = xw9Var;
                                }
                                l46Var.s();
                                if (yi4Var4 != null) {
                                    f = yi4Var4.a;
                                } else if (z) {
                                    f = 64.0f;
                                } else {
                                    f = 48.0f;
                                }
                                j09 j09VarB = b.b(0.0f, f, j09Var5, 1);
                                if (u51Var3 == null) {
                                    l46Var.f0(-1839688364);
                                    bx9 bx9Var = v51.a;
                                    pr4Var = l8b.a;
                                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                        l46Var.f0(-1839684646);
                                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                        l46Var.r(false);
                                    } else {
                                        l46Var.f0(-1839683654);
                                        l46Var.r(false);
                                        jB = y72.j;
                                    }
                                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                    z6 = false;
                                    l46Var.r(false);
                                } else {
                                    z6 = false;
                                    l46Var.f0(-1839689139);
                                    l46Var.r(false);
                                    u51VarB = u51Var3;
                                }
                                if (q11Var4 == null) {
                                    l46Var.f0(-1839680421);
                                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                    l46Var.r(z6);
                                } else {
                                    l46Var.f0(-1839680731);
                                    l46Var.r(z6);
                                    q11VarB = q11Var4;
                                }
                                if (x4dVar4 == null) {
                                    l46Var.f0(-1839677867);
                                    x4dVar5 = eze.a(l46Var).a.j;
                                    l46Var.r(z6);
                                } else {
                                    l46Var.f0(-1839678580);
                                    l46Var.r(z6);
                                    x4dVar5 = x4dVar4;
                                }
                                Boolean bool4 = bool3;
                                mue mueVar4 = mueVar3;
                                cgg.a(x16Var, j09VarB, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool4, mueVar4, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                                z4 = z5;
                                xw9Var2 = xw9Var4;
                                j09Var3 = j09Var5;
                                u51Var2 = u51Var3;
                                q11Var3 = q11Var4;
                                x4dVar3 = x4dVar4;
                                bool2 = bool4;
                                mueVar2 = mueVar4;
                                yi4Var2 = yi4Var4;
                            } else {
                                l46Var.Z();
                                mueVar2 = mueVar;
                                yi4Var2 = yi4Var;
                                xw9Var2 = xw9Var;
                                j09Var3 = j09Var2;
                                q11Var3 = q11Var2;
                                x4dVar3 = x4dVar2;
                                bool2 = bool;
                                z4 = z2;
                            }
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                            }
                        }
                        i16 |= 48;
                        if ((i2 & 384) != 0) {
                            if (l46Var.i(x16Var)) {
                                i22 = 256;
                            } else {
                                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i16 |= i22;
                        }
                        i19 = i16;
                        i20 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i20 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0) {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            } else {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            }
                            l46Var.s();
                            if (yi4Var4 != null) {
                                f = yi4Var4.a;
                            } else if (z) {
                                f = 64.0f;
                            } else {
                                f = 48.0f;
                            }
                            j09 j09VarB2 = b.b(0.0f, f, j09Var5, 1);
                            if (u51Var3 == null) {
                                l46Var.f0(-1839688364);
                                bx9 bx9Var2 = v51.a;
                                pr4Var = l8b.a;
                                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                    l46Var.f0(-1839684646);
                                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-1839683654);
                                    l46Var.r(false);
                                    jB = y72.j;
                                }
                                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1839689139);
                                l46Var.r(false);
                                u51VarB = u51Var3;
                            }
                            if (q11Var4 == null) {
                                l46Var.f0(-1839680421);
                                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839680731);
                                l46Var.r(z6);
                                q11VarB = q11Var4;
                            }
                            if (x4dVar4 == null) {
                                l46Var.f0(-1839677867);
                                x4dVar5 = eze.a(l46Var).a.j;
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839678580);
                                l46Var.r(z6);
                                x4dVar5 = x4dVar4;
                            }
                            Boolean bool5 = bool3;
                            mue mueVar5 = mueVar3;
                            cgg.a(x16Var, j09VarB2, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool5, mueVar5, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                            z4 = z5;
                            xw9Var2 = xw9Var4;
                            j09Var3 = j09Var5;
                            u51Var2 = u51Var3;
                            q11Var3 = q11Var4;
                            x4dVar3 = x4dVar4;
                            bool2 = bool5;
                            mueVar2 = mueVar5;
                            yi4Var2 = yi4Var4;
                        } else {
                            l46Var.Z();
                            mueVar2 = mueVar;
                            yi4Var2 = yi4Var;
                            xw9Var2 = xw9Var;
                            j09Var3 = j09Var2;
                            q11Var3 = q11Var2;
                            x4dVar3 = x4dVar2;
                            bool2 = bool;
                            z4 = z2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                        }
                    }
                    i5 |= 805306368;
                    if ((i2 & 6) == 0) {
                        i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                    } else {
                        i16 = i2;
                    }
                    i17 = i3 & 2048;
                    if (i17 != 0) {
                        if ((i2 & 48) == 0) {
                            if (l46Var.h(z2)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i2 & 384) != 0) {
                            if (l46Var.i(x16Var)) {
                                i22 = 256;
                            } else {
                                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i16 |= i22;
                        }
                        i19 = i16;
                        i20 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i20 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0) {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            } else {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            }
                            l46Var.s();
                            if (yi4Var4 != null) {
                                f = yi4Var4.a;
                            } else if (z) {
                                f = 64.0f;
                            } else {
                                f = 48.0f;
                            }
                            j09 j09VarB3 = b.b(0.0f, f, j09Var5, 1);
                            if (u51Var3 == null) {
                                l46Var.f0(-1839688364);
                                bx9 bx9Var3 = v51.a;
                                pr4Var = l8b.a;
                                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                    l46Var.f0(-1839684646);
                                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-1839683654);
                                    l46Var.r(false);
                                    jB = y72.j;
                                }
                                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1839689139);
                                l46Var.r(false);
                                u51VarB = u51Var3;
                            }
                            if (q11Var4 == null) {
                                l46Var.f0(-1839680421);
                                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839680731);
                                l46Var.r(z6);
                                q11VarB = q11Var4;
                            }
                            if (x4dVar4 == null) {
                                l46Var.f0(-1839677867);
                                x4dVar5 = eze.a(l46Var).a.j;
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839678580);
                                l46Var.r(z6);
                                x4dVar5 = x4dVar4;
                            }
                            Boolean bool6 = bool3;
                            mue mueVar6 = mueVar3;
                            cgg.a(x16Var, j09VarB3, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool6, mueVar6, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                            z4 = z5;
                            xw9Var2 = xw9Var4;
                            j09Var3 = j09Var5;
                            u51Var2 = u51Var3;
                            q11Var3 = q11Var4;
                            x4dVar3 = x4dVar4;
                            bool2 = bool6;
                            mueVar2 = mueVar6;
                            yi4Var2 = yi4Var4;
                        } else {
                            l46Var.Z();
                            mueVar2 = mueVar;
                            yi4Var2 = yi4Var;
                            xw9Var2 = xw9Var;
                            j09Var3 = j09Var2;
                            q11Var3 = q11Var2;
                            x4dVar3 = x4dVar2;
                            bool2 = bool;
                            z4 = z2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                        }
                    }
                    i16 |= 48;
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB4 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var4 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool7 = bool3;
                        mue mueVar7 = mueVar3;
                        cgg.a(x16Var, j09VarB4, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool7, mueVar7, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool7;
                        mueVar2 = mueVar7;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i5 |= 100663296;
                i14 = i3 & 512;
                if (i14 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(yi4Var)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i5 |= i15;
                    }
                    if ((i2 & 6) == 0) {
                        i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                    } else {
                        i16 = i2;
                    }
                    i17 = i3 & 2048;
                    if (i17 != 0) {
                        if ((i2 & 48) == 0) {
                            if (l46Var.h(z2)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i2 & 384) != 0) {
                            if (l46Var.i(x16Var)) {
                                i22 = 256;
                            } else {
                                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i16 |= i22;
                        }
                        i19 = i16;
                        i20 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i20 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0) {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            } else {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            }
                            l46Var.s();
                            if (yi4Var4 != null) {
                                f = yi4Var4.a;
                            } else if (z) {
                                f = 64.0f;
                            } else {
                                f = 48.0f;
                            }
                            j09 j09VarB5 = b.b(0.0f, f, j09Var5, 1);
                            if (u51Var3 == null) {
                                l46Var.f0(-1839688364);
                                bx9 bx9Var5 = v51.a;
                                pr4Var = l8b.a;
                                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                    l46Var.f0(-1839684646);
                                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-1839683654);
                                    l46Var.r(false);
                                    jB = y72.j;
                                }
                                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1839689139);
                                l46Var.r(false);
                                u51VarB = u51Var3;
                            }
                            if (q11Var4 == null) {
                                l46Var.f0(-1839680421);
                                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839680731);
                                l46Var.r(z6);
                                q11VarB = q11Var4;
                            }
                            if (x4dVar4 == null) {
                                l46Var.f0(-1839677867);
                                x4dVar5 = eze.a(l46Var).a.j;
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839678580);
                                l46Var.r(z6);
                                x4dVar5 = x4dVar4;
                            }
                            Boolean bool8 = bool3;
                            mue mueVar8 = mueVar3;
                            cgg.a(x16Var, j09VarB5, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool8, mueVar8, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                            z4 = z5;
                            xw9Var2 = xw9Var4;
                            j09Var3 = j09Var5;
                            u51Var2 = u51Var3;
                            q11Var3 = q11Var4;
                            x4dVar3 = x4dVar4;
                            bool2 = bool8;
                            mueVar2 = mueVar8;
                            yi4Var2 = yi4Var4;
                        } else {
                            l46Var.Z();
                            mueVar2 = mueVar;
                            yi4Var2 = yi4Var;
                            xw9Var2 = xw9Var;
                            j09Var3 = j09Var2;
                            q11Var3 = q11Var2;
                            x4dVar3 = x4dVar2;
                            bool2 = bool;
                            z4 = z2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                        }
                    }
                    i16 |= 48;
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB6 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var6 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool9 = bool3;
                        mue mueVar9 = mueVar3;
                        cgg.a(x16Var, j09VarB6, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool9, mueVar9, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool9;
                        mueVar2 = mueVar9;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i5 |= 805306368;
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB7 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var7 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool10 = bool3;
                        mue mueVar10 = mueVar3;
                        cgg.a(x16Var, j09VarB7, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool10, mueVar10, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool10;
                        mueVar2 = mueVar10;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB8 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var8 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool11 = bool3;
                    mue mueVar11 = mueVar3;
                    cgg.a(x16Var, j09VarB8, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool11, mueVar11, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool11;
                    mueVar2 = mueVar11;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 = 221184 | i4;
            u51Var2 = u51Var;
            i8 = i3 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                q11Var2 = q11Var;
            } else {
                q11Var2 = q11Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.g(q11Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                i5 |= 12582912;
                x4dVar2 = x4dVar;
            } else {
                x4dVar2 = x4dVar;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(x4dVar2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (l46Var.g(mueVar)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                i14 = i3 & 512;
                if (i14 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(yi4Var)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i5 |= i15;
                    }
                    if ((i2 & 6) == 0) {
                        i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                    } else {
                        i16 = i2;
                    }
                    i17 = i3 & 2048;
                    if (i17 != 0) {
                        if ((i2 & 48) == 0) {
                            if (l46Var.h(z2)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i2 & 384) != 0) {
                            if (l46Var.i(x16Var)) {
                                i22 = 256;
                            } else {
                                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i16 |= i22;
                        }
                        i19 = i16;
                        i20 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i20 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0) {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            } else {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            }
                            l46Var.s();
                            if (yi4Var4 != null) {
                                f = yi4Var4.a;
                            } else if (z) {
                                f = 64.0f;
                            } else {
                                f = 48.0f;
                            }
                            j09 j09VarB9 = b.b(0.0f, f, j09Var5, 1);
                            if (u51Var3 == null) {
                                l46Var.f0(-1839688364);
                                bx9 bx9Var9 = v51.a;
                                pr4Var = l8b.a;
                                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                    l46Var.f0(-1839684646);
                                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-1839683654);
                                    l46Var.r(false);
                                    jB = y72.j;
                                }
                                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1839689139);
                                l46Var.r(false);
                                u51VarB = u51Var3;
                            }
                            if (q11Var4 == null) {
                                l46Var.f0(-1839680421);
                                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839680731);
                                l46Var.r(z6);
                                q11VarB = q11Var4;
                            }
                            if (x4dVar4 == null) {
                                l46Var.f0(-1839677867);
                                x4dVar5 = eze.a(l46Var).a.j;
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839678580);
                                l46Var.r(z6);
                                x4dVar5 = x4dVar4;
                            }
                            Boolean bool12 = bool3;
                            mue mueVar12 = mueVar3;
                            cgg.a(x16Var, j09VarB9, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool12, mueVar12, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                            z4 = z5;
                            xw9Var2 = xw9Var4;
                            j09Var3 = j09Var5;
                            u51Var2 = u51Var3;
                            q11Var3 = q11Var4;
                            x4dVar3 = x4dVar4;
                            bool2 = bool12;
                            mueVar2 = mueVar12;
                            yi4Var2 = yi4Var4;
                        } else {
                            l46Var.Z();
                            mueVar2 = mueVar;
                            yi4Var2 = yi4Var;
                            xw9Var2 = xw9Var;
                            j09Var3 = j09Var2;
                            q11Var3 = q11Var2;
                            x4dVar3 = x4dVar2;
                            bool2 = bool;
                            z4 = z2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                        }
                    }
                    i16 |= 48;
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB10 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var10 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool13 = bool3;
                        mue mueVar13 = mueVar3;
                        cgg.a(x16Var, j09VarB10, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool13, mueVar13, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool13;
                        mueVar2 = mueVar13;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i5 |= 805306368;
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB11 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var11 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool14 = bool3;
                        mue mueVar14 = mueVar3;
                        cgg.a(x16Var, j09VarB11, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool14, mueVar14, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool14;
                        mueVar2 = mueVar14;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB12 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var12 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool15 = bool3;
                    mue mueVar15 = mueVar3;
                    cgg.a(x16Var, j09VarB12, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool15, mueVar15, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool15;
                    mueVar2 = mueVar15;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 |= 100663296;
            i14 = i3 & 512;
            if (i14 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.g(yi4Var)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB13 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var13 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool16 = bool3;
                        mue mueVar16 = mueVar3;
                        cgg.a(x16Var, j09VarB13, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool16, mueVar16, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool16;
                        mueVar2 = mueVar16;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB14 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var14 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool17 = bool3;
                    mue mueVar17 = mueVar3;
                    cgg.a(x16Var, j09VarB14, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool17, mueVar17, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool17;
                    mueVar2 = mueVar17;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 |= 805306368;
            if ((i2 & 6) == 0) {
                i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
            } else {
                i16 = i2;
            }
            i17 = i3 & 2048;
            if (i17 != 0) {
                if ((i2 & 48) == 0) {
                    if (l46Var.h(z2)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB15 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var15 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool18 = bool3;
                    mue mueVar18 = mueVar3;
                    cgg.a(x16Var, j09VarB15, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool18, mueVar18, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool18;
                    mueVar2 = mueVar18;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i16 |= 48;
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 256;
                } else {
                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i16 |= i22;
            }
            i19 = i16;
            i20 = i5;
            if ((i5 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i20 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                } else {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                }
                l46Var.s();
                if (yi4Var4 != null) {
                    f = yi4Var4.a;
                } else if (z) {
                    f = 64.0f;
                } else {
                    f = 48.0f;
                }
                j09 j09VarB16 = b.b(0.0f, f, j09Var5, 1);
                if (u51Var3 == null) {
                    l46Var.f0(-1839688364);
                    bx9 bx9Var16 = v51.a;
                    pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                        l46Var.f0(-1839684646);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1839683654);
                        l46Var.r(false);
                        jB = y72.j;
                    }
                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                    z6 = false;
                    l46Var.r(false);
                } else {
                    z6 = false;
                    l46Var.f0(-1839689139);
                    l46Var.r(false);
                    u51VarB = u51Var3;
                }
                if (q11Var4 == null) {
                    l46Var.f0(-1839680421);
                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839680731);
                    l46Var.r(z6);
                    q11VarB = q11Var4;
                }
                if (x4dVar4 == null) {
                    l46Var.f0(-1839677867);
                    x4dVar5 = eze.a(l46Var).a.j;
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839678580);
                    l46Var.r(z6);
                    x4dVar5 = x4dVar4;
                }
                Boolean bool19 = bool3;
                mue mueVar19 = mueVar3;
                cgg.a(x16Var, j09VarB16, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool19, mueVar19, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                z4 = z5;
                xw9Var2 = xw9Var4;
                j09Var3 = j09Var5;
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                x4dVar3 = x4dVar4;
                bool2 = bool19;
                mueVar2 = mueVar19;
                yi4Var2 = yi4Var4;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                yi4Var2 = yi4Var;
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                q11Var3 = q11Var2;
                x4dVar3 = x4dVar2;
                bool2 = bool;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
            }
        }
        i4 |= 3072;
        i5 = i4 | 24576;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                u51Var2 = u51Var;
                if (l46Var.g(u51Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                q11Var2 = q11Var;
            } else {
                q11Var2 = q11Var;
                if ((i & 1572864) == 0) {
                    if (l46Var.g(q11Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i10 != 0) {
                i5 |= 12582912;
                x4dVar2 = x4dVar;
            } else {
                x4dVar2 = x4dVar;
                if ((i & 12582912) == 0) {
                    if (l46Var.g(x4dVar2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i5 |= i11;
                }
            }
            i12 = i3 & 256;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (l46Var.g(mueVar)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i5 |= i13;
                }
                i14 = i3 & 512;
                if (i14 != 0) {
                    if ((i & 805306368) == 0) {
                        if (l46Var.g(yi4Var)) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i5 |= i15;
                    }
                    if ((i2 & 6) == 0) {
                        i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                    } else {
                        i16 = i2;
                    }
                    i17 = i3 & 2048;
                    if (i17 != 0) {
                        if ((i2 & 48) == 0) {
                            if (l46Var.h(z2)) {
                                i18 = 32;
                            } else {
                                i18 = 16;
                            }
                            i16 |= i18;
                        }
                        if ((i2 & 384) != 0) {
                            if (l46Var.i(x16Var)) {
                                i22 = 256;
                            } else {
                                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                            }
                            i16 |= i22;
                        }
                        i19 = i16;
                        i20 = i5;
                        if ((i5 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (l46Var.W(i20 & 1, z3)) {
                            l46Var.b0();
                            if ((i & 1) != 0) {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            } else {
                                if (i23 != 0) {
                                    j09Var4 = g09.a;
                                } else {
                                    j09Var4 = j09Var2;
                                }
                                if (i24 != 0) {
                                    bool3 = null;
                                } else {
                                    bool3 = bool;
                                }
                                if (i6 != 0) {
                                    u51Var2 = null;
                                }
                                if (i8 != 0) {
                                    q11Var2 = null;
                                }
                                if (i10 != 0) {
                                    x4dVar2 = null;
                                }
                                if (i12 != 0) {
                                    mueVar3 = null;
                                } else {
                                    mueVar3 = mueVar;
                                }
                                if (i14 == 0) {
                                }
                                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    xw9Var3 = v51.a;
                                    i19 &= -15;
                                } else {
                                    xw9Var3 = xw9Var;
                                }
                                j09Var5 = j09Var4;
                                u51Var3 = u51Var2;
                                if (i17 != 0) {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = true;
                                } else {
                                    q11Var4 = q11Var2;
                                    xw9Var4 = xw9Var3;
                                    x4dVar4 = x4dVar2;
                                    i21 = i19;
                                    yi4Var4 = yi4Var3;
                                    z5 = z2;
                                }
                            }
                            l46Var.s();
                            if (yi4Var4 != null) {
                                f = yi4Var4.a;
                            } else if (z) {
                                f = 64.0f;
                            } else {
                                f = 48.0f;
                            }
                            j09 j09VarB17 = b.b(0.0f, f, j09Var5, 1);
                            if (u51Var3 == null) {
                                l46Var.f0(-1839688364);
                                bx9 bx9Var17 = v51.a;
                                pr4Var = l8b.a;
                                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                    l46Var.f0(-1839684646);
                                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-1839683654);
                                    l46Var.r(false);
                                    jB = y72.j;
                                }
                                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                                z6 = false;
                                l46Var.r(false);
                            } else {
                                z6 = false;
                                l46Var.f0(-1839689139);
                                l46Var.r(false);
                                u51VarB = u51Var3;
                            }
                            if (q11Var4 == null) {
                                l46Var.f0(-1839680421);
                                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839680731);
                                l46Var.r(z6);
                                q11VarB = q11Var4;
                            }
                            if (x4dVar4 == null) {
                                l46Var.f0(-1839677867);
                                x4dVar5 = eze.a(l46Var).a.j;
                                l46Var.r(z6);
                            } else {
                                l46Var.f0(-1839678580);
                                l46Var.r(z6);
                                x4dVar5 = x4dVar4;
                            }
                            Boolean bool110 = bool3;
                            mue mueVar110 = mueVar3;
                            cgg.a(x16Var, j09VarB17, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool110, mueVar110, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                            z4 = z5;
                            xw9Var2 = xw9Var4;
                            j09Var3 = j09Var5;
                            u51Var2 = u51Var3;
                            q11Var3 = q11Var4;
                            x4dVar3 = x4dVar4;
                            bool2 = bool110;
                            mueVar2 = mueVar110;
                            yi4Var2 = yi4Var4;
                        } else {
                            l46Var.Z();
                            mueVar2 = mueVar;
                            yi4Var2 = yi4Var;
                            xw9Var2 = xw9Var;
                            j09Var3 = j09Var2;
                            q11Var3 = q11Var2;
                            x4dVar3 = x4dVar2;
                            bool2 = bool;
                            z4 = z2;
                        }
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                        }
                    }
                    i16 |= 48;
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB18 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var18 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool111 = bool3;
                        mue mueVar111 = mueVar3;
                        cgg.a(x16Var, j09VarB18, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool111, mueVar111, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool111;
                        mueVar2 = mueVar111;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i5 |= 805306368;
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB19 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var19 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool112 = bool3;
                        mue mueVar112 = mueVar3;
                        cgg.a(x16Var, j09VarB19, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool112, mueVar112, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool112;
                        mueVar2 = mueVar112;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB110 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var110 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool113 = bool3;
                    mue mueVar113 = mueVar3;
                    cgg.a(x16Var, j09VarB110, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool113, mueVar113, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool113;
                    mueVar2 = mueVar113;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 |= 100663296;
            i14 = i3 & 512;
            if (i14 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.g(yi4Var)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB111 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var111 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool114 = bool3;
                        mue mueVar114 = mueVar3;
                        cgg.a(x16Var, j09VarB111, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool114, mueVar114, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool114;
                        mueVar2 = mueVar114;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB112 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var112 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool115 = bool3;
                    mue mueVar115 = mueVar3;
                    cgg.a(x16Var, j09VarB112, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool115, mueVar115, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool115;
                    mueVar2 = mueVar115;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 |= 805306368;
            if ((i2 & 6) == 0) {
                i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
            } else {
                i16 = i2;
            }
            i17 = i3 & 2048;
            if (i17 != 0) {
                if ((i2 & 48) == 0) {
                    if (l46Var.h(z2)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB113 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var113 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool116 = bool3;
                    mue mueVar116 = mueVar3;
                    cgg.a(x16Var, j09VarB113, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool116, mueVar116, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool116;
                    mueVar2 = mueVar116;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i16 |= 48;
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 256;
                } else {
                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i16 |= i22;
            }
            i19 = i16;
            i20 = i5;
            if ((i5 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i20 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                } else {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                }
                l46Var.s();
                if (yi4Var4 != null) {
                    f = yi4Var4.a;
                } else if (z) {
                    f = 64.0f;
                } else {
                    f = 48.0f;
                }
                j09 j09VarB114 = b.b(0.0f, f, j09Var5, 1);
                if (u51Var3 == null) {
                    l46Var.f0(-1839688364);
                    bx9 bx9Var114 = v51.a;
                    pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                        l46Var.f0(-1839684646);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1839683654);
                        l46Var.r(false);
                        jB = y72.j;
                    }
                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                    z6 = false;
                    l46Var.r(false);
                } else {
                    z6 = false;
                    l46Var.f0(-1839689139);
                    l46Var.r(false);
                    u51VarB = u51Var3;
                }
                if (q11Var4 == null) {
                    l46Var.f0(-1839680421);
                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839680731);
                    l46Var.r(z6);
                    q11VarB = q11Var4;
                }
                if (x4dVar4 == null) {
                    l46Var.f0(-1839677867);
                    x4dVar5 = eze.a(l46Var).a.j;
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839678580);
                    l46Var.r(z6);
                    x4dVar5 = x4dVar4;
                }
                Boolean bool117 = bool3;
                mue mueVar117 = mueVar3;
                cgg.a(x16Var, j09VarB114, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool117, mueVar117, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                z4 = z5;
                xw9Var2 = xw9Var4;
                j09Var3 = j09Var5;
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                x4dVar3 = x4dVar4;
                bool2 = bool117;
                mueVar2 = mueVar117;
                yi4Var2 = yi4Var4;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                yi4Var2 = yi4Var;
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                q11Var3 = q11Var2;
                x4dVar3 = x4dVar2;
                bool2 = bool;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
            }
        }
        i5 = 221184 | i4;
        u51Var2 = u51Var;
        i8 = i3 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            q11Var2 = q11Var;
        } else {
            q11Var2 = q11Var;
            if ((i & 1572864) == 0) {
                if (l46Var.g(q11Var2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
        }
        i10 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i10 != 0) {
            i5 |= 12582912;
            x4dVar2 = x4dVar;
        } else {
            x4dVar2 = x4dVar;
            if ((i & 12582912) == 0) {
                if (l46Var.g(x4dVar2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i5 |= i11;
            }
        }
        i12 = i3 & 256;
        if (i12 != 0) {
            if ((i & 100663296) == 0) {
                if (l46Var.g(mueVar)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i5 |= i13;
            }
            i14 = i3 & 512;
            if (i14 != 0) {
                if ((i & 805306368) == 0) {
                    if (l46Var.g(yi4Var)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i5 |= i15;
                }
                if ((i2 & 6) == 0) {
                    i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
                } else {
                    i16 = i2;
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                    if ((i2 & 48) == 0) {
                        if (l46Var.h(z2)) {
                            i18 = 32;
                        } else {
                            i18 = 16;
                        }
                        i16 |= i18;
                    }
                    if ((i2 & 384) != 0) {
                        if (l46Var.i(x16Var)) {
                            i22 = 256;
                        } else {
                            i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i16 |= i22;
                    }
                    i19 = i16;
                    i20 = i5;
                    if ((i5 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (l46Var.W(i20 & 1, z3)) {
                        l46Var.b0();
                        if ((i & 1) != 0) {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        } else {
                            if (i23 != 0) {
                                j09Var4 = g09.a;
                            } else {
                                j09Var4 = j09Var2;
                            }
                            if (i24 != 0) {
                                bool3 = null;
                            } else {
                                bool3 = bool;
                            }
                            if (i6 != 0) {
                                u51Var2 = null;
                            }
                            if (i8 != 0) {
                                q11Var2 = null;
                            }
                            if (i10 != 0) {
                                x4dVar2 = null;
                            }
                            if (i12 != 0) {
                                mueVar3 = null;
                            } else {
                                mueVar3 = mueVar;
                            }
                            if (i14 == 0) {
                            }
                            if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                xw9Var3 = v51.a;
                                i19 &= -15;
                            } else {
                                xw9Var3 = xw9Var;
                            }
                            j09Var5 = j09Var4;
                            u51Var3 = u51Var2;
                            if (i17 != 0) {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = true;
                            } else {
                                q11Var4 = q11Var2;
                                xw9Var4 = xw9Var3;
                                x4dVar4 = x4dVar2;
                                i21 = i19;
                                yi4Var4 = yi4Var3;
                                z5 = z2;
                            }
                        }
                        l46Var.s();
                        if (yi4Var4 != null) {
                            f = yi4Var4.a;
                        } else if (z) {
                            f = 64.0f;
                        } else {
                            f = 48.0f;
                        }
                        j09 j09VarB115 = b.b(0.0f, f, j09Var5, 1);
                        if (u51Var3 == null) {
                            l46Var.f0(-1839688364);
                            bx9 bx9Var115 = v51.a;
                            pr4Var = l8b.a;
                            if (k8b.e((e8b) l46Var.k(pr4Var))) {
                                l46Var.f0(-1839684646);
                                jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-1839683654);
                                l46Var.r(false);
                                jB = y72.j;
                            }
                            u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                            z6 = false;
                            l46Var.r(false);
                        } else {
                            z6 = false;
                            l46Var.f0(-1839689139);
                            l46Var.r(false);
                            u51VarB = u51Var3;
                        }
                        if (q11Var4 == null) {
                            l46Var.f0(-1839680421);
                            q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839680731);
                            l46Var.r(z6);
                            q11VarB = q11Var4;
                        }
                        if (x4dVar4 == null) {
                            l46Var.f0(-1839677867);
                            x4dVar5 = eze.a(l46Var).a.j;
                            l46Var.r(z6);
                        } else {
                            l46Var.f0(-1839678580);
                            l46Var.r(z6);
                            x4dVar5 = x4dVar4;
                        }
                        Boolean bool118 = bool3;
                        mue mueVar118 = mueVar3;
                        cgg.a(x16Var, j09VarB115, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool118, mueVar118, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                        z4 = z5;
                        xw9Var2 = xw9Var4;
                        j09Var3 = j09Var5;
                        u51Var2 = u51Var3;
                        q11Var3 = q11Var4;
                        x4dVar3 = x4dVar4;
                        bool2 = bool118;
                        mueVar2 = mueVar118;
                        yi4Var2 = yi4Var4;
                    } else {
                        l46Var.Z();
                        mueVar2 = mueVar;
                        yi4Var2 = yi4Var;
                        xw9Var2 = xw9Var;
                        j09Var3 = j09Var2;
                        q11Var3 = q11Var2;
                        x4dVar3 = x4dVar2;
                        bool2 = bool;
                        z4 = z2;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                    }
                }
                i16 |= 48;
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB116 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var116 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool119 = bool3;
                    mue mueVar119 = mueVar3;
                    cgg.a(x16Var, j09VarB116, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool119, mueVar119, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool119;
                    mueVar2 = mueVar119;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i5 |= 805306368;
            if ((i2 & 6) == 0) {
                i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
            } else {
                i16 = i2;
            }
            i17 = i3 & 2048;
            if (i17 != 0) {
                if ((i2 & 48) == 0) {
                    if (l46Var.h(z2)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB117 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var117 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool1110 = bool3;
                    mue mueVar1110 = mueVar3;
                    cgg.a(x16Var, j09VarB117, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1110, mueVar1110, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool1110;
                    mueVar2 = mueVar1110;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i16 |= 48;
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 256;
                } else {
                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i16 |= i22;
            }
            i19 = i16;
            i20 = i5;
            if ((i5 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i20 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                } else {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                }
                l46Var.s();
                if (yi4Var4 != null) {
                    f = yi4Var4.a;
                } else if (z) {
                    f = 64.0f;
                } else {
                    f = 48.0f;
                }
                j09 j09VarB118 = b.b(0.0f, f, j09Var5, 1);
                if (u51Var3 == null) {
                    l46Var.f0(-1839688364);
                    bx9 bx9Var118 = v51.a;
                    pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                        l46Var.f0(-1839684646);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1839683654);
                        l46Var.r(false);
                        jB = y72.j;
                    }
                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                    z6 = false;
                    l46Var.r(false);
                } else {
                    z6 = false;
                    l46Var.f0(-1839689139);
                    l46Var.r(false);
                    u51VarB = u51Var3;
                }
                if (q11Var4 == null) {
                    l46Var.f0(-1839680421);
                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839680731);
                    l46Var.r(z6);
                    q11VarB = q11Var4;
                }
                if (x4dVar4 == null) {
                    l46Var.f0(-1839677867);
                    x4dVar5 = eze.a(l46Var).a.j;
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839678580);
                    l46Var.r(z6);
                    x4dVar5 = x4dVar4;
                }
                Boolean bool1111 = bool3;
                mue mueVar1111 = mueVar3;
                cgg.a(x16Var, j09VarB118, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1111, mueVar1111, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                z4 = z5;
                xw9Var2 = xw9Var4;
                j09Var3 = j09Var5;
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                x4dVar3 = x4dVar4;
                bool2 = bool1111;
                mueVar2 = mueVar1111;
                yi4Var2 = yi4Var4;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                yi4Var2 = yi4Var;
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                q11Var3 = q11Var2;
                x4dVar3 = x4dVar2;
                bool2 = bool;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
            }
        }
        i5 |= 100663296;
        i14 = i3 & 512;
        if (i14 != 0) {
            if ((i & 805306368) == 0) {
                if (l46Var.g(yi4Var)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i5 |= i15;
            }
            if ((i2 & 6) == 0) {
                i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
            } else {
                i16 = i2;
            }
            i17 = i3 & 2048;
            if (i17 != 0) {
                if ((i2 & 48) == 0) {
                    if (l46Var.h(z2)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 |= i18;
                }
                if ((i2 & 384) != 0) {
                    if (l46Var.i(x16Var)) {
                        i22 = 256;
                    } else {
                        i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i16 |= i22;
                }
                i19 = i16;
                i20 = i5;
                if ((i5 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (l46Var.W(i20 & 1, z3)) {
                    l46Var.b0();
                    if ((i & 1) != 0) {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    } else {
                        if (i23 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if (i24 != 0) {
                            bool3 = null;
                        } else {
                            bool3 = bool;
                        }
                        if (i6 != 0) {
                            u51Var2 = null;
                        }
                        if (i8 != 0) {
                            q11Var2 = null;
                        }
                        if (i10 != 0) {
                            x4dVar2 = null;
                        }
                        if (i12 != 0) {
                            mueVar3 = null;
                        } else {
                            mueVar3 = mueVar;
                        }
                        if (i14 == 0) {
                        }
                        if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                            xw9Var3 = v51.a;
                            i19 &= -15;
                        } else {
                            xw9Var3 = xw9Var;
                        }
                        j09Var5 = j09Var4;
                        u51Var3 = u51Var2;
                        if (i17 != 0) {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = true;
                        } else {
                            q11Var4 = q11Var2;
                            xw9Var4 = xw9Var3;
                            x4dVar4 = x4dVar2;
                            i21 = i19;
                            yi4Var4 = yi4Var3;
                            z5 = z2;
                        }
                    }
                    l46Var.s();
                    if (yi4Var4 != null) {
                        f = yi4Var4.a;
                    } else if (z) {
                        f = 64.0f;
                    } else {
                        f = 48.0f;
                    }
                    j09 j09VarB119 = b.b(0.0f, f, j09Var5, 1);
                    if (u51Var3 == null) {
                        l46Var.f0(-1839688364);
                        bx9 bx9Var119 = v51.a;
                        pr4Var = l8b.a;
                        if (k8b.e((e8b) l46Var.k(pr4Var))) {
                            l46Var.f0(-1839684646);
                            jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1839683654);
                            l46Var.r(false);
                            jB = y72.j;
                        }
                        u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                        z6 = false;
                        l46Var.r(false);
                    } else {
                        z6 = false;
                        l46Var.f0(-1839689139);
                        l46Var.r(false);
                        u51VarB = u51Var3;
                    }
                    if (q11Var4 == null) {
                        l46Var.f0(-1839680421);
                        q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839680731);
                        l46Var.r(z6);
                        q11VarB = q11Var4;
                    }
                    if (x4dVar4 == null) {
                        l46Var.f0(-1839677867);
                        x4dVar5 = eze.a(l46Var).a.j;
                        l46Var.r(z6);
                    } else {
                        l46Var.f0(-1839678580);
                        l46Var.r(z6);
                        x4dVar5 = x4dVar4;
                    }
                    Boolean bool1112 = bool3;
                    mue mueVar1112 = mueVar3;
                    cgg.a(x16Var, j09VarB119, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1112, mueVar1112, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                    z4 = z5;
                    xw9Var2 = xw9Var4;
                    j09Var3 = j09Var5;
                    u51Var2 = u51Var3;
                    q11Var3 = q11Var4;
                    x4dVar3 = x4dVar4;
                    bool2 = bool1112;
                    mueVar2 = mueVar1112;
                    yi4Var2 = yi4Var4;
                } else {
                    l46Var.Z();
                    mueVar2 = mueVar;
                    yi4Var2 = yi4Var;
                    xw9Var2 = xw9Var;
                    j09Var3 = j09Var2;
                    q11Var3 = q11Var2;
                    x4dVar3 = x4dVar2;
                    bool2 = bool;
                    z4 = z2;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
                }
            }
            i16 |= 48;
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 256;
                } else {
                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i16 |= i22;
            }
            i19 = i16;
            i20 = i5;
            if ((i5 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i20 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                } else {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                }
                l46Var.s();
                if (yi4Var4 != null) {
                    f = yi4Var4.a;
                } else if (z) {
                    f = 64.0f;
                } else {
                    f = 48.0f;
                }
                j09 j09VarB1110 = b.b(0.0f, f, j09Var5, 1);
                if (u51Var3 == null) {
                    l46Var.f0(-1839688364);
                    bx9 bx9Var1110 = v51.a;
                    pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                        l46Var.f0(-1839684646);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1839683654);
                        l46Var.r(false);
                        jB = y72.j;
                    }
                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                    z6 = false;
                    l46Var.r(false);
                } else {
                    z6 = false;
                    l46Var.f0(-1839689139);
                    l46Var.r(false);
                    u51VarB = u51Var3;
                }
                if (q11Var4 == null) {
                    l46Var.f0(-1839680421);
                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839680731);
                    l46Var.r(z6);
                    q11VarB = q11Var4;
                }
                if (x4dVar4 == null) {
                    l46Var.f0(-1839677867);
                    x4dVar5 = eze.a(l46Var).a.j;
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839678580);
                    l46Var.r(z6);
                    x4dVar5 = x4dVar4;
                }
                Boolean bool1113 = bool3;
                mue mueVar1113 = mueVar3;
                cgg.a(x16Var, j09VarB1110, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1113, mueVar1113, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                z4 = z5;
                xw9Var2 = xw9Var4;
                j09Var3 = j09Var5;
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                x4dVar3 = x4dVar4;
                bool2 = bool1113;
                mueVar2 = mueVar1113;
                yi4Var2 = yi4Var4;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                yi4Var2 = yi4Var;
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                q11Var3 = q11Var2;
                x4dVar3 = x4dVar2;
                bool2 = bool;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
            }
        }
        i5 |= 805306368;
        if ((i2 & 6) == 0) {
            i16 = i2 | (((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0 || !l46Var.g(xw9Var)) ? 2 : 4);
        } else {
            i16 = i2;
        }
        i17 = i3 & 2048;
        if (i17 != 0) {
            if ((i2 & 48) == 0) {
                if (l46Var.h(z2)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i16 |= i18;
            }
            if ((i2 & 384) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 256;
                } else {
                    i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i16 |= i22;
            }
            i19 = i16;
            i20 = i5;
            if ((i5 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (l46Var.W(i20 & 1, z3)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                } else {
                    if (i23 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if (i24 != 0) {
                        bool3 = null;
                    } else {
                        bool3 = bool;
                    }
                    if (i6 != 0) {
                        u51Var2 = null;
                    }
                    if (i8 != 0) {
                        q11Var2 = null;
                    }
                    if (i10 != 0) {
                        x4dVar2 = null;
                    }
                    if (i12 != 0) {
                        mueVar3 = null;
                    } else {
                        mueVar3 = mueVar;
                    }
                    if (i14 == 0) {
                    }
                    if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                        xw9Var3 = v51.a;
                        i19 &= -15;
                    } else {
                        xw9Var3 = xw9Var;
                    }
                    j09Var5 = j09Var4;
                    u51Var3 = u51Var2;
                    if (i17 != 0) {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = true;
                    } else {
                        q11Var4 = q11Var2;
                        xw9Var4 = xw9Var3;
                        x4dVar4 = x4dVar2;
                        i21 = i19;
                        yi4Var4 = yi4Var3;
                        z5 = z2;
                    }
                }
                l46Var.s();
                if (yi4Var4 != null) {
                    f = yi4Var4.a;
                } else if (z) {
                    f = 64.0f;
                } else {
                    f = 48.0f;
                }
                j09 j09VarB1111 = b.b(0.0f, f, j09Var5, 1);
                if (u51Var3 == null) {
                    l46Var.f0(-1839688364);
                    bx9 bx9Var1111 = v51.a;
                    pr4Var = l8b.a;
                    if (k8b.e((e8b) l46Var.k(pr4Var))) {
                        l46Var.f0(-1839684646);
                        jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1839683654);
                        l46Var.r(false);
                        jB = y72.j;
                    }
                    u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                    z6 = false;
                    l46Var.r(false);
                } else {
                    z6 = false;
                    l46Var.f0(-1839689139);
                    l46Var.r(false);
                    u51VarB = u51Var3;
                }
                if (q11Var4 == null) {
                    l46Var.f0(-1839680421);
                    q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839680731);
                    l46Var.r(z6);
                    q11VarB = q11Var4;
                }
                if (x4dVar4 == null) {
                    l46Var.f0(-1839677867);
                    x4dVar5 = eze.a(l46Var).a.j;
                    l46Var.r(z6);
                } else {
                    l46Var.f0(-1839678580);
                    l46Var.r(z6);
                    x4dVar5 = x4dVar4;
                }
                Boolean bool1114 = bool3;
                mue mueVar1114 = mueVar3;
                cgg.a(x16Var, j09VarB1111, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1114, mueVar1114, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
                z4 = z5;
                xw9Var2 = xw9Var4;
                j09Var3 = j09Var5;
                u51Var2 = u51Var3;
                q11Var3 = q11Var4;
                x4dVar3 = x4dVar4;
                bool2 = bool1114;
                mueVar2 = mueVar1114;
                yi4Var2 = yi4Var4;
            } else {
                l46Var.Z();
                mueVar2 = mueVar;
                yi4Var2 = yi4Var;
                xw9Var2 = xw9Var;
                j09Var3 = j09Var2;
                q11Var3 = q11Var2;
                x4dVar3 = x4dVar2;
                bool2 = bool;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
            }
        }
        i16 |= 48;
        if ((i2 & 384) != 0) {
            if (l46Var.i(x16Var)) {
                i22 = 256;
            } else {
                i22 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i16 |= i22;
        }
        i19 = i16;
        i20 = i5;
        if ((i5 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (l46Var.W(i20 & 1, z3)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i23 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i24 != 0) {
                    bool3 = null;
                } else {
                    bool3 = bool;
                }
                if (i6 != 0) {
                    u51Var2 = null;
                }
                if (i8 != 0) {
                    q11Var2 = null;
                }
                if (i10 != 0) {
                    x4dVar2 = null;
                }
                if (i12 != 0) {
                    mueVar3 = null;
                } else {
                    mueVar3 = mueVar;
                }
                if (i14 == 0) {
                }
                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    xw9Var3 = v51.a;
                    i19 &= -15;
                } else {
                    xw9Var3 = xw9Var;
                }
                j09Var5 = j09Var4;
                u51Var3 = u51Var2;
                if (i17 != 0) {
                    q11Var4 = q11Var2;
                    xw9Var4 = xw9Var3;
                    x4dVar4 = x4dVar2;
                    i21 = i19;
                    yi4Var4 = yi4Var3;
                    z5 = true;
                } else {
                    q11Var4 = q11Var2;
                    xw9Var4 = xw9Var3;
                    x4dVar4 = x4dVar2;
                    i21 = i19;
                    yi4Var4 = yi4Var3;
                    z5 = z2;
                }
            } else {
                if (i23 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if (i24 != 0) {
                    bool3 = null;
                } else {
                    bool3 = bool;
                }
                if (i6 != 0) {
                    u51Var2 = null;
                }
                if (i8 != 0) {
                    q11Var2 = null;
                }
                if (i10 != 0) {
                    x4dVar2 = null;
                }
                if (i12 != 0) {
                    mueVar3 = null;
                } else {
                    mueVar3 = mueVar;
                }
                if (i14 == 0) {
                }
                if ((i3 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                    xw9Var3 = v51.a;
                    i19 &= -15;
                } else {
                    xw9Var3 = xw9Var;
                }
                j09Var5 = j09Var4;
                u51Var3 = u51Var2;
                if (i17 != 0) {
                    q11Var4 = q11Var2;
                    xw9Var4 = xw9Var3;
                    x4dVar4 = x4dVar2;
                    i21 = i19;
                    yi4Var4 = yi4Var3;
                    z5 = true;
                } else {
                    q11Var4 = q11Var2;
                    xw9Var4 = xw9Var3;
                    x4dVar4 = x4dVar2;
                    i21 = i19;
                    yi4Var4 = yi4Var3;
                    z5 = z2;
                }
            }
            l46Var.s();
            if (yi4Var4 != null) {
                f = yi4Var4.a;
            } else if (z) {
                f = 64.0f;
            } else {
                f = 48.0f;
            }
            j09 j09VarB1112 = b.b(0.0f, f, j09Var5, 1);
            if (u51Var3 == null) {
                l46Var.f0(-1839688364);
                bx9 bx9Var1112 = v51.a;
                pr4Var = l8b.a;
                if (k8b.e((e8b) l46Var.k(pr4Var))) {
                    l46Var.f0(-1839684646);
                    jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1839683654);
                    l46Var.r(false);
                    jB = y72.j;
                }
                u51VarB = v51.b(jB, ((m82) l46Var.k(o82.a)).q, l46Var, 12);
                z6 = false;
                l46Var.r(false);
            } else {
                z6 = false;
                l46Var.f0(-1839689139);
                l46Var.r(false);
                u51VarB = u51Var3;
            }
            if (q11Var4 == null) {
                l46Var.f0(-1839680421);
                q11VarB = x57.b(((e8b) l46Var.k(l8b.a)).d, 0.5f);
                l46Var.r(z6);
            } else {
                l46Var.f0(-1839680731);
                l46Var.r(z6);
                q11VarB = q11Var4;
            }
            if (x4dVar4 == null) {
                l46Var.f0(-1839677867);
                x4dVar5 = eze.a(l46Var).a.j;
                l46Var.r(z6);
            } else {
                l46Var.f0(-1839678580);
                l46Var.r(z6);
                x4dVar5 = x4dVar4;
            }
            Boolean bool1115 = bool3;
            mue mueVar1115 = mueVar3;
            cgg.a(x16Var, j09VarB1112, z5, x4dVar5, u51VarB, null, q11VarB, xw9Var4, af1.b0(98090367, new cl(bool1115, mueVar1115, obj, x16Var, z, 9), l46Var), l46Var, ((i21 >> 6) & 14) | 805306368 | ((i21 << 3) & 896) | ((i21 << 21) & 29360128), 288);
            z4 = z5;
            xw9Var2 = xw9Var4;
            j09Var3 = j09Var5;
            u51Var2 = u51Var3;
            q11Var3 = q11Var4;
            x4dVar3 = x4dVar4;
            bool2 = bool1115;
            mueVar2 = mueVar1115;
            yi4Var2 = yi4Var4;
        } else {
            l46Var.Z();
            mueVar2 = mueVar;
            yi4Var2 = yi4Var;
            xw9Var2 = xw9Var;
            j09Var3 = j09Var2;
            q11Var3 = q11Var2;
            x4dVar3 = x4dVar2;
            bool2 = bool;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new y08(j09Var3, str, z, bool2, u51Var2, q11Var3, x4dVar3, mueVar2, yi4Var2, xw9Var2, z4, x16Var, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    public static final void c(tr2 tr2Var, j09 j09Var, a26 a26Var, a26 a26Var2, l46 l46Var, int i) {
        List list;
        int i2;
        String strQ;
        a26Var2.getClass();
        l46Var.h0(871659829);
        int i3 = i | (l46Var.i(tr2Var) ? 4 : 2) | (l46Var.g(j09Var) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            fme fmeVar = tr2Var.d;
            l46Var.f0(146480879);
            List list2 = a;
            ArrayList arrayList = new ArrayList(t72.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(afc.q(((Number) it.next()).intValue(), l46Var));
            }
            l46Var.r(false);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(arrayList);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean z = fmeVar.f instanceof yle;
            vz9 vz9Var = fmeVar.v;
            if (z) {
                list = (List) vz9Var.getValue();
                if (list == null) {
                    list = (List) e89Var.getValue();
                } else {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        list = (List) e89Var.getValue();
                    }
                }
            } else {
                list = (List) vz9Var.getValue();
                if (list == null) {
                    list = pu4.a;
                }
            }
            j09 j09VarC = b.c(j09Var, 1.0f);
            bme bmeVar = fmeVar.f;
            yle yleVar = bmeVar instanceof yle ? (yle) bmeVar : null;
            TemplateCategory templateCategory = yleVar != null ? yleVar.a : null;
            if (templateCategory == null) {
                l46Var.f0(246464381);
                l46Var.r(false);
                strQ = null;
            } else {
                l46Var.f0(246464382);
                switch (rle.a[templateCategory.ordinal()]) {
                    case 1:
                        i2 = R.string.template_title_general;
                        break;
                    case 2:
                        i2 = R.string.template_title_luck;
                        break;
                    case 3:
                        i2 = R.string.template_title_career;
                        break;
                    case 4:
                        i2 = R.string.template_title_growing;
                        break;
                    case 5:
                        i2 = R.string.template_title_relationship;
                        break;
                    case 6:
                        i2 = R.string.template_title_pet;
                        break;
                    case 7:
                        i2 = R.string.template_title_unknown;
                        break;
                    default:
                        ap.c();
                        return;
                }
                strQ = (!fmeVar.g || templateCategory == TemplateCategory.GENERAL) ? null : afc.q(i2, l46Var);
                l46Var.r(false);
            }
            boolean zI = l46Var.i(arrayList) | l46Var.i(fmeVar);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new smc(arrayList, fmeVar, e89Var, 5);
                l46Var.p0(objR2);
            }
            x16 x16Var = (x16) objR2;
            int iIntValue = ((Number) fmeVar.w.getValue()).intValue();
            boolean zI2 = l46Var.i(fmeVar) | l46Var.i(list);
            Object objR3 = l46Var.R();
            int i4 = 18;
            if (zI2 || objR3 == obj) {
                objR3 = new ykc(i4, fmeVar, list);
                l46Var.p0(objR3);
            }
            a(j09VarC, strQ, x16Var, list, iIntValue, (x16) objR3, a26Var2, a26Var, l46Var, ((i3 << 18) & 234881024) | ((i3 << 9) & 3670016) | 12582912);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(i, 17, tr2Var, j09Var, a26Var, a26Var2);
        }
    }
}
