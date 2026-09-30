package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.image.ImageOutput;
import com.adjust.sdk.sig.r3;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ow6 extends hu0 {
    public final dz0 I0;
    public final tm3 J0;
    public final ArrayDeque K0;
    public boolean L0;
    public boolean M0;
    public nw6 N0;
    public long O0;
    public long P0;
    public int Q0;
    public int R0;
    public rr5 S0;
    public ez0 T0;
    public tm3 U0;
    public ImageOutput V0;
    public a55 W0;
    public Bitmap X0;
    public boolean Y0;
    public ri1 Z0;
    public ri1 a1;
    public int b1;
    public boolean c1;

    public ow6(dz0 dz0Var) {
        super(4);
        this.I0 = dz0Var;
        this.V0 = ImageOutput.a;
        this.J0 = new tm3(0);
        this.N0 = nw6.c;
        this.K0 = new ArrayDeque();
        this.P0 = -9223372036854775807L;
        this.O0 = -9223372036854775807L;
        this.Q0 = 0;
        this.R0 = 1;
    }

    @Override // defpackage.hu0
    public final int D(rr5 rr5Var) {
        return dz0.a(rr5Var);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x015d  */
    public final boolean H(long j) throws g45 {
        boolean z;
        ri1 ri1Var;
        boolean z2;
        int i;
        a55 a55Var;
        int i2;
        int i3;
        rr5 rr5Var;
        g55 g55Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.X0;
        if ((bitmap == null || this.Z0 != null) && (this.R0 != 0 || this.v == 2)) {
            ArrayDeque arrayDeque = this.K0;
            if (bitmap == null) {
                this.T0.getClass();
                cz0 cz0Var = (cz0) this.T0.d();
                if (cz0Var != null) {
                    if (!cz0Var.d(4)) {
                        pa7.F(cz0Var.e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.X0 = cz0Var.e;
                        cz0Var.g();
                        if (this.Y0 && this.X0 != null && this.Z0 != null) {
                            this.S0.getClass();
                            rr5 rr5Var2 = this.S0;
                            int i4 = rr5Var2.R;
                            int i5 = rr5Var2.S;
                            z = ((i4 != 1 && i5 == 1) || i4 == -1 || i5 == -1) ? false : true;
                            ri1Var = this.Z0;
                            if (((Bitmap) ri1Var.c) == null) {
                                if (z) {
                                    int i6 = ri1Var.a;
                                    this.X0.getClass();
                                    int width = this.X0.getWidth();
                                    rr5 rr5Var3 = this.S0;
                                    rr5Var3.getClass();
                                    int i7 = width / rr5Var3.R;
                                    int height = this.X0.getHeight();
                                    rr5 rr5Var4 = this.S0;
                                    rr5Var4.getClass();
                                    int i8 = height / rr5Var4.S;
                                    int i9 = this.S0.R;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.X0, (i6 % i9) * i7, (i6 / i9) * i8, i7, i8);
                                } else {
                                    bitmapCreateBitmap = this.X0;
                                    bitmapCreateBitmap.getClass();
                                }
                                ri1Var.c = bitmapCreateBitmap;
                            }
                            Bitmap bitmap2 = (Bitmap) this.Z0.c;
                            bitmap2.getClass();
                            long j2 = this.Z0.b;
                            long j3 = j2 - j;
                            if (this.v == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.R0;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        r3.l();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j3 < 30000) {
                                a55Var = this.W0;
                                if (a55Var != null) {
                                    long j4 = this.N0.b;
                                    this.S0.getClass();
                                    g55Var = a55Var.a;
                                    if (g55Var.Q0) {
                                        g55Var.g.a(37).b();
                                    }
                                }
                                this.V0.onImageAvailable(j2 - this.N0.b, bitmap2);
                                ri1 ri1Var2 = this.Z0;
                                ri1Var2.getClass();
                                long j5 = ri1Var2.b;
                                this.O0 = j5;
                                while (!arrayDeque.isEmpty() && j5 >= ((nw6) arrayDeque.peek()).a) {
                                    this.N0 = (nw6) arrayDeque.removeFirst();
                                }
                                this.R0 = 3;
                                if (z) {
                                    ri1 ri1Var3 = this.Z0;
                                    ri1Var3.getClass();
                                    i2 = ri1Var3.a;
                                    rr5 rr5Var5 = this.S0;
                                    rr5Var5.getClass();
                                    i3 = rr5Var5.S;
                                    rr5Var = this.S0;
                                    rr5Var.getClass();
                                    if (i2 == (i3 * rr5Var.R) - 1) {
                                        this.X0 = null;
                                    }
                                } else {
                                    this.X0 = null;
                                }
                                this.Z0 = this.a1;
                                this.a1 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.Q0 == 3) {
                            K();
                            this.S0.getClass();
                            J();
                            return false;
                        }
                        cz0Var.g();
                        if (arrayDeque.isEmpty()) {
                            this.M0 = true;
                            return false;
                        }
                    }
                }
            } else if (this.Y0) {
                this.S0.getClass();
                rr5 rr5Var6 = this.S0;
                int i10 = rr5Var6.R;
                int i11 = rr5Var6.S;
                if (i10 != 1) {
                }
                ri1Var = this.Z0;
                if (((Bitmap) ri1Var.c) == null) {
                    if (z) {
                        int i12 = ri1Var.a;
                        this.X0.getClass();
                        int width2 = this.X0.getWidth();
                        rr5 rr5Var7 = this.S0;
                        rr5Var7.getClass();
                        int i13 = width2 / rr5Var7.R;
                        int height2 = this.X0.getHeight();
                        rr5 rr5Var8 = this.S0;
                        rr5Var8.getClass();
                        int i14 = height2 / rr5Var8.S;
                        int i15 = this.S0.R;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.X0, (i12 % i15) * i13, (i12 / i15) * i14, i13, i14);
                    } else {
                        bitmapCreateBitmap = this.X0;
                        bitmapCreateBitmap.getClass();
                    }
                    ri1Var.c = bitmapCreateBitmap;
                }
                Bitmap bitmap3 = (Bitmap) this.Z0.c;
                bitmap3.getClass();
                long j6 = this.Z0.b;
                long j7 = j6 - j;
                if (this.v == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.R0;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            r3.l();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                a55Var = this.W0;
                if (a55Var != null) {
                    long j8 = this.N0.b;
                    this.S0.getClass();
                    g55Var = a55Var.a;
                    if (g55Var.Q0) {
                        g55Var.g.a(37).b();
                    }
                }
                this.V0.onImageAvailable(j6 - this.N0.b, bitmap3);
                ri1 ri1Var4 = this.Z0;
                ri1Var4.getClass();
                long j9 = ri1Var4.b;
                this.O0 = j9;
                while (!arrayDeque.isEmpty()) {
                    this.N0 = (nw6) arrayDeque.removeFirst();
                }
                this.R0 = 3;
                if (z) {
                    ri1 ri1Var5 = this.Z0;
                    ri1Var5.getClass();
                    i2 = ri1Var5.a;
                    rr5 rr5Var9 = this.S0;
                    rr5Var9.getClass();
                    i3 = rr5Var9.S;
                    rr5Var = this.S0;
                    rr5Var.getClass();
                    if (i2 == (i3 * rr5Var.R) - 1) {
                        this.X0 = null;
                    }
                } else {
                    this.X0 = null;
                }
                this.Z0 = this.a1;
                this.a1 = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030 A[PHI: r3
  0x0030: PHI (r3v3 tm3) = (r3v2 tm3), (r3v13 tm3) binds: [B:15:0x0021, B:17:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:85:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0132  */
    /* JADX WARN: Code duplicated, block: B:91:0x013e  */
    public final boolean I(long j) {
        tm3 tm3Var;
        int iY;
        ByteBuffer byteBuffer;
        tm3 tm3Var2;
        boolean z;
        tm3 tm3Var3;
        long j2;
        boolean z2;
        ri1 ri1Var;
        boolean z3;
        rr5 rr5Var;
        boolean z4;
        boolean z5;
        rr5 rr5Var2;
        int i;
        tm3 tm3Var4;
        if (!this.Y0 || this.Z0 == null) {
            fz3 fz3Var = this.c;
            fz3Var.l();
            ez0 ez0Var = this.T0;
            if (ez0Var != null && this.Q0 != 3 && !this.L0) {
                tm3 tm3Var5 = this.U0;
                if (tm3Var5 == null) {
                    tm3Var5 = (tm3) ez0Var.e();
                    this.U0 = tm3Var5;
                    if (tm3Var5 != null) {
                        tm3Var = tm3Var5;
                        if (this.Q0 == 2) {
                            tm3Var.b = 4;
                            ez0 ez0Var2 = this.T0;
                            ez0Var2.getClass();
                            ez0Var2.f(this.U0);
                            this.U0 = null;
                            this.Q0 = 3;
                            return false;
                        }
                        iY = y(fz3Var, tm3Var5, 0);
                        if (iY != -5) {
                            rr5 rr5Var3 = (rr5) fz3Var.c;
                            rr5Var3.getClass();
                            this.S0 = rr5Var3;
                            this.c1 = true;
                            this.Q0 = 2;
                            return true;
                        }
                        if (iY != -4) {
                            this.U0.i();
                            byteBuffer = this.U0.e;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                tm3Var2 = this.U0;
                                tm3Var2.getClass();
                                if (tm3Var2.d(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                tm3 tm3Var6 = this.U0;
                                tm3Var6.getClass();
                                tm3Var6.c = this.S0;
                                ez0 ez0Var3 = this.T0;
                                ez0Var3.getClass();
                                tm3 tm3Var7 = this.U0;
                                tm3Var7.getClass();
                                ez0Var3.f(tm3Var7);
                                this.b1 = 0;
                            }
                            tm3Var3 = this.U0;
                            tm3Var3.getClass();
                            if (tm3Var3.d(4)) {
                                this.Y0 = true;
                            } else {
                                int i2 = this.b1;
                                j2 = tm3Var3.g;
                                ri1 ri1Var2 = new ri1();
                                ri1Var2.a = i2;
                                ri1Var2.b = j2;
                                this.a1 = ri1Var2;
                                this.b1 = i2 + 1;
                                if (this.Y0) {
                                    this.Z0 = this.a1;
                                    this.a1 = null;
                                } else {
                                    if (j2 - 30000 <= j || j > 30000 + j2) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    ri1Var = this.Z0;
                                    if (ri1Var != null || ri1Var.b > j || j >= j2) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    rr5Var = this.S0;
                                    rr5Var.getClass();
                                    if (rr5Var.R != -1 || (i = (rr5Var2 = this.S0).S) == -1 || i2 == (i * rr5Var2.R) - 1) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.Y0 = z5;
                                    if (z3 || z2) {
                                        this.Z0 = this.a1;
                                        this.a1 = null;
                                    }
                                }
                            }
                            tm3Var4 = this.U0;
                            tm3Var4.getClass();
                            if (tm3Var4.d(4)) {
                                this.L0 = true;
                                this.U0 = null;
                                return false;
                            }
                            long j3 = this.P0;
                            tm3 tm3Var8 = this.U0;
                            tm3Var8.getClass();
                            this.P0 = Math.max(j3, tm3Var8.g);
                            if (z) {
                                this.U0 = null;
                            } else {
                                tm3 tm3Var9 = this.U0;
                                tm3Var9.getClass();
                                tm3Var9.e();
                            }
                            return !this.Y0;
                        }
                        if (iY != -3) {
                            r3.l();
                            return false;
                        }
                    }
                } else {
                    tm3Var = tm3Var5;
                    if (this.Q0 == 2) {
                        tm3Var.b = 4;
                        ez0 ez0Var4 = this.T0;
                        ez0Var4.getClass();
                        ez0Var4.f(this.U0);
                        this.U0 = null;
                        this.Q0 = 3;
                        return false;
                    }
                    iY = y(fz3Var, tm3Var5, 0);
                    if (iY != -5) {
                        rr5 rr5Var4 = (rr5) fz3Var.c;
                        rr5Var4.getClass();
                        this.S0 = rr5Var4;
                        this.c1 = true;
                        this.Q0 = 2;
                        return true;
                    }
                    if (iY != -4) {
                        this.U0.i();
                        byteBuffer = this.U0.e;
                        if (byteBuffer != null) {
                            tm3Var2 = this.U0;
                            tm3Var2.getClass();
                            if (tm3Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            tm3Var2 = this.U0;
                            tm3Var2.getClass();
                            if (tm3Var2.d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            tm3 tm3Var10 = this.U0;
                            tm3Var10.getClass();
                            tm3Var10.c = this.S0;
                            ez0 ez0Var5 = this.T0;
                            ez0Var5.getClass();
                            tm3 tm3Var11 = this.U0;
                            tm3Var11.getClass();
                            ez0Var5.f(tm3Var11);
                            this.b1 = 0;
                        }
                        tm3Var3 = this.U0;
                        tm3Var3.getClass();
                        if (tm3Var3.d(4)) {
                            this.Y0 = true;
                        } else {
                            int i3 = this.b1;
                            j2 = tm3Var3.g;
                            ri1 ri1Var3 = new ri1();
                            ri1Var3.a = i3;
                            ri1Var3.b = j2;
                            this.a1 = ri1Var3;
                            this.b1 = i3 + 1;
                            if (this.Y0) {
                                this.Z0 = this.a1;
                                this.a1 = null;
                            } else {
                                if (j2 - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                ri1Var = this.Z0;
                                if (ri1Var != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                rr5Var = this.S0;
                                rr5Var.getClass();
                                if (rr5Var.R != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.Y0 = z5;
                                if (z3) {
                                    this.Z0 = this.a1;
                                    this.a1 = null;
                                } else {
                                    this.Z0 = this.a1;
                                    this.a1 = null;
                                }
                            }
                        }
                        tm3Var4 = this.U0;
                        tm3Var4.getClass();
                        if (tm3Var4.d(4)) {
                            this.L0 = true;
                            this.U0 = null;
                            return false;
                        }
                        long j4 = this.P0;
                        tm3 tm3Var12 = this.U0;
                        tm3Var12.getClass();
                        this.P0 = Math.max(j4, tm3Var12.g);
                        if (z) {
                            this.U0 = null;
                        } else {
                            tm3 tm3Var13 = this.U0;
                            tm3Var13.getClass();
                            tm3Var13.e();
                        }
                        return !this.Y0;
                    }
                    if (iY != -3) {
                        r3.l();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void J() throws g45 {
        if (this.c1) {
            rr5 rr5Var = this.S0;
            rr5Var.getClass();
            int iA = dz0.a(rr5Var);
            if (iA != hu0.f(4, 0, 0, 0) && iA != hu0.f(3, 0, 0, 0)) {
                throw g(new kv6("Provided decoder factory can't create decoder for format."), this.S0, false, 4005);
            }
            ez0 ez0Var = this.T0;
            if (ez0Var != null) {
                ez0Var.a();
            }
            this.T0 = new ez0(this.I0.a);
            this.c1 = false;
        }
    }

    public final void K() {
        this.U0 = null;
        this.Q0 = 0;
        this.P0 = -9223372036854775807L;
        ez0 ez0Var = this.T0;
        if (ez0Var != null) {
            ez0Var.a();
            this.T0 = null;
        }
    }

    @Override // defpackage.hu0, defpackage.vha
    public final void d(int i, Object obj) {
        if (i != 15) {
            if (i != 23) {
                return;
            }
            this.W0 = (a55) obj;
        } else {
            ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
            if (imageOutput == null) {
                imageOutput = ImageOutput.a;
            }
            this.V0 = imageOutput;
        }
    }

    @Override // defpackage.hu0
    public final String k() {
        return "ImageRenderer";
    }

    @Override // defpackage.hu0
    public final boolean m() {
        return this.M0;
    }

    @Override // defpackage.hu0
    public final boolean o() {
        int i = this.R0;
        if (i != 3) {
            return i == 0 && this.Y0;
        }
        return true;
    }

    @Override // defpackage.hu0
    public final void p() {
        this.S0 = null;
        this.N0 = nw6.c;
        this.K0.clear();
        K();
        this.V0.a();
    }

    @Override // defpackage.hu0
    public final void q(boolean z, boolean z2) {
        this.R0 = z2 ? 1 : 0;
    }

    @Override // defpackage.hu0
    public final void r(long j, boolean z, boolean z2) {
        this.R0 = Math.min(this.R0, 1);
        this.M0 = false;
        this.L0 = false;
        this.X0 = null;
        this.Z0 = null;
        this.a1 = null;
        this.Y0 = false;
        this.U0 = null;
        ez0 ez0Var = this.T0;
        if (ez0Var != null) {
            ez0Var.flush();
        }
        this.K0.clear();
    }

    @Override // defpackage.hu0
    public final void s() {
        K();
    }

    @Override // defpackage.hu0
    public final void t() {
        K();
        this.R0 = Math.min(this.R0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(defpackage.rr5[] r5, long r6, long r8, defpackage.zp8 r10) {
        /*
            r4 = this;
            nw6 r5 = r4.N0
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.K0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.P0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.O0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            nw6 r6 = new nw6
            long r0 = r4.P0
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            nw6 r5 = new nw6
            r5.<init>(r0, r8)
            r4.N0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow6.w(rr5[], long, long, zp8):void");
    }

    @Override // defpackage.hu0
    public final void z(long j, long j2) throws g45 {
        if (this.M0) {
            return;
        }
        if (this.S0 == null) {
            fz3 fz3Var = this.c;
            fz3Var.l();
            tm3 tm3Var = this.J0;
            tm3Var.e();
            int iY = y(fz3Var, tm3Var, 2);
            if (iY != -5) {
                if (iY == -4) {
                    pa7.J(tm3Var.d(4));
                    this.L0 = true;
                    this.M0 = true;
                    return;
                }
                return;
            }
            rr5 rr5Var = (rr5) fz3Var.c;
            rr5Var.getClass();
            this.S0 = rr5Var;
            this.c1 = true;
        }
        if (this.T0 == null) {
            J();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (H(j)) {
            }
            while (I(j)) {
            }
            Trace.endSection();
        } catch (kv6 e) {
            throw g(e, null, false, 4003);
        }
    }
}
