package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f81 implements ac3 {
    public boolean E0;
    public boolean F0;
    public long G0;
    public long X;
    public long Y;
    public zid Z;
    public final yid a;
    public final ac3 b;
    public final nle c;
    public final ac3 d;
    public final boolean e = false;
    public final boolean f = false;
    public final boolean g = false;
    public Uri v;
    public dc3 w;
    public dc3 x;
    public ac3 y;
    public long z;

    public f81(yid yidVar, ac3 ac3Var, ac3 ac3Var2, e81 e81Var) {
        this.a = yidVar;
        this.b = ac3Var2;
        if (ac3Var != null) {
            this.d = ac3Var;
            this.c = e81Var != null ? new nle(ac3Var, e81Var) : null;
        } else {
            this.d = gea.a;
            this.c = null;
        }
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) {
        yid yidVar = this.a;
        try {
            String string = dc3Var.h;
            long j = dc3Var.f;
            long j2 = dc3Var.g;
            if (string == null) {
                string = dc3Var.a.toString();
            }
            cc3 cc3VarA = dc3Var.a();
            cc3VarA.h = string;
            dc3 dc3VarA = cc3VarA.a();
            this.w = dc3VarA;
            Uri uri = dc3VarA.a;
            byte[] bArr = (byte[]) yidVar.e(string).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.v = uri;
            this.X = j;
            long jMin = -1;
            boolean z = (this.f && this.E0) || (this.g && j2 == -1);
            this.F0 = z;
            if (z) {
                this.Y = -1L;
                jMin = -1;
            } else {
                byte[] bArr2 = (byte[]) yidVar.e(string).b.get("exo_len");
                if (bArr2 != null) {
                    jMin = ByteBuffer.wrap(bArr2).getLong();
                }
                this.Y = jMin;
                if (jMin != jMin) {
                    jMin -= j;
                    this.Y = jMin;
                    if (jMin < 0) {
                        throw new bc3(2008);
                    }
                }
            }
            if (j2 != jMin) {
                jMin = jMin == jMin ? j2 : Math.min(jMin, j2);
                this.Y = jMin;
            }
            if (jMin > 0 || jMin == jMin) {
                n(dc3VarA, false);
            }
            return j2 != jMin ? j2 : this.Y;
        } catch (Throwable th) {
            if (this.y == this.b || (th instanceof w71)) {
                this.E0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        this.w = null;
        this.v = null;
        this.X = 0L;
        try {
            j();
        } catch (Throwable th) {
            if (this.y == this.b || (th instanceof w71)) {
                this.E0 = true;
            }
            throw th;
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.v;
    }

    @Override // defpackage.ac3
    public final Map i() {
        return !(this.y == this.b) ? this.d.i() : Collections.EMPTY_MAP;
    }

    public final void j() {
        yid yidVar = this.a;
        ac3 ac3Var = this.y;
        if (ac3Var == null) {
            return;
        }
        try {
            ac3Var.close();
        } finally {
            this.x = null;
            this.y = null;
            zid zidVar = this.Z;
            if (zidVar != null) {
                yidVar.h(zidVar);
                this.Z = null;
            }
        }
    }

    @Override // defpackage.ac3
    public final void m(lp3 lp3Var) {
        lp3Var.getClass();
        this.b.m(lp3Var);
        this.d.m(lp3Var);
    }

    public final void n(dc3 dc3Var, boolean z) throws InterruptedIOException {
        zid zidVarK;
        dc3 dc3VarA;
        ac3 ac3Var;
        String str = dc3Var.h;
        String str2 = pqf.a;
        if (this.F0) {
            zidVarK = null;
        } else {
            boolean z2 = this.e;
            yid yidVar = this.a;
            long j = this.X;
            if (z2) {
                try {
                    long j2 = this.Y;
                    synchronized (yidVar) {
                        yidVar.c();
                        while (true) {
                            zidVarK = yidVar.k(str, j, j2);
                            if (zidVarK != null) {
                                break;
                            } else {
                                yidVar.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                zidVarK = yidVar.k(str, j, this.Y);
            }
        }
        if (zidVarK == null) {
            ac3Var = this.d;
            cc3 cc3VarA = dc3Var.a();
            cc3VarA.f = this.X;
            cc3VarA.g = this.Y;
            dc3VarA = cc3VarA.a();
        } else if (zidVarK.d) {
            Uri uriFromFile = Uri.fromFile(zidVarK.e);
            long j3 = zidVarK.b;
            long j4 = this.X - j3;
            long jMin = zidVarK.c - j4;
            long j5 = this.Y;
            if (j5 != -1) {
                jMin = Math.min(jMin, j5);
            }
            cc3 cc3VarA2 = dc3Var.a();
            cc3VarA2.a = uriFromFile;
            cc3VarA2.b = j3;
            cc3VarA2.f = j4;
            cc3VarA2.g = jMin;
            dc3VarA = cc3VarA2.a();
            ac3Var = this.b;
        } else {
            long jMin2 = zidVarK.c;
            long j6 = this.Y;
            if (jMin2 == -1) {
                jMin2 = j6;
            } else if (j6 != -1) {
                jMin2 = Math.min(jMin2, j6);
            }
            cc3 cc3VarA3 = dc3Var.a();
            cc3VarA3.f = this.X;
            cc3VarA3.g = jMin2;
            dc3VarA = cc3VarA3.a();
            ac3Var = this.c;
            if (ac3Var == null) {
                ac3Var = this.d;
                this.a.h(zidVarK);
                zidVarK = null;
            }
        }
        this.G0 = (this.F0 || ac3Var != this.d) ? Long.MAX_VALUE : this.X + 102400;
        if (z) {
            pa7.J(this.y == this.d);
            if (ac3Var == this.d) {
                return;
            }
            try {
                j();
            } catch (Throwable th) {
                if (!zidVarK.d) {
                    this.a.h(zidVarK);
                }
                throw th;
            }
        }
        if (zidVarK != null && !zidVarK.d) {
            this.Z = zidVarK;
        }
        this.y = ac3Var;
        this.x = dc3VarA;
        this.z = 0L;
        long jB = ac3Var.b(dc3VarA);
        ja8 ja8Var = new ja8();
        if (dc3VarA.g == -1 && jB != -1) {
            this.Y = jB;
            ja8Var.a(Long.valueOf(this.X + jB), "exo_len");
        }
        if (!(this.y == this.b)) {
            Uri uri = ac3Var.getUri();
            this.v = uri;
            Uri uri2 = dc3Var.a.equals(uri) ? null : this.v;
            if (uri2 == null) {
                ja8Var.b.add("exo_redir");
                ja8Var.a.remove("exo_redir");
            } else {
                ja8Var.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.y == this.c) {
            this.a.b(str, ja8Var);
        }
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        ac3 ac3Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.Y == 0) {
            return -1;
        }
        dc3 dc3Var = this.w;
        dc3Var.getClass();
        dc3 dc3Var2 = this.x;
        dc3Var2.getClass();
        try {
            if (this.X >= this.G0) {
                n(dc3Var, true);
            }
            ac3 ac3Var2 = this.y;
            ac3Var2.getClass();
            int i4 = ac3Var2.read(bArr, i, i2);
            ac3 ac3Var3 = this.y;
            if (i4 != -1) {
                long j2 = i4;
                this.X += j2;
                this.z += j2;
                long j3 = this.Y;
                if (j3 == -1) {
                    return i4;
                }
                this.Y = j3 - j2;
                return i4;
            }
            if (!(ac3Var3 == ac3Var)) {
                j = -1;
                long j4 = dc3Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.z < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = dc3Var.h;
                String str2 = pqf.a;
                this.Y = 0L;
                if (!(ac3Var3 == this.c)) {
                    return i3;
                }
                ja8 ja8Var = new ja8();
                ja8Var.a(Long.valueOf(this.X), "exo_len");
                this.a.b(str, ja8Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.Y;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            j();
            n(dc3Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.y == ac3Var || (th instanceof w71)) {
                this.E0 = true;
            }
            throw th;
        }
    }
}
