package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f17 implements qsd, jh6, wdh {
    public static final f17 c;
    public static final f17 d;
    public final /* synthetic */ int a;
    public boolean b;

    static {
        int i = 0;
        c = new f17(true, i);
        d = new f17(false, i);
    }

    public f17(fl9 fl9Var, el9 el9Var) throws dl9 {
        this.a = 1;
        int i = el9Var.a;
        ByteBuffer byteBuffer = el9Var.b;
        pa7.A(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zu1 zu1Var = new zu1(bArr, iMin);
        if (fl9Var.a) {
            throw new dl9();
        }
        if (zu1Var.f()) {
            this.b = false;
            return;
        }
        int iG = zu1Var.g(2);
        boolean zF = zu1Var.f();
        if (fl9Var.b) {
            throw new dl9();
        }
        if (!zF) {
            this.b = true;
            return;
        }
        boolean zF2 = (iG == 3 || iG == 0) ? true : zu1Var.f();
        zu1Var.n();
        if (!fl9Var.d) {
            throw new dl9();
        }
        if (zu1Var.f()) {
            if (!fl9Var.e) {
                throw new dl9();
            }
            zu1Var.n();
        }
        if (fl9Var.c) {
            throw new dl9();
        }
        if (iG != 3) {
            zu1Var.n();
        }
        zu1Var.o(fl9Var.f);
        if (iG != 2 && iG != 0 && !zF2) {
            zu1Var.o(3);
        }
        this.b = ((iG == 3 || iG == 0) ? 255 : zu1Var.g(8)) != 0;
    }

    public void a(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
    }

    @Override // defpackage.jh6
    public boolean b(ykd ykdVar) {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wdh
    public /* bridge */ /* synthetic */ Object c(vdh vdhVar) {
        eah eahVarA;
        InputStream inputStreamO = drb.o(vdhVar);
        try {
            int i = 4096;
            if (this.b) {
                if (inputStreamO instanceof eeh) {
                    long length = ((eeh) inputStreamO).b().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                eahVarA = eah.a(amg.h(inputStreamO, i), true);
            } else {
                eahVarA = eah.a(amg.h(inputStreamO, 4096), false);
            }
            ym8.t(inputStreamO, null);
            return eahVarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(inputStreamO, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.jh6
    public boolean h() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ub3.m(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f17(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public f17(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = false;
                break;
            default:
                this.b = q74.a.b(SurfaceOrderQuirk.class) != null;
                break;
        }
    }

    public f17(Context context, Looper looper) {
        this.a = 7;
        new uzd(11, context.getApplicationContext());
        new jce(new Handler(looper, null));
        new jce(new Handler(Looper.getMainLooper(), null));
    }

    public /* synthetic */ f17(int i, boolean z) {
        this.a = i;
    }
}
