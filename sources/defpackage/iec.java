package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.google.android.play.core.assetpacks.c;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iec {
    public static gx6 b;
    public final /* synthetic */ int a = 1;

    /* JADX WARN: Code duplicated, block: B:192:0x029a  */
    /* JADX WARN: Code duplicated, block: B:194:0x029d  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:205:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:211:0x0300  */
    /* JADX WARN: Code duplicated, block: B:213:0x0304 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x0307  */
    /* JADX WARN: Code duplicated, block: B:218:0x0325  */
    /* JADX WARN: Code duplicated, block: B:220:0x0328  */
    /* JADX WARN: Code duplicated, block: B:224:0x032f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0336  */
    /* JADX WARN: Code duplicated, block: B:231:0x0352  */
    /* JADX WARN: Code duplicated, block: B:240:0x0381  */
    /* JADX WARN: Code duplicated, block: B:242:0x0384  */
    /* JADX WARN: Code duplicated, block: B:244:0x0387  */
    /* JADX WARN: Code duplicated, block: B:246:0x038b  */
    /* JADX WARN: Code duplicated, block: B:248:0x038f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x0391  */
    /* JADX WARN: Code duplicated, block: B:252:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:260:0x03b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:266:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:270:0x040b  */
    /* JADX WARN: Code duplicated, block: B:273:0x042f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0434  */
    /* JADX WARN: Code duplicated, block: B:278:0x0451  */
    /* JADX WARN: Code duplicated, block: B:280:0x0455  */
    /* JADX WARN: Code duplicated, block: B:284:0x0491  */
    /* JADX WARN: Code duplicated, block: B:287:0x04de  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:291:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:293:0x0520  */
    /* JADX WARN: Code duplicated, block: B:294:0x0523 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:295:0x0525  */
    /* JADX WARN: Code duplicated, block: B:296:0x0528 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:297:0x052a  */
    /* JADX WARN: Code duplicated, block: B:298:0x052d  */
    /* JADX WARN: Code duplicated, block: B:301:0x0535  */
    /* JADX WARN: Code duplicated, block: B:309:0x057e  */
    /* JADX WARN: Code duplicated, block: B:312:0x0593  */
    /* JADX WARN: Code duplicated, block: B:315:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:318:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:319:0x05be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:321:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:326:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:329:0x0611  */
    /* JADX WARN: Code duplicated, block: B:331:0x0615 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0617  */
    /* JADX WARN: Code duplicated, block: B:333:0x061a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:334:0x061c  */
    /* JADX WARN: Code duplicated, block: B:335:0x061f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0624  */
    /* JADX WARN: Code duplicated, block: B:338:0x0631  */
    /* JADX WARN: Code duplicated, block: B:341:0x0656  */
    /* JADX WARN: Code duplicated, block: B:343:0x0659  */
    /* JADX WARN: Code duplicated, block: B:345:0x0665  */
    /* JADX WARN: Code duplicated, block: B:349:0x06af  */
    /* JADX WARN: Code duplicated, block: B:353:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:355:0x0703  */
    /* JADX WARN: Code duplicated, block: B:357:0x070d  */
    public static final void a(final yse yseVar, final CharSequence charSequence, final l26 l26Var, final rpe rpeVar, final n26 n26Var, final l26 l26Var2, final l26 l26Var3, final l26 l26Var4, final boolean z, final boolean z2, final boolean z3, final m77 m77Var, final xw9 xw9Var, final wne wneVar, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        int i4;
        p47 p47Var;
        long j;
        mue mueVar;
        float f;
        int iOrdinal;
        float f2;
        mue mueVar2;
        k3f k3fVarH;
        fxd fxdVarZ;
        fxd fxdVarZ2;
        int iOrdinal2;
        float f3;
        int iOrdinal3;
        float f4;
        i3f i3fVarF;
        fxd fxdVar;
        k3f k3fVarH2;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        k3f k3fVarH3;
        p47 p47Var2;
        int[] iArr;
        long j2;
        p82 p82VarE;
        boolean zG;
        Object objR;
        i8c i8cVar;
        p47 p47Var3;
        long j3;
        p47 p47Var4;
        long j4;
        k3f k3fVarH4;
        p82 p82VarE2;
        boolean zG2;
        Object objR2;
        k3f k3fVarH5;
        Object objR3;
        kpe kpeVar;
        dd2 dd2Var2;
        long j5;
        Object objR4;
        dd2 dd2Var3;
        Object objR5;
        long j6;
        boolean z4;
        dd2 dd2Var4;
        long j7;
        long j8;
        boolean z5;
        dd2 dd2Var5;
        int iOrdinal6;
        int i5;
        Object objR6;
        e89 e89Var;
        boolean z6;
        boolean zG3;
        Object objR7;
        l46 l46Var2 = l46Var;
        l46Var2.h0(546805032);
        if ((i & 6) == 0) {
            i3 = (l46Var2.e(yseVar.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var2.i(charSequence) ? 32 : 16;
        }
        int i6 = i & 384;
        int i7 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 == 0) {
            i3 |= l46Var2.i(l26Var) ? 256 : 128;
        }
        int i8 = i3;
        int i9 = i & 3072;
        int i10 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i9 == 0) {
            i8 |= l46Var2.g(rpeVar) ? 2048 : 1024;
        }
        int i11 = i & 24576;
        int i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i11 == 0) {
            i8 |= l46Var2.i(n26Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i8 |= l46Var2.i(l26Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i8 |= l46Var2.i(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i8 |= l46Var2.i(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i8 |= l46Var2.i(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i8 |= l46Var2.i(l26Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var2.i(l26Var4) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (l46Var2.h(z2)) {
                i7 = 256;
            }
            i4 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (l46Var2.h(z3)) {
                i10 = 2048;
            }
            i4 |= i10;
        }
        if ((i2 & 24576) == 0) {
            if (l46Var2.g(m77Var)) {
                i12 = 16384;
            }
            i4 |= i12;
        }
        if ((i2 & 196608) == 0) {
            i4 |= l46Var2.g(xw9Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= l46Var2.g(wneVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= l46Var2.i(dd2Var) ? 8388608 : 4194304;
        }
        int i13 = i4;
        if (l46Var2.W(i8 & 1, ((i8 & 306783379) == 306783378 && (i13 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) z7f.w(m77Var, l46Var2, (i13 >> 12) & 14).getValue()).booleanValue();
            p47 p47Var5 = p47.c;
            p47 p47Var6 = p47.b;
            p47 p47Var7 = p47.a;
            if (zBooleanValue) {
                p47Var = p47Var7;
            } else {
                p47Var = charSequence.length() == 0 ? p47Var6 : p47Var5;
            }
            if (!z2) {
                j = wneVar.z;
            } else if (z3) {
                j = wneVar.A;
            } else {
                j = zBooleanValue ? wneVar.x : wneVar.y;
            }
            p9f p9fVar = (p9f) l46Var2.k(r9f.a);
            mue mueVar3 = p9fVar.j;
            mue mueVar4 = p9fVar.l;
            long jC = mueVar3.c();
            long j9 = y72.k;
            boolean z7 = (faf.a(jC, j9) && !faf.a(mueVar4.c(), j9)) || (!faf.a(mueVar3.c(), j9) && faf.a(mueVar4.c(), j9));
            long jC2 = mueVar4.c();
            long j10 = (z7 && jC2 == 16) ? j : jC2;
            long jC3 = mueVar3.c();
            long j11 = (z7 && jC3 == 16) ? j : jC3;
            boolean z8 = n26Var != null && (rpeVar instanceof rpe);
            p3f p3fVarI0 = g21.i0(p47Var, "TextFieldInputState", l46Var2, 48, 0);
            s3f s3fVar = p3fVarI0.a;
            vz9 vz9Var = p3fVarI0.d;
            fxd fxdVarZ3 = vpf.Z(t39.b, l46Var2);
            y6f y6fVar = xo1.g;
            p47 p47Var8 = (p47) s3fVar.a();
            l46Var2.f0(-1436405362);
            int iOrdinal7 = p47Var8.ordinal();
            float f6 = 0.0f;
            if (iOrdinal7 != 0) {
                mueVar = mueVar4;
                if (iOrdinal7 == 1) {
                    if (z8) {
                        f = 0.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf = Float.valueOf(f);
                    p47 p47Var9 = (p47) vz9Var.getValue();
                    l46Var2.f0(-1436405362);
                    iOrdinal = p47Var9.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                ap.c();
                                return;
                            }
                        } else if (z8) {
                            f2 = 0.0f;
                        }
                        f2 = 1.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    p3fVarI0.f();
                    l46Var2.f0(-709912974);
                    l46Var2.r(false);
                    mueVar2 = mueVar3;
                    k3fVarH = g21.H(p3fVarI0, fValueOf, fValueOf2, fxdVarZ3, y6fVar, l46Var2, 196608);
                    t39 t39Var = t39.d;
                    fxdVarZ = vpf.Z(t39Var, l46Var2);
                    fxdVarZ2 = vpf.Z(t39.e, l46Var2);
                    p47 p47Var10 = (p47) s3fVar.a();
                    l46Var2.f0(-1093194547);
                    iOrdinal2 = p47Var10.ordinal();
                    if (iOrdinal2 == 0) {
                        f3 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                ap.c();
                                return;
                            }
                        } else if (z8) {
                            f3 = 1.0f;
                        }
                        f3 = 0.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf3 = Float.valueOf(f3);
                    p47 p47Var11 = (p47) vz9Var.getValue();
                    l46Var2.f0(-1093194547);
                    iOrdinal3 = p47Var11.ordinal();
                    if (iOrdinal3 == 0) {
                        f4 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                ap.c();
                                return;
                            }
                        } else if (z8) {
                            f4 = 1.0f;
                        }
                        f4 = 0.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf4 = Float.valueOf(f4);
                    i3fVarF = p3fVarI0.f();
                    l46Var2.f0(-984009111);
                    if (i3fVarF.c(p47Var7, p47Var6) && (i3fVarF.c(p47Var6, p47Var7) || i3fVarF.c(p47Var5, p47Var6))) {
                        fxdVar = fxdVarZ2;
                    } else {
                        fxdVar = fxdVarZ;
                    }
                    l46Var2.r(false);
                    k3fVarH2 = g21.H(p3fVarI0, fValueOf3, fValueOf4, fxdVar, y6fVar, l46Var2, 196608);
                    p47 p47Var12 = (p47) s3fVar.a();
                    l46Var2.f0(-1258455321);
                    iOrdinal4 = p47Var12.ordinal();
                    if (iOrdinal4 == 0) {
                        f5 = 1.0f;
                    } else {
                        if (iOrdinal4 != 1) {
                            if (iOrdinal4 != 2) {
                                ap.c();
                                return;
                            }
                        } else if (z8) {
                            f5 = 0.0f;
                        }
                        f5 = 1.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf5 = Float.valueOf(f5);
                    p47 p47Var13 = (p47) vz9Var.getValue();
                    l46Var2.f0(-1258455321);
                    iOrdinal5 = p47Var13.ordinal();
                    if (iOrdinal5 == 0) {
                        f6 = 1.0f;
                    } else {
                        if (iOrdinal5 != 1) {
                            if (iOrdinal5 != 2) {
                                ap.c();
                                return;
                            }
                        } else if (!z8) {
                        }
                        f6 = 1.0f;
                    }
                    l46Var2.r(false);
                    Float fValueOf6 = Float.valueOf(f6);
                    p3fVarI0.f();
                    l46Var2.f0(2126293195);
                    l46Var2.r(false);
                    k3fVarH3 = g21.H(p3fVarI0, fValueOf5, fValueOf6, fxdVarZ, y6fVar, l46Var2, 196608);
                    fxd fxdVarZ4 = vpf.Z(t39Var, l46Var2);
                    p47Var2 = (p47) vz9Var.getValue();
                    l46Var2.f0(-12973394);
                    iArr = lpe.a;
                    if (iArr[p47Var2.ordinal()] == 1) {
                        j2 = j10;
                    } else {
                        j2 = j11;
                    }
                    l46Var2.r(false);
                    p82VarE = y72.e(j2);
                    zG = l46Var2.g(p82VarE);
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        y6f y6fVar2 = new y6f(xx.X, new w82(p82VarE));
                        l46Var2.p0(y6fVar2);
                        objR = y6fVar2;
                    }
                    y6f y6fVar3 = (y6f) objR;
                    p47Var3 = (p47) s3fVar.a();
                    l46Var2.f0(-12973394);
                    if (iArr[p47Var3.ordinal()] == 1) {
                        j3 = j10;
                    } else {
                        j3 = j11;
                    }
                    y72 y72VarC = tec.c(l46Var2, false, j3);
                    p47Var4 = (p47) vz9Var.getValue();
                    l46Var2.f0(-12973394);
                    if (iArr[p47Var4.ordinal()] == 1) {
                        j4 = j10;
                    } else {
                        j4 = j11;
                    }
                    l46Var2.r(false);
                    y72 y72Var = new y72(j4);
                    p3fVarI0.f();
                    l46Var2.f0(1954111929);
                    l46Var2.r(false);
                    k3fVarH4 = g21.H(p3fVarI0, y72VarC, y72Var, fxdVarZ4, y6fVar3, l46Var2, 196608);
                    l46Var2.f0(-464752477);
                    l46Var2.r(false);
                    p82VarE2 = y72.e(j);
                    zG2 = l46Var2.g(p82VarE2);
                    objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        y6f y6fVar4 = new y6f(xx.X, new w82(p82VarE2));
                        l46Var2.p0(y6fVar4);
                        objR2 = y6fVar4;
                    }
                    y6f y6fVar5 = (y6f) objR2;
                    l46Var2.f0(-464752477);
                    l46Var2.r(false);
                    y72 y72Var2 = new y72(j);
                    l46Var2.f0(-464752477);
                    l46Var2.r(false);
                    y72 y72Var3 = new y72(j);
                    p3fVarI0.f();
                    l46Var2.f0(1190923886);
                    l46Var2.r(false);
                    k3fVarH5 = g21.H(p3fVarI0, y72Var2, y72Var3, fxdVarZ4, y6fVar5, l46Var2, 196608);
                    objR3 = l46Var2.R();
                    if (objR3 == i8cVar) {
                        objR3 = new kpe();
                        l46Var2.p0(objR3);
                    }
                    kpeVar = (kpe) objR3;
                    if (n26Var == null) {
                        l46Var2.f0(-1891724857);
                        l46Var2.r(false);
                        dd2Var2 = null;
                    } else {
                        l46Var2.f0(-1891724856);
                        dd2 dd2VarB0 = af1.b0(-1076580032, new yz8(mueVar2, mueVar, k3fVarH, k3fVarH5, z7, k3fVarH4, n26Var, kpeVar), l46Var2);
                        l46Var2.r(false);
                        dd2Var2 = dd2VarB0;
                    }
                    if (!z2) {
                        mueVar2 = mueVar2;
                        j5 = wneVar.D;
                    } else if (z3) {
                        j5 = wneVar.E;
                    } else if (zBooleanValue) {
                        j5 = wneVar.B;
                    } else {
                        j5 = wneVar.C;
                    }
                    objR4 = l46Var2.R();
                    if (objR4 == i8cVar) {
                        i8c i8cVar2 = i8c.f;
                        zk1 zk1Var = new zk1(19, k3fVarH2);
                        psd psdVar = zrd.a;
                        mx3 mx3Var = new mx3(zk1Var, i8cVar2);
                        l46Var2.p0(mx3Var);
                        objR4 = mx3Var;
                    }
                    h0e h0eVar = (h0e) objR4;
                    if (l26Var2 == null && charSequence.length() == 0 && ((Boolean) h0eVar.getValue()).booleanValue()) {
                        l46Var2.f0(-1890614312);
                        dd2 dd2VarB1 = af1.b0(1405547205, new ipe(k3fVarH2, j5, mueVar2, l26Var2), l46Var2);
                        l46Var2.r(false);
                        dd2Var3 = dd2VarB1;
                    } else {
                        l46Var2.f0(-1890217110);
                        l46Var2.r(false);
                        dd2Var3 = null;
                    }
                    objR5 = l46Var2.R();
                    if (objR5 == i8cVar) {
                        i8c i8cVar3 = i8c.f;
                        zk1 zk1Var2 = new zk1(20, k3fVarH3);
                        psd psdVar2 = zrd.a;
                        mx3 mx3Var2 = new mx3(zk1Var2, i8cVar3);
                        l46Var2.p0(mx3Var2);
                        objR5 = mx3Var2;
                    }
                    h0e h0eVar2 = (h0e) objR5;
                    l46Var2.f0(-1889500886);
                    l46Var2.r(false);
                    if (!z2) {
                        j6 = wneVar.P;
                    } else if (z3) {
                        j6 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x05bb: IGET (r1v32 'j6' long) = (r4v0 ?? I:??[OBJECT, ARRAY]) (LINE:162) wne.Q long in method: iec.a(yse, java.lang.CharSequence, l26, rpe, n26, l26, l26, l26, boolean, boolean, boolean, m77, xw9, wne, dd2, l46, int, int):void, file: classes.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1962
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.iec.a(yse, java.lang.CharSequence, l26, rpe, n26, l26, l26, l26, boolean, boolean, boolean, m77, xw9, wne, dd2, l46, int, int):void");
                    }

                    public static final void b(long j, mue mueVar, l26 l26Var, l46 l46Var, int i) {
                        long j2;
                        mue mueVar2;
                        l26 l26Var2;
                        l46 l46Var2;
                        l46Var.h0(396611577);
                        int i2 = (l46Var.f(j) ? 4 : 2) | i | (l46Var.g(mueVar) ? 32 : 16);
                        if ((i & 384) == 0) {
                            i2 |= l46Var.i(l26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
                            l46Var2 = l46Var;
                            cgg.l(j, mueVar, l26Var, l46Var2, i2 & 1022);
                            j2 = j;
                            mueVar2 = mueVar;
                            l26Var2 = l26Var;
                        } else {
                            j2 = j;
                            mueVar2 = mueVar;
                            l26Var2 = l26Var;
                            l46Var2 = l46Var;
                            l46Var2.Z();
                        }
                        ojb ojbVarV = l46Var2.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new d1b(j2, mueVar2, l26Var2, i, 1);
                        }
                    }

                    public static final void c(int i, int i2, x16 x16Var, boolean z, l46 l46Var, int i3) {
                        boolean z2;
                        Object next;
                        x16Var.getClass();
                        l46Var.h0(-1403551872);
                        int i4 = 4;
                        int i5 = i3 | (l46Var.e(i) ? 4 : 2) | (l46Var.e(i2) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072;
                        int i6 = 0;
                        int i7 = 1;
                        if (!l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
                            l46Var.Z();
                            z2 = z;
                        } else {
                            if (i < 0 || i >= 2) {
                                qc0.j("Failed requirement.");
                                return;
                            }
                            Object objR = l46Var.R();
                            int i8 = 3;
                            Object obj = sf2.a;
                            if (objR == obj) {
                                objR = t72.I(new z6e(u7e.b, "¥18.8", "18.8", "", "¥", "preview-monthly", "¥28.8", "次月 ¥28.8/月", 0.0d, null, 768), new z6e(u7e.c, "¥98", "98", "", "¥", "preview-yearly", null, null, 0.0d, null, 960), new n07(thb.a, "¥10", null, 10.0d, "¥", "preview-five-readings", null, 196));
                                l46Var.p0(objR);
                            }
                            List list = (List) objR;
                            Object[] objArr = new Object[0];
                            Object objR2 = l46Var.R();
                            if (objR2 == obj) {
                                objR2 = new ehf(i8);
                                l46Var.p0(objR2);
                            }
                            e89 e89Var = (e89) vfh.I(objArr, (x16) objR2, l46Var, 48);
                            Object objR3 = l46Var.R();
                            if (objR3 == obj) {
                                objR3 = new ehf(i4);
                                l46Var.p0(objR3);
                            }
                            x16 x16Var2 = (x16) objR3;
                            rxg.a(false, x16Var, l46Var, (i5 >> 3) & 112, 1);
                            Iterator it = list.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!pa7.t(((bwa) next).getType().a(), (String) e89Var.getValue()));
                            bwa bwaVar = (bwa) next;
                            boolean zG = l46Var.g(e89Var);
                            Object objR4 = l46Var.R();
                            if (zG || objR4 == obj) {
                                objR4 = new w77(e89Var, 22);
                                l46Var.p0(objR4);
                            }
                            a26 a26Var = (a26) objR4;
                            Object objR5 = l46Var.R();
                            if (objR5 == obj) {
                                objR5 = new ehf(i6);
                                l46Var.p0(objR5);
                            }
                            x16 x16Var3 = (x16) objR5;
                            Object objR6 = l46Var.R();
                            if (objR6 == obj) {
                                objR6 = new ehf(i7);
                                l46Var.p0(objR6);
                            }
                            x16 x16Var4 = (x16) objR6;
                            int i9 = i5 << 18;
                            eec.j(list, bwaVar, false, false, false, true, i, i2, a26Var, x16Var3, x16Var2, x16Var2, x16Var2, x16Var, x16Var2, x16Var4, l46Var, (3670016 & i9) | 805531008 | (i9 & 29360128), ((i5 << 3) & 7168) | 221622);
                            z2 = true;
                        }
                        ojb ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new cs0(i, i2, x16Var, z2, i3);
                        }
                    }

                    public static final void d(int i, int i2, boolean z, boolean z2, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i3) {
                        Object obj;
                        Object hhfVar;
                        int i4;
                        int i5;
                        bwa bwaVar;
                        e89 e89Var;
                        int i6;
                        Object obj2;
                        int i7;
                        Object obj3;
                        Object obj4;
                        x16Var.getClass();
                        x16Var2.getClass();
                        x16Var3.getClass();
                        l46Var.h0(1068808596);
                        int i8 = 4;
                        int i9 = i3 | (l46Var.e(i) ? 4 : 2) | (l46Var.e(i2) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536) | (l46Var.i(x16Var3) ? 1048576 : 524288);
                        if (l46Var.W(i9 & 1, (599187 & i9) != 599186)) {
                            boolean z3 = (i9 & 14) == 4;
                            Object objR = l46Var.R();
                            Object obj5 = sf2.a;
                            Object obj6 = objR;
                            if (z3 || objR == obj5) {
                                Object a12Var = new a12(i, i8);
                                l46Var.p0(a12Var);
                                obj6 = a12Var;
                            }
                            x16 x16Var4 = (x16) obj6;
                            pwf pwfVarA = qd8.a(l46Var);
                            if (pwfVarA == null) {
                                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return;
                            }
                            Class<mhf> cls = mhf.class;
                            mhf mhfVar = (mhf) z5c.G(job.a.b(mhf.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var4);
                            e89 e89VarT = tm7.t(mhfVar.T0, l46Var);
                            Context context = (Context) l46Var.k(uq.b);
                            Object[] objArr = new Object[0];
                            Object objR2 = l46Var.R();
                            if (objR2 == obj5) {
                                obj = objR2;
                                Object ehfVar = new ehf(2);
                                l46Var.p0(ehfVar);
                                obj = ehfVar;
                            }
                            obj = objR2;
                            e89 e89Var2 = (e89) vfh.I(objArr, (x16) obj, l46Var, 48);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            int i10 = i9 & 896;
                            boolean zI = (i10 == 256) | l46Var.i(context) | l46Var.i(mhfVar);
                            Object objR3 = l46Var.R();
                            Object obj7 = objR3;
                            if (zI || objR3 == obj5) {
                                Object ghfVar = new ghf(z, context, mhfVar, null);
                                l46Var.p0(ghfVar);
                                obj7 = ghfVar;
                            }
                            int i11 = mhf.a1;
                            af1.p(mhfVar, boolValueOf, (l26) obj7, l46Var);
                            o0e o0eVarO = mhfVar.o();
                            jhf jhfVar = (jhf) e89VarT.getValue();
                            Boolean boolValueOf2 = Boolean.valueOf(jhfVar.f && jhfVar.g);
                            Boolean boolValueOf3 = Boolean.valueOf(((jhf) e89VarT.getValue()).d);
                            int i12 = i9 & 458752;
                            boolean zG = l46Var.g(e89Var2) | l46Var.i(mhfVar) | l46Var.g(e89VarT) | (i12 == 131072);
                            Object objR4 = l46Var.R();
                            if (zG || objR4 == obj5) {
                                i4 = i9;
                                i5 = i12;
                                bwaVar = null;
                                hhfVar = new hhf(mhfVar, x16Var2, e89Var2, e89VarT, null);
                                mhfVar = mhfVar;
                                e89Var = e89Var2;
                                l46Var.p0(hhfVar);
                            } else {
                                i4 = i9;
                                i5 = i12;
                                bwaVar = null;
                                hhfVar = objR4;
                                e89Var = e89Var2;
                            }
                            af1.q(o0eVarO, boolValueOf2, boolValueOf3, (l26) hhfVar, l46Var);
                            boolean z4 = z && z2 && !((jhf) e89VarT.getValue()).c && !((jhf) e89VarT.getValue()).d;
                            boolean zI2 = ((i4 & 57344) == 16384) | l46Var.i(mhfVar);
                            Object objR5 = l46Var.R();
                            if (zI2 || objR5 == obj5) {
                                i6 = 0;
                                Object fhfVar = new fhf(i6, x16Var, mhfVar);
                                l46Var.p0(fhfVar);
                                obj2 = fhfVar;
                            } else {
                                i6 = 0;
                                obj2 = objR5;
                            }
                            bzd.j(z4, (x16) obj2, l46Var, i6);
                            boolean zG2 = l46Var.g(e89Var) | l46Var.i(mhfVar) | (i10 == 256) | (i5 == 131072);
                            Object objR6 = l46Var.R();
                            Object obj8 = objR6;
                            if (zG2 || objR6 == obj5) {
                                Object nt5Var = new nt5(mhfVar, z, x16Var2, e89Var);
                                l46Var.p0(nt5Var);
                                obj8 = nt5Var;
                            }
                            x16 x16Var5 = (x16) obj8;
                            rxg.a(false, x16Var5, l46Var, 0, 1);
                            List list = z ? ((jhf) e89VarT.getValue()).a : pu4.a;
                            bwa bwaVar2 = ((jhf) e89VarT.getValue()).b;
                            if (!z) {
                                bwaVar2 = bwaVar;
                            }
                            boolean z5 = !z || ((jhf) e89VarT.getValue()).c;
                            boolean z6 = mhfVar.q() || ((jhf) e89VarT.getValue()).h;
                            jhf jhfVar2 = (jhf) e89VarT.getValue();
                            boolean z7 = jhfVar2.f && !jhfVar2.g;
                            boolean z8 = ((jhf) e89VarT.getValue()).e;
                            boolean zI3 = l46Var.i(mhfVar);
                            Object objR7 = l46Var.R();
                            if (zI3 || objR7 == obj5) {
                                objR7 = new dne(1, mhfVar, cls, "selectProduct", "selectProduct(Lnet/xmind/donut/payment/Product;)V", 0, 5);
                                l46Var.p0(objR7);
                            }
                            a26 a26Var = (a26) ((ym7) objR7);
                            boolean zI4 = l46Var.i(mhfVar);
                            List list2 = list;
                            Object objR8 = l46Var.R();
                            if (zI4 || objR8 == obj5) {
                                objR8 = new yv9(0, mhfVar, cls, "reportPurchaseClick", "reportPurchaseClick()V", 0, 29);
                                l46Var.p0(objR8);
                            }
                            x16 x16Var6 = (x16) ((ym7) objR8);
                            boolean zI5 = l46Var.i(mhfVar) | l46Var.i(context);
                            Object objR9 = l46Var.R();
                            if (zI5 || objR9 == obj5) {
                                i7 = 1;
                                Object fhfVar2 = new fhf(mhfVar, context, false, i7);
                                l46Var.p0(fhfVar2);
                                obj3 = fhfVar2;
                            } else {
                                i7 = 1;
                                obj3 = objR9;
                            }
                            x16 x16Var7 = (x16) obj3;
                            boolean zI6 = l46Var.i(mhfVar);
                            Object objR10 = l46Var.R();
                            if (zI6 || objR10 == obj5) {
                                objR10 = new ihf(0, mhfVar, cls, "loadSubscriptionStatus", "loadSubscriptionStatus()V", 0, 0);
                                l46Var.p0(objR10);
                            }
                            x16 x16Var8 = (x16) ((ym7) objR10);
                            int i13 = (i10 == 256 ? i7 : 0) | (l46Var.i(mhfVar) ? 1 : 0);
                            Object objR11 = l46Var.R();
                            Object obj9 = objR11;
                            if (i13 != 0 || objR11 == obj5) {
                                Object mv0Var = new mv0(z, mhfVar, 11);
                                l46Var.p0(mv0Var);
                                obj9 = mv0Var;
                            }
                            x16 x16Var9 = (x16) obj9;
                            boolean z9 = (i10 == 256) | ((i4 & 3670016) == 1048576);
                            Object objR12 = l46Var.R();
                            if (z9 || objR12 == obj5) {
                                Object on2Var = new on2(z, x16Var3, 13);
                                l46Var.p0(on2Var);
                                obj4 = on2Var;
                            } else {
                                obj4 = objR12;
                            }
                            x16 x16Var10 = (x16) obj4;
                            boolean zI7 = l46Var.i(mhfVar);
                            Object objR13 = l46Var.R();
                            if (zI7 || objR13 == obj5) {
                                objR13 = new yv9(0, mhfVar, cls, "reportExpandPlans", "reportExpandPlans()V", 0, 28);
                                l46Var.p0(objR13);
                            }
                            eec.j(list2, bwaVar2, z5, z6, z7, z8, i, i2, a26Var, x16Var6, x16Var7, x16Var8, x16Var9, x16Var5, x16Var10, (x16) ((ym7) objR13), l46Var, (i4 << 18) & 33030144, 0);
                        } else {
                            l46Var.Z();
                        }
                        ojb ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            ojbVarV.d = new k28(i, i2, z, z2, x16Var, x16Var2, x16Var3, i3);
                        }
                    }

                    public static void e(c cVar, InputStream inputStream, dgg dggVar, long j) throws Throwable {
                        dgg dggVar2;
                        DataInputStream dataInputStream;
                        c cVar2;
                        int unsignedShort;
                        byte[] bArr = new byte[16384];
                        DataInputStream dataInputStream2 = new DataInputStream(new BufferedInputStream(inputStream, 4096));
                        int i = dataInputStream2.readInt();
                        if (i != -771763713) {
                            throw new ueg("Unexpected magic=".concat(String.format("%x", Integer.valueOf(i))));
                        }
                        int i2 = dataInputStream2.read();
                        if (i2 != 4) {
                            throw new ueg(tec.e(i2, "Unexpected version="));
                        }
                        long j2 = 0;
                        while (true) {
                            long j3 = j - j2;
                            try {
                                int unsignedShort2 = dataInputStream2.read();
                                if (unsignedShort2 == -1) {
                                    throw new IOException("Patch file overrun");
                                }
                                if (unsignedShort2 == 0) {
                                    dggVar.flush();
                                    return;
                                }
                                switch (unsignedShort2) {
                                    case 247:
                                        dggVar2 = dggVar;
                                        unsignedShort2 = dataInputStream2.readUnsignedShort();
                                        g(bArr, dataInputStream2, dggVar2, unsignedShort2, j3);
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 248:
                                        dggVar2 = dggVar;
                                        unsignedShort2 = dataInputStream2.readInt();
                                        g(bArr, dataInputStream2, dggVar2, unsignedShort2, j3);
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 249:
                                        dggVar2 = dggVar;
                                        DataInputStream dataInputStream3 = dataInputStream2;
                                        c cVar3 = cVar;
                                        long unsignedShort3 = dataInputStream3.readUnsignedShort();
                                        int i3 = dataInputStream3.read();
                                        if (i3 == -1) {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                        f(bArr, cVar3, dggVar2, unsignedShort3, i3, j3);
                                        cVar = cVar3;
                                        dataInputStream2 = dataInputStream3;
                                        unsignedShort2 = i3;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                        break;
                                    case 250:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        cVar2 = cVar;
                                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                                        unsignedShort = dataInputStream.readUnsignedShort();
                                        f(bArr, cVar2, dggVar2, unsignedShort4, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 251:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        cVar2 = cVar;
                                        long unsignedShort5 = dataInputStream.readUnsignedShort();
                                        unsignedShort = dataInputStream.readInt();
                                        f(bArr, cVar2, dggVar2, unsignedShort5, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 252:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        cVar2 = cVar;
                                        long j4 = dataInputStream.readInt();
                                        unsignedShort = dataInputStream.read();
                                        if (unsignedShort == -1) {
                                            throw new IOException("Unexpected end of patch");
                                        }
                                        f(bArr, cVar2, dggVar2, j4, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                        break;
                                    case 253:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        cVar2 = cVar;
                                        long j5 = dataInputStream.readInt();
                                        unsignedShort = dataInputStream.readUnsignedShort();
                                        f(bArr, cVar2, dggVar2, j5, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 254:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        cVar2 = cVar;
                                        long j6 = dataInputStream.readInt();
                                        unsignedShort = dataInputStream.readInt();
                                        f(bArr, cVar2, dggVar2, j6, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    case 255:
                                        dggVar2 = dggVar;
                                        dataInputStream = dataInputStream2;
                                        long j7 = dataInputStream.readLong();
                                        unsignedShort = dataInputStream.readInt();
                                        cVar2 = cVar;
                                        f(bArr, cVar2, dggVar2, j7, unsignedShort, j3);
                                        cVar = cVar2;
                                        unsignedShort2 = unsignedShort;
                                        dataInputStream2 = dataInputStream;
                                        j2 += (long) unsignedShort2;
                                        dggVar = dggVar2;
                                        break;
                                    default:
                                        dggVar2 = dggVar;
                                        try {
                                            g(bArr, dataInputStream2, dggVar2, unsignedShort2, j3);
                                            dataInputStream = dataInputStream2;
                                            dataInputStream2 = dataInputStream;
                                            j2 += (long) unsignedShort2;
                                            dggVar = dggVar2;
                                        } catch (Throwable th) {
                                            th = th;
                                            Throwable th2 = th;
                                            dggVar2.flush();
                                            throw th2;
                                        }
                                        break;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dggVar2 = dggVar;
                            }
                        }
                    }

                    public static void f(byte[] bArr, c cVar, dgg dggVar, long j, int i, long j2) throws IOException {
                        InputStream inputStreamH;
                        if (i < 0) {
                            yg5.m("copyLength negative");
                            return;
                        }
                        if (j < 0) {
                            yg5.m("inputOffset negative");
                            return;
                        }
                        long j3 = i;
                        if (j3 > j2) {
                            yg5.m("Output length overrun");
                            return;
                        }
                        try {
                            zeg zegVar = new zeg(cVar, j, j3);
                            synchronized (zegVar) {
                                long j4 = zegVar.c - zegVar.b;
                                long jB = zegVar.b(zegVar.b);
                                inputStreamH = zegVar.a.h(jB, zegVar.b(j4 + jB) - jB);
                            }
                            while (i > 0) {
                                try {
                                    int iMin = Math.min(i, 16384);
                                    int i2 = 0;
                                    while (i2 < iMin) {
                                        int i3 = inputStreamH.read(bArr, i2, iMin - i2);
                                        if (i3 == -1) {
                                            throw new IOException("truncated input stream");
                                        }
                                        i2 += i3;
                                        throw new IOException("patch underrun", e);
                                    }
                                    dggVar.write(bArr, 0, iMin);
                                    i -= iMin;
                                } catch (Throwable th) {
                                    try {
                                        inputStreamH.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                            inputStreamH.close();
                        } catch (EOFException e) {
                            throw new IOException("patch underrun", e);
                        }
                    }

                    public static void g(byte[] bArr, DataInputStream dataInputStream, dgg dggVar, int i, long j) throws IOException {
                        if (i < 0) {
                            yg5.m("copyLength negative");
                            return;
                        }
                        if (i > j) {
                            yg5.m("Output length overrun");
                            return;
                        }
                        while (i > 0) {
                            try {
                                int iMin = Math.min(i, 16384);
                                dataInputStream.readFully(bArr, 0, iMin);
                                dggVar.write(bArr, 0, iMin);
                                i -= iMin;
                            } catch (EOFException unused) {
                                yg5.m("patch underrun");
                                return;
                            }
                        }
                    }

                    public static final void h(File file, File file2, hy0 hy0Var, jmd jmdVar) throws IOException {
                        lx4 entries = TarotCardType.getEntries();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator<E> it = entries.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add(((TarotCardType) it.next()).getCardKey() + ".webp");
                        }
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        pv2 context = jmdVar.getContext();
                        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(a.b(file, new FileInputStream(file)), UserMetadata.MAX_INTERNAL_KEY_SIZE));
                        try {
                            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                tq.v(context);
                                String name = nextEntry.getName();
                                name.getClass();
                                String strG0 = v4e.g0('/', name, name);
                                if (!nextEntry.isDirectory() && linkedHashSet.contains(strG0)) {
                                    File file3 = new File(file2, strG0);
                                    if (!l(file3)) {
                                        q(file3, new h6b(26, zipInputStream, context));
                                    }
                                    linkedHashSet2.add(strG0);
                                    hy0Var.d(new Float(linkedHashSet2.size() / linkedHashSet.size()));
                                }
                                zipInputStream.closeEntry();
                            }
                            zipInputStream.close();
                            if (linkedHashSet2.equals(linkedHashSet)) {
                                return;
                            }
                            ho7.j(ks0.k("Incomplete skin archive: ", linkedHashSet2.size(), "/", linkedHashSet.size()));
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(zipInputStream, th);
                                throw th2;
                            }
                        }
                    }

                    public static int i(CharSequence charSequence, int i) {
                        boolean z = false;
                        int i2 = 0;
                        int i3 = 0;
                        i = -1;
                        int i4 = 0;
                        while (i < charSequence.length()) {
                            char cCharAt = charSequence.charAt(i);
                            if (cCharAt != ',') {
                                if (cCharAt == '[') {
                                    i2++;
                                } else {
                                    if (cCharAt != ']') {
                                        if (cCharAt != '`') {
                                            if (cCharAt == '{') {
                                                i3++;
                                            } else if (cCharAt == '}') {
                                                i3--;
                                                if (i3 >= 0) {
                                                }
                                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                                if (cCharAt == '.') {
                                                    continue;
                                                } else if (cCharAt != '/') {
                                                    if (cCharAt != '>') {
                                                        if (cCharAt == '?') {
                                                            continue;
                                                        } else if (cCharAt != 8232 && cCharAt != 8233) {
                                                            switch (cCharAt) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                case 5:
                                                                case 6:
                                                                case 7:
                                                                case '\b':
                                                                case '\t':
                                                                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                                                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                                                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                                                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                                                case 14:
                                                                case 15:
                                                                case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                                                                case 17:
                                                                case 18:
                                                                case 19:
                                                                case 20:
                                                                case 21:
                                                                case 22:
                                                                case 23:
                                                                case 24:
                                                                case 25:
                                                                case 26:
                                                                case 27:
                                                                case 28:
                                                                case 29:
                                                                case 30:
                                                                case 31:
                                                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                                                case '\"':
                                                                    break;
                                                                case '!':
                                                                    continue;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case '\'':
                                                                            boolean z2 = !z;
                                                                            if (z) {
                                                                                i = i;
                                                                            }
                                                                            z = z2;
                                                                            continue;
                                                                        case '(':
                                                                            i4++;
                                                                            continue;
                                                                        case ')':
                                                                            i4--;
                                                                            if (i4 < 0) {
                                                                            }
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case ':':
                                                                                case ';':
                                                                                    continue;
                                                                                case '<':
                                                                                    break;
                                                                                default:
                                                                                    switch (cCharAt) {
                                                                                        case 127:
                                                                                        case UserMetadata.MAX_ROLLOUT_ASSIGNMENTS /* 128 */:
                                                                                        case 129:
                                                                                        case 130:
                                                                                        case 131:
                                                                                        case 132:
                                                                                        case 133:
                                                                                        case 134:
                                                                                        case 135:
                                                                                        case 136:
                                                                                        case 137:
                                                                                        case 138:
                                                                                        case 139:
                                                                                        case 140:
                                                                                        case 141:
                                                                                        case 142:
                                                                                        case 143:
                                                                                        case 144:
                                                                                        case 145:
                                                                                        case 146:
                                                                                        case 147:
                                                                                        case 148:
                                                                                        case 149:
                                                                                        case 150:
                                                                                        case 151:
                                                                                        case 152:
                                                                                        case 153:
                                                                                        case 154:
                                                                                        case 155:
                                                                                        case 156:
                                                                                        case 157:
                                                                                        case 158:
                                                                                        case 159:
                                                                                        case 160:
                                                                                            break;
                                                                                        default:
                                                                                            switch (cCharAt) {
                                                                                                case UserMetadata.MAX_INTERNAL_KEY_SIZE /* 8192 */:
                                                                                                case 8193:
                                                                                                case 8194:
                                                                                                case 8195:
                                                                                                case 8196:
                                                                                                case 8197:
                                                                                                case 8198:
                                                                                                case 8199:
                                                                                                case 8200:
                                                                                                case 8201:
                                                                                                case 8202:
                                                                                                    break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                } else if (i == i - 1) {
                                                }
                                            }
                                        }
                                        return i;
                                    }
                                    i2--;
                                    if (i2 < 0) {
                                        return i;
                                    }
                                }
                            }
                            i++;
                        }
                        return i;
                    }

                    public static final xi j(rpe rpeVar) {
                        if (rpeVar instanceof rpe) {
                            return ndb.Y;
                        }
                        yg5.l(rpeVar, "Unknown position: ");
                        return null;
                    }

                    public static final gx6 k() {
                        gx6 gx6Var = b;
                        if (gx6Var != null) {
                            return gx6Var;
                        }
                        fx6 fx6Var = new fx6("Filled.VolumeDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i = msf.a;
                        dtd dtdVar = new dtd(y72.b);
                        s71 s71Var = new s71(1);
                        s71Var.p(18.5f, 12.0f);
                        s71Var.j(0.0f, -1.77f, -1.02f, -3.29f, -2.5f, -4.03f);
                        s71Var.t(8.05f);
                        s71Var.j(1.48f, -0.73f, 2.5f, -2.25f, 2.5f, -4.02f);
                        s71Var.h();
                        s71Var.p(5.0f, 9.0f);
                        s71Var.t(6.0f);
                        s71Var.m(4.0f);
                        s71Var.o(5.0f, 5.0f);
                        s71Var.s(4.0f);
                        s71Var.n(9.0f, 9.0f);
                        s71Var.l(5.0f);
                        s71Var.h();
                        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        gx6 gx6VarB = fx6Var.b();
                        b = gx6VarB;
                        return gx6VarB;
                    }

                    public static final boolean l(File file) {
                        Object dzbVar;
                        try {
                            boolean z = false;
                            if (file.isFile() && file.length() >= 20) {
                                DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(a.b(file, new FileInputStream(file)), UserMetadata.MAX_INTERNAL_KEY_SIZE));
                                try {
                                    if (dataInputStream.readInt() == 1380533830 && (((long) Integer.reverseBytes(dataInputStream.readInt())) & 4294967295L) + 8 == file.length() && dataInputStream.readInt() == 1464156752) {
                                        dataInputStream.close();
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                        if (options.outWidth > 0 && options.outHeight > 0) {
                                            z = true;
                                        }
                                        dzbVar = Boolean.valueOf(z);
                                        Object obj = Boolean.FALSE;
                                        if (dzbVar instanceof dzb) {
                                            dzbVar = obj;
                                        }
                                        return ((Boolean) dzbVar).booleanValue();
                                    }
                                    dataInputStream.close();
                                    return false;
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ym8.t(dataInputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                            return false;
                        } catch (Throwable th3) {
                            dzbVar = new dzb(th3);
                        }
                    }

                    public static final void m(String str, m1f m1fVar, a26 a26Var) {
                        str.getClass();
                        m1fVar.getClass();
                        l1f l1fVar = new l1f();
                        a26Var.d(l1fVar);
                        Log.i("Quin:EventTracking", "platform: " + m1fVar + ", log event: " + str + ", : " + l1fVar.a);
                    }

                    public static String n(String str, String str2) {
                        int length = str.length() - str2.length();
                        if (length < 0 || length > 1) {
                            qc0.j("Invalid input received");
                            return null;
                        }
                        StringBuilder sb = new StringBuilder(str2.length() + str.length());
                        for (int i = 0; i < str.length(); i++) {
                            sb.append(str.charAt(i));
                            if (str2.length() > i) {
                                sb.append(str2.charAt(i));
                            }
                        }
                        return sb.toString();
                    }

                    public static final float o(l46 l46Var) {
                        long j = ((p9f) l46Var.k(r9f.a)).l.b.c;
                        long j2 = m8f.l;
                        if ((1095216660480L & j) != 4294967296L) {
                            j = j2;
                        }
                        return ((sw3) l46Var.k(zg2.h)).F(j) / 2.0f;
                    }

                    public static final float p(l46 l46Var) {
                        float f = ((yi4) l46Var.k(p77.c)).a;
                        if (Float.isNaN(f)) {
                            f = 0.0f;
                        }
                        float f2 = (f - ym8.g) / 2.0f;
                        if (f2 < 0.0f) {
                            return 0.0f;
                        }
                        return f2;
                    }

                    public static final void q(File file, h6b h6bVar) {
                        File file2 = new File(file.getParentFile(), tec.l(file.getName(), ".part"));
                        try {
                            h6bVar.d(file2);
                            if (l(file2)) {
                                Files.move(file2.toPath(), file.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                                file2.delete();
                            } else {
                                throw new IllegalStateException(("Invalid skin image: " + file.getName()).toString());
                            }
                        } catch (Throwable th) {
                            file2.delete();
                            throw th;
                        }
                    }

                    public static boolean r(byte b2) {
                        return b2 > -65;
                    }

                    public int hashCode() {
                        switch (this.a) {
                            case 1:
                                return toString().hashCode();
                            default:
                                return super.hashCode();
                        }
                    }

                    public String toString() {
                        switch (this.a) {
                            case 1:
                                String strR = job.a.b(getClass()).r();
                                strR.getClass();
                                return strR;
                            default:
                                return super.toString();
                        }
                    }
                }
