package defpackage;

import ai.askquin.R;
import android.app.Application;
import android.media.MediaPlayer;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class soa extends ewf implements hf8 {
    public static final /* synthetic */ int H0 = 0;
    public final vz9 E0;
    public lyd F0;
    public final coa G0;
    public final vz9 X;
    public MediaPlayer Y;
    public final vz9 Z;
    public final yt6 b;
    public final String c;
    public final gk0 d;
    public final hm9 e;
    public final use f;
    public final vz9 g;
    public final sz9 v;
    public final vz9 w;
    public final vz9 x;
    public final sz9 y;
    public final vz9 z;

    public soa(Application application, yt6 yt6Var, String str) {
        this.b = yt6Var;
        this.c = str;
        this.d = new gk0(application);
        gm9 gm9VarA = ((hm9) be5.a.getValue()).a();
        gm9VarA.a(30L);
        this.e = new hm9(gm9VarA);
        this.f = new use((String) null, 3);
        Boolean bool = Boolean.FALSE;
        this.g = q1c.f(bool);
        this.v = new sz9(0);
        Float fValueOf = Float.valueOf(0.0f);
        this.w = q1c.f(fValueOf);
        this.x = q1c.f(bool);
        this.y = new sz9(0);
        this.z = q1c.f(bool);
        this.X = q1c.f(null);
        this.Z = q1c.f(bool);
        this.E0 = q1c.f(fValueOf);
        this.G0 = new coa(this, 2);
    }

    @Override // defpackage.ewf
    public final void e() {
        h();
        this.d.b();
    }

    public final void f() {
        h();
        this.d.b();
        this.x.setValue(Boolean.FALSE);
        this.y.k(0);
        this.v.k(0);
        this.X.setValue(null);
        k(false);
    }

    public final void g(oyb oybVar) {
        if (oybVar instanceof jyb) {
            f();
            return;
        }
        if ((oybVar instanceof kyb) && (((kyb) oybVar).a instanceof SocketTimeoutException)) {
            k(false);
            jcc.k(0, Integer.valueOf(R.string.voice_timeout));
        } else {
            k(false);
            jcc.k(0, Integer.valueOf(R.string.voice_recognition_failed));
        }
    }

    public final void h() {
        if (m93.m == this.G0) {
            m93.m = null;
        }
        lyd lydVar = this.F0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.F0 = null;
        MediaPlayer mediaPlayer = this.Y;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.Y = null;
        i(false);
        this.E0.setValue(Float.valueOf(0.0f));
    }

    public final void i(boolean z) {
        this.Z.setValue(Boolean.valueOf(z));
    }

    public final void k(boolean z) {
        this.z.setValue(Boolean.valueOf(z));
    }

    public final void l(az1 az1Var) {
        vz9 vz9Var = this.g;
        if (((Boolean) vz9Var.getValue()).booleanValue()) {
            return;
        }
        try {
            this.d.e(new goa(this, 0), new goa(this, 1), new coa(this, 1));
            vz9Var.setValue(Boolean.TRUE);
            this.v.k(0);
            x1f x1fVar = x1f.a;
            x1f.k(p05.a, new xna(az1Var, 2), 2);
        } catch (Exception e) {
            d().c("Failed to start recording", e);
            jcc.k(0, Integer.valueOf(R.string.voice_mic_unavailable));
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    public final void m() {
        byte[] bArrCopyOf;
        File file = this.d.f;
        if (file == null) {
            bArrCopyOf = null;
        } else {
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
                try {
                    long length = file.length();
                    if (length > 2147483647L) {
                        throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
                    }
                    int i = (int) length;
                    bArrCopyOf = new byte[i];
                    int i2 = 0;
                    int i3 = i;
                    while (i3 > 0) {
                        int i4 = fileInputStreamB.read(bArrCopyOf, i2, i3);
                        if (i4 < 0) {
                            break;
                        }
                        i3 -= i4;
                        i2 += i4;
                    }
                    if (i3 > 0) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i2);
                    } else {
                        int i5 = fileInputStreamB.read();
                        if (i5 != -1) {
                            b85 b85Var = new b85(8193);
                            b85Var.write(i5);
                            lmg.Y(fileInputStreamB, b85Var);
                            int size = b85Var.size() + i;
                            if (size < 0) {
                                throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                            }
                            byte[] bArrH = b85Var.h();
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                            qd0.X(i, 0, b85Var.size(), bArrH, bArrCopyOf);
                        }
                    }
                    fileInputStreamB.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(fileInputStreamB, th);
                        throw th2;
                    }
                }
            } else {
                bArrCopyOf = null;
            }
        }
        if (bArrCopyOf == null) {
            jcc.k(0, Integer.valueOf(R.string.voice_empty_content));
            f();
        } else {
            k(true);
            String string = UUID.randomUUID().toString();
            string.getClass();
            ynb.V(hwf.a(this), null, null, new roa(this, string, bArrCopyOf, null), 3);
        }
    }
}
