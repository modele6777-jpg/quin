package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import io.sentry.android.core.b1;
import java.io.EOFException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mjg implements or8, jm2, e85, x91, bc0, b36, g1b, ye, s36, na1, dk9, cu2 {
    public static mjg b;
    public static final uzd c = new uzd(17);
    public final Object a;

    public mjg(int i) {
        switch (i) {
            case 7:
                this.a = k79.j();
                break;
            case 8:
                k9b k9bVar = s74.a;
                this.a = (CloseCameraDeviceOnCameraGraphCloseQuirk) s74.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                TimeUnit.MINUTES.getClass();
                kle kleVar = kle.l;
                kleVar.getClass();
                this.a = new ws4(kleVar);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.a = new HashSet();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                this.a = tq.r(Looper.getMainLooper());
                break;
            case 15:
                k9b k9bVar2 = s74.a;
                this.a = (SmallDisplaySizeQuirk) s74.a().b(SmallDisplaySizeQuirk.class);
                break;
            case 20:
                this.a = new d0a(10);
                break;
            case 28:
                this.a = new gg8((Object) null);
                break;
            default:
                int i2 = slg.a;
                this.a = new vrb(14, new ong[]{i8c.z, c});
                break;
        }
    }

    public static synchronized mjg O(Context context) {
        mjg mjgVar;
        Context applicationContext = context.getApplicationContext();
        synchronized (mjg.class) {
            mjgVar = b;
            if (mjgVar == null) {
                mjgVar = new mjg(applicationContext);
                b = mjgVar;
            }
        }
        return mjgVar;
        return mjgVar;
    }

    @Override // defpackage.or8
    public void B(qr8 qr8Var) {
        fnb fnbVar = ((ActionMenuView) this.a).M0;
        if (fnbVar != null) {
            fnbVar.B(qr8Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0297  */
    public void D(int i, int i2, m95 m95Var) throws l0a {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        en8 en8Var = (en8) this.a;
        fsf fsfVar = en8Var.b;
        SparseArray sparseArray = en8Var.c;
        d0a d0aVar = en8Var.l;
        d0a d0aVar2 = en8Var.j;
        int i14 = 2;
        int i15 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (en8Var.U != 2) {
                    return;
                }
                dn8 dn8Var = (dn8) sparseArray.get(en8Var.a0);
                int i16 = en8Var.d0;
                d0a d0aVar3 = en8Var.q;
                if (i16 != 4 || !"V_VP9".equals(dn8Var.c)) {
                    m95Var.l(i2);
                    return;
                } else {
                    d0aVar3.J(i2);
                    m95Var.readFully(d0aVar3.a, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                en8Var.h(i);
                dn8 dn8Var2 = en8Var.A;
                int i17 = dn8Var2.i;
                if (i17 != 1685485123 && i17 != 1685480259) {
                    m95Var.l(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                dn8Var2.P = bArr;
                m95Var.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                en8Var.h(i);
                byte[] bArr2 = new byte[i2];
                en8Var.A.k = bArr2;
                m95Var.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                m95Var.readFully(bArr3, 0, i2);
                en8Var.h(i);
                en8Var.A.l = new j1f(1, bArr3, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(d0aVar.a, (byte) 0);
                m95Var.readFully(d0aVar.a, 4 - i2, i2);
                d0aVar.M(0);
                en8Var.C = (int) d0aVar.B();
                return;
            }
            if (i == 25506) {
                en8Var.h(i);
                byte[] bArr4 = new byte[i2];
                en8Var.A.m = bArr4;
                m95Var.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw l0a.a(null, "Unexpected id: " + i);
            }
            en8Var.h(i);
            byte[] bArr5 = new byte[i2];
            en8Var.A.y = bArr5;
            m95Var.readFully(bArr5, 0, i2);
            return;
        }
        int i18 = 8;
        if (en8Var.U == 0) {
            en8Var.a0 = (int) fsfVar.h(m95Var, false, true, 8);
            en8Var.b0 = fsfVar.c;
            en8Var.W = -9223372036854775807L;
            en8Var.U = 1;
            d0aVar2.J(0);
        }
        dn8 dn8Var3 = (dn8) sparseArray.get(en8Var.a0);
        if (dn8Var3 == null) {
            m95Var.l(i2 - en8Var.b0);
            en8Var.U = 0;
            return;
        }
        dn8Var3.d0.getClass();
        if (en8Var.U == 1) {
            en8Var.m(m95Var, 3);
            int i19 = (d0aVar2.a[2] & 6) >> 1;
            if (i19 == 0) {
                en8Var.Y = 1;
                int[] iArr2 = en8Var.Z;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                en8Var.Z = iArr2;
                iArr2[0] = (i2 - en8Var.b0) - 3;
            } else {
                en8Var.m(m95Var, 4);
                int i20 = (d0aVar2.a[3] & 255) + 1;
                en8Var.Y = i20;
                int[] iArr3 = en8Var.Z;
                if (iArr3 == null) {
                    iArr3 = new int[i20];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i20) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i20)];
                    }
                }
                en8Var.Z = iArr3;
                if (i19 == 2) {
                    int i21 = (i2 - en8Var.b0) - 4;
                    int i22 = en8Var.Y;
                    Arrays.fill(iArr3, 0, i22, i21 / i22);
                } else {
                    if (i19 == 1) {
                        int i23 = 0;
                        int i24 = 0;
                        int i25 = i3;
                        while (true) {
                            i10 = en8Var.Y - 1;
                            iArr = en8Var.Z;
                            if (i23 >= i10) {
                                break;
                            }
                            iArr[i23] = 0;
                            while (true) {
                                i11 = i25 + 1;
                                en8Var.m(m95Var, i11);
                                int i26 = d0aVar2.a[i25] & 255;
                                int[] iArr4 = en8Var.Z;
                                i12 = iArr4[i23] + i26;
                                iArr4[i23] = i12;
                                if (i26 != 255) {
                                    break;
                                } else {
                                    i25 = i11;
                                }
                            }
                            i24 += i12;
                            i23++;
                            i25 = i11;
                        }
                        iArr[i10] = ((i2 - en8Var.b0) - i25) - i24;
                    } else {
                        if (i19 != 3) {
                            throw l0a.a(null, "Unexpected lacing value: " + i19);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = i3;
                        while (true) {
                            int i30 = en8Var.Y - 1;
                            int[] iArr5 = en8Var.Z;
                            if (i27 >= i30) {
                                i4 = i14;
                                i5 = i15;
                                iArr5[i30] = ((i2 - en8Var.b0) - i29) - i28;
                                break;
                            }
                            iArr5[i27] = i15;
                            int i31 = i29 + 1;
                            en8Var.m(m95Var, i31);
                            if (d0aVar2.a[i29] == 0) {
                                throw l0a.a(null, "No valid varint length mask found");
                            }
                            int i32 = i15;
                            while (true) {
                                if (i32 >= i18) {
                                    i6 = i18;
                                    i7 = i14;
                                    i8 = i15;
                                    j = 0;
                                    i9 = i31;
                                    break;
                                }
                                i6 = i18;
                                int i33 = 1 << (7 - i32);
                                i8 = i15;
                                if ((d0aVar2.a[i29] & i33) != 0) {
                                    i9 = i31 + i32;
                                    en8Var.m(m95Var, i9);
                                    i7 = i14;
                                    j = (~i33) & d0aVar2.a[i29] & 255;
                                    while (i31 < i9) {
                                        j = (j << i6) | ((long) (d0aVar2.a[i31] & 255));
                                        i31++;
                                    }
                                    if (i27 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i32 * 7) + 6)) - 1;
                                    break;
                                }
                                i32++;
                                i15 = i8;
                                i18 = i6;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw l0a.a(null, "EBML lacing sample size out of range.");
                            }
                            int i34 = (int) j;
                            int[] iArr6 = en8Var.Z;
                            if (i27 != 0) {
                                i34 += iArr6[i27 - 1];
                            }
                            iArr6[i27] = i34;
                            i28 += i34;
                            i27++;
                            i29 = i9;
                            i15 = i8;
                            i18 = i6;
                            i14 = i7;
                        }
                    }
                    byte[] bArr6 = d0aVar2.a;
                    en8Var.V = en8Var.o((bArr6[1] & 255) | (bArr6[i5] << 8)) + en8Var.S;
                    if (dn8Var3.f != 1 || (i == 163 && (d0aVar2.a[i4] & 128) == 128)) {
                        i13 = 1;
                    } else {
                        i13 = i5;
                    }
                    en8Var.c0 = i13;
                    en8Var.U = i4;
                    en8Var.X = i5;
                }
            }
            i4 = 2;
            i5 = 0;
            byte[] bArr7 = d0aVar2.a;
            en8Var.V = en8Var.o((bArr7[1] & 255) | (bArr7[i5] << 8)) + en8Var.S;
            if (dn8Var3.f != 1) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            en8Var.c0 = i13;
            en8Var.U = i4;
            en8Var.X = i5;
        }
        if (i == 163) {
            while (true) {
                int i35 = en8Var.X;
                if (i35 >= en8Var.Y) {
                    en8Var.U = 0;
                    return;
                }
                en8Var.i(dn8Var3, ((long) ((en8Var.X * dn8Var3.g) / 1000)) + en8Var.V, en8Var.c0, en8Var.q(m95Var, dn8Var3, en8Var.Z[i35], false), 0);
                en8Var.X++;
            }
        } else {
            while (true) {
                int i36 = en8Var.X;
                if (i36 >= en8Var.Y) {
                    return;
                }
                int[] iArr7 = en8Var.Z;
                iArr7[i36] = en8Var.q(m95Var, dn8Var3, iArr7[i36], true);
                en8Var.X++;
            }
        }
    }

    public void E(char c2) {
        if (c2 <= 127) {
            ((BitSet) this.a).set(c2);
        } else {
            qc0.j("Can only match ASCII characters");
        }
    }

    public void F(int i, long j) throws l0a {
        en8 en8Var = (en8) this.a;
        if (i == 136) {
            en8Var.h(i);
            en8Var.A.b0 = j == 1;
            return;
        }
        if (i == 137) {
            en8Var.k(i).e = j;
            return;
        }
        if (i == 145) {
            en8Var.k(i).b = j;
            return;
        }
        if (i == 146) {
            en8Var.k(i).c = j;
            return;
        }
        if (i == 240) {
            if (en8Var.B) {
                return;
            }
            en8Var.g(i);
            if (en8Var.J == -1) {
                en8Var.J = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (en8Var.B) {
                return;
            }
            en8Var.g(i);
            if (en8Var.I == -1) {
                en8Var.I = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw l0a.a(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw l0a.a(null, "ContentEncodingScope " + j + " not supported");
        }
        if (i == 29636) {
            en8Var.k(i).a = j;
            return;
        }
        if (i == 29637) {
            en8Var.h(i);
            en8Var.A.e = j;
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    en8Var.h(i);
                    en8Var.A.f = 2;
                    return;
                }
                if (i2 == 2) {
                    en8Var.h(i);
                    en8Var.A.f = 1;
                    return;
                } else if (i2 == 17) {
                    en8Var.h(i);
                    en8Var.A.f = 3;
                    return;
                } else if (i2 != 33) {
                    en8Var.h(i);
                    en8Var.A.f = -1;
                    return;
                } else {
                    en8Var.h(i);
                    en8Var.A.f = 5;
                    return;
                }
            case 152:
                en8Var.k(i).d = j == 1;
                return;
            case 155:
                en8Var.W = en8Var.o(j);
                return;
            case 159:
                en8Var.h(i);
                en8Var.A.Q = (int) j;
                return;
            case 176:
                en8Var.h(i);
                en8Var.A.o = (int) j;
                return;
            case 179:
                if (en8Var.B) {
                    return;
                }
                en8Var.g(i);
                en8Var.G = en8Var.o(j);
                return;
            case 186:
                en8Var.h(i);
                en8Var.A.p = (int) j;
                return;
            case 215:
                en8Var.h(i);
                en8Var.A.d = (int) j;
                return;
            case 231:
                en8Var.S = en8Var.o(j);
                return;
            case 238:
                en8Var.d0 = (int) j;
                return;
            case 247:
                if (en8Var.B) {
                    return;
                }
                en8Var.g(i);
                en8Var.H = (int) j;
                return;
            case 251:
                en8Var.e0 = true;
                return;
            case 16871:
                en8Var.h(i);
                en8Var.A.i = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw l0a.a(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw l0a.a(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw l0a.a(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw l0a.a(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw l0a.a(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                en8Var.D = j + en8Var.t;
                return;
            case 21432:
                int i3 = (int) j;
                en8Var.h(i);
                if (i3 == 0) {
                    en8Var.A.z = 0;
                    return;
                }
                if (i3 == 1) {
                    en8Var.A.z = 2;
                    return;
                } else if (i3 == 3) {
                    en8Var.A.z = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    en8Var.A.z = 3;
                    return;
                }
            case 21680:
                en8Var.h(i);
                en8Var.A.r = (int) j;
                return;
            case 21682:
                en8Var.h(i);
                en8Var.A.t = (int) j;
                return;
            case 21690:
                en8Var.h(i);
                en8Var.A.s = (int) j;
                return;
            case 21930:
                en8Var.h(i);
                en8Var.A.a0 = j == 1;
                return;
            case 21938:
                en8Var.h(i);
                en8Var.A.q = (int) j;
                return;
            case 21998:
                en8Var.h(i);
                en8Var.A.h = (int) j;
                return;
            case 22186:
                en8Var.h(i);
                en8Var.A.U = j;
                return;
            case 22203:
                en8Var.h(i);
                en8Var.A.V = j;
                return;
            case 25188:
                en8Var.h(i);
                en8Var.A.R = (int) j;
                return;
            case 30114:
                en8Var.f0 = j;
                return;
            case 30321:
                en8Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    en8Var.A.u = 0;
                    return;
                }
                if (i4 == 1) {
                    en8Var.A.u = 1;
                    return;
                } else if (i4 == 2) {
                    en8Var.A.u = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    en8Var.A.u = 3;
                    return;
                }
            case 2352003:
                en8Var.h(i);
                en8Var.A.g = (int) j;
                return;
            case 2807729:
                en8Var.u = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        en8Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            en8Var.A.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            en8Var.A.C = 1;
                            return;
                        }
                    case 21946:
                        en8Var.h(i);
                        int iG = e82.g((int) j);
                        if (iG != -1) {
                            en8Var.A.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        en8Var.h(i);
                        int iF = e82.f((int) j);
                        if (iF != -1) {
                            en8Var.A.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        en8Var.h(i);
                        en8Var.A.D = (int) j;
                        return;
                    case 21949:
                        en8Var.h(i);
                        en8Var.A.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public su8 G(m95 m95Var, pu6 pu6Var, int i) {
        int i2;
        d0a d0aVar = (d0a) this.a;
        int i3 = 0;
        su8 su8VarO = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = d0aVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    m95Var.o(d0aVar.a, i6 - i7, i7);
                    d0aVar.M(i5);
                    d0aVar.L(i6);
                    if (d0aVar.a() < 3) {
                        yg5.b(d0aVar.b, d0aVar.c);
                        return null;
                    }
                    int iC = d0aVar.C();
                    i2 = d0aVar.b - 3;
                    d0aVar.b = i2;
                    if (iC == 4801587) {
                        break;
                    }
                    if (qn4.B(d0aVar.i()) == -1) {
                        if (i4 == 0) {
                            d0aVar.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    m95Var.k();
                    m95Var.f(i3);
                    return su8VarO;
                } catch (EOFException unused) {
                }
            }
            d0aVar.N(6);
            int iY = d0aVar.y();
            int i8 = iY + 10;
            if (su8VarO == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(d0aVar.a, i2, bArr2, 0, 10);
                m95Var.o(bArr2, 10, iY);
                su8VarO = new qu6(pu6Var).o(bArr2, i8);
            } else {
                m95Var.f(iY);
            }
            i3 += i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void H(flb flbVar, h71 h71Var, h71 h71Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.a;
        flbVar.m(false);
        nr3 nr3Var = (nr3) recyclerView.b1;
        if (h71Var != null) {
            nr3Var.getClass();
            int i = h71Var.b;
            int i2 = h71Var2.b;
            if (i == i2 && h71Var.c == h71Var2.c) {
                nr3Var.l(flbVar);
                flbVar.a.setAlpha(0.0f);
                nr3Var.i.add(flbVar);
                zG = true;
            } else {
                zG = nr3Var.g(flbVar, i, h71Var.c, i2, h71Var2.c);
            }
        } else {
            nr3Var.l(flbVar);
            flbVar.a.setAlpha(0.0f);
            nr3Var.i.add(flbVar);
            zG = true;
        }
        if (zG) {
            recyclerView.P();
        }
    }

    public void I(flb flbVar, h71 h71Var, h71 h71Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.c.q(flbVar);
        recyclerView.e(flbVar);
        flbVar.m(false);
        nr3 nr3Var = (nr3) recyclerView.b1;
        nr3Var.getClass();
        int i = h71Var.b;
        int i2 = h71Var.c;
        View view = flbVar.a;
        int left = h71Var2 == null ? view.getLeft() : h71Var2.b;
        int top = h71Var2 == null ? view.getTop() : h71Var2.c;
        if (flbVar.g() || (i == left && i2 == top)) {
            nr3Var.l(flbVar);
            nr3Var.h.add(flbVar);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = nr3Var.g(flbVar, i, i2, left, top);
        }
        if (zG) {
            recyclerView.P();
        }
    }

    public egh J(w84 w84Var, AndroidComposeView androidComposeView) {
        long j;
        boolean z;
        long jG;
        gg8 gg8Var = (gg8) this.a;
        ArrayList arrayList = (ArrayList) w84Var.b;
        gg8 gg8Var2 = new gg8(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            qia qiaVar = (qia) arrayList.get(i);
            long j2 = qiaVar.a;
            pia piaVar = (pia) gg8Var.c(j2);
            if (piaVar == null) {
                j = qiaVar.b;
                jG = qiaVar.d;
                z = false;
            } else {
                long j3 = piaVar.a;
                j = j3;
                z = piaVar.c;
                jG = androidComposeView.G(piaVar.b);
            }
            long j4 = qiaVar.a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            gg8Var2.e(j4, new oia(j4, qiaVar.b, qiaVar.d, qiaVar.e, qiaVar.f, j, jG, z, qiaVar.g, qiaVar.i, qiaVar.j, qiaVar.k, qiaVar.l, qiaVar.m));
            boolean z2 = qiaVar.e;
            if (z2) {
                gg8Var.e(j2, new pia(qiaVar.b, qiaVar.c, z2));
            } else {
                gg8Var.f(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new egh(gg8Var2, w84Var);
    }

    public void K(char c2, char c3) {
        while (c2 <= c3) {
            E(c2);
            c2 = (char) (c2 + 1);
        }
    }

    public ArrayList L(int i) {
        ArrayList arrayList = new ArrayList();
        jx7 jx7Var = (jx7) this.a;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            zw7 zw7Var = jx7Var.b ? jx7Var.c : (zw7) jx7Var.e.getValue();
            if (zw7Var != null) {
                kmb kmbVar = new kmb();
                kmbVar.element = 1;
                List list = (List) zw7Var.k.d(Integer.valueOf(i));
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    iy9 iy9Var = (iy9) list.get(i2);
                    e08 e08Var = jx7Var.o;
                    int iIntValue = ((Number) iy9Var.d()).intValue();
                    long j = ((kl2) iy9Var.e()).a;
                    vea veaVar = jx7.w;
                    kmbVar = kmbVar;
                    arrayList.add(e08Var.a(iIntValue, j, false, new wg((ArrayList) null, kmbVar, list, i, zw7Var)));
                }
            }
            return arrayList;
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }

    public void M(long j, int i, long j2) throws l0a {
        en8 en8Var = (en8) this.a;
        en8Var.p0.getClass();
        if (i == 128) {
            en8Var.k(i).h = null;
            en8Var.k(i).i = null;
            return;
        }
        if (i == 160) {
            en8Var.e0 = false;
            en8Var.f0 = 0L;
            return;
        }
        if (i == 174) {
            dn8 dn8Var = new dn8();
            dn8Var.o = -1;
            dn8Var.p = -1;
            dn8Var.q = -1;
            dn8Var.r = -1;
            dn8Var.s = -1;
            dn8Var.t = 0;
            dn8Var.u = -1;
            dn8Var.v = 0.0f;
            dn8Var.w = 0.0f;
            dn8Var.x = 0.0f;
            dn8Var.y = null;
            dn8Var.z = -1;
            dn8Var.A = -1;
            dn8Var.B = -1;
            dn8Var.C = -1;
            dn8Var.D = 1000;
            dn8Var.E = 200;
            dn8Var.F = -1.0f;
            dn8Var.G = -1.0f;
            dn8Var.H = -1.0f;
            dn8Var.I = -1.0f;
            dn8Var.J = -1.0f;
            dn8Var.K = -1.0f;
            dn8Var.L = -1.0f;
            dn8Var.M = -1.0f;
            dn8Var.N = -1.0f;
            dn8Var.O = -1.0f;
            dn8Var.Q = 1;
            dn8Var.R = -1;
            dn8Var.S = -1;
            dn8Var.T = 8000;
            dn8Var.U = 0L;
            dn8Var.V = 0L;
            dn8Var.X = false;
            dn8Var.b0 = true;
            dn8Var.c0 = "eng";
            en8Var.A = dn8Var;
            dn8Var.a = en8Var.x;
            return;
        }
        if (i == 187) {
            if (en8Var.B) {
                return;
            }
            en8Var.g(i);
            en8Var.G = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            en8Var.C = -1;
            en8Var.D = -1L;
            return;
        }
        if (i == 20533) {
            en8Var.h(i);
            en8Var.A.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = en8Var.t;
            if (j3 != -1 && j3 != j) {
                throw l0a.a(null, "Multiple Segment elements not supported");
            }
            en8Var.t = j;
            en8Var.s = j2;
            return;
        }
        if (i == 475249515) {
            if (en8Var.B) {
                return;
            }
            en8Var.F = true;
            return;
        }
        if (i == 524531317) {
            if (en8Var.O != -1 && !en8Var.R) {
                en8Var.P = true;
            }
            if (en8Var.B) {
                return;
            }
            if (en8Var.e && en8Var.M != -1) {
                en8Var.L = true;
                return;
            } else {
                en8Var.p0.q(new ir0(en8Var.w));
                en8Var.B = true;
                return;
            }
        }
        if (i == 182) {
            an8 an8Var = new an8();
            an8Var.b = -9223372036854775807L;
            an8Var.c = -9223372036854775807L;
            en8Var.z = an8Var;
            return;
        }
        if (i == 183 && !en8Var.B) {
            en8Var.g(i);
            en8Var.H = -1;
            en8Var.I = -1L;
            en8Var.J = -1L;
        }
    }

    public void N(int i, String str) throws l0a {
        en8 en8Var = (en8) this.a;
        if (i == 133) {
            en8Var.k(i).h = str;
            return;
        }
        if (i == 134) {
            en8Var.h(i);
            en8Var.A.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                en8Var.x = str.equals("webm");
                return;
            }
            throw l0a.a(null, "DocType " + str + " not supported");
        }
        if (i == 17276) {
            en8Var.k(i).i = str;
            return;
        }
        if (i == 21358) {
            en8Var.h(i);
            en8Var.A.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            en8Var.h(i);
            en8Var.A.c0 = str;
        }
    }

    public synchronized void P() {
        l2e l2eVar = (l2e) this.a;
        ReentrantLock reentrantLock = l2eVar.a;
        reentrantLock.lock();
        try {
            l2eVar.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.s36
    public void a(Object obj) {
        la1 la1Var = (la1) this.a;
        try {
            la1Var.b(obj);
        } catch (Throwable th) {
            la1Var.d(th);
        }
    }

    @Override // defpackage.b36
    public c36 build() {
        return (fy4) this.a;
    }

    @Override // defpackage.or8
    public boolean c(qr8 qr8Var, MenuItem menuItem) {
        bd bdVar = ((ActionMenuView) this.a).R0;
        if (bdVar == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((yea) bdVar).a).Y0.c).iterator();
        while (it.hasNext()) {
            if (((sx5) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.b36
    public b36 d(int i) {
        if (i != 0) {
            return this;
        }
        throw null;
    }

    @Override // defpackage.bc0
    public Object e(fhc fhcVar, Float f, Float f2, a26 a26Var, zqd zqdVar) {
        Object objU = ynb.u(fhcVar, f.floatValue(), g21.a(0.0f, f2.floatValue(), 28), (ph3) this.a, a26Var, zqdVar);
        return objU == bw2.a ? objU : (sz) objU;
    }

    @Override // defpackage.h1b
    public Object get() {
        ff5 ff5Var = (ff5) ((szc) this.a).b;
        nk8.o(ff5Var);
        return ff5Var;
    }

    @Override // defpackage.e85
    public k79 h() {
        throw null;
    }

    @Override // defpackage.s36
    public void i(Throwable th) {
        ((la1) this.a).d(th);
    }

    @Override // defpackage.ye
    public void j(Object obj) {
        Map map = (Map) obj;
        zx5 zx5Var = (zx5) this.a;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        vx5 vx5Var = (vx5) zx5Var.F.pollFirst();
        if (vx5Var == null) {
            b1.l("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = vx5Var.a;
            if (zx5Var.c.G(str) == null) {
                b1.l("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // defpackage.x91
    public Type k() {
        return (Type) this.a;
    }

    @Override // defpackage.x91
    public Object l(fm9 fm9Var) {
        ab2 ab2Var = new ab2(fm9Var);
        fm9Var.x(new vd9(10, ab2Var));
        return ab2Var;
    }

    @Override // defpackage.b36
    public b36 p(h10 h10Var) {
        h10Var.getClass();
        return this;
    }

    @Override // defpackage.b36
    public b36 q(rz3 rz3Var) {
        rz3Var.getClass();
        return this;
    }

    @Override // defpackage.b36
    public b36 u(tt7 tt7Var) {
        tt7Var.getClass();
        return this;
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        return Optional.ofNullable(((cu2) this.a).v((vyb) obj));
    }

    @Override // defpackage.dk9
    public String w() {
        return "attempted to overwrite the existing value '" + this.a + '\'';
    }

    @Override // defpackage.na1
    public Object x(la1 la1Var) {
        o78 o78Var = (o78) this.a;
        ok8.o("The result can only set once!", o78Var.f == null);
        o78Var.f = la1Var;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.b36
    public b36 C() {
        return this;
    }

    @Override // defpackage.b36
    public b36 g() {
        return this;
    }

    @Override // defpackage.b36
    public b36 m() {
        return this;
    }

    @Override // defpackage.b36
    public b36 n() {
        return this;
    }

    @Override // defpackage.b36
    public b36 r() {
        return this;
    }

    @Override // defpackage.b36
    public b36 t() {
        return this;
    }

    @Override // defpackage.b36
    public b36 y() {
        return this;
    }

    @Override // defpackage.b36
    public b36 A(t99 t99Var) {
        return this;
    }

    @Override // defpackage.b36
    public b36 b(List list) {
        return this;
    }

    @Override // defpackage.b36
    public b36 f(nw7 nw7Var) {
        return this;
    }

    @Override // defpackage.b36
    public b36 s(e09 e09Var) {
        return this;
    }

    @Override // defpackage.b36
    public b36 z(bm3 bm3Var) {
        return this;
    }

    public /* synthetic */ mjg(Object obj) {
        this.a = obj;
    }

    public mjg(Context context) {
        String strE;
        l2e l2eVarA = l2e.a(context);
        this.a = l2eVarA;
        l2eVarA.b();
        String strE2 = l2eVarA.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = l2eVarA.e(l2e.f("googleSignInOptions", strE2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.c(strE);
        } catch (JSONException unused) {
        }
    }
}
