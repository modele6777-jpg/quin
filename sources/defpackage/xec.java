package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xec implements guf, zg1 {
    public byte[] X;
    public int w;
    public SurfaceTexture x;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final sxa c = new sxa();
    public final zi0 d = new zi0(5);
    public final p90 e = new p90();
    public final p90 f = new p90();
    public final float[] g = new float[16];
    public final float[] v = new float[16];
    public volatile int y = 0;
    public int z = -1;

    @Override // defpackage.zg1
    public final void a(long j, float[] fArr) {
        ((p90) this.d.d).f(j, fArr);
    }

    @Override // defpackage.zg1
    public final void b() {
        this.e.m();
        zi0 zi0Var = this.d;
        ((p90) zi0Var.d).m();
        zi0Var.a = false;
        this.b.set(true);
    }

    @Override // defpackage.guf
    public final void c(long j, long j2, rr5 rr5Var, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListA;
        this.e.f(j2, Long.valueOf(j));
        byte[] bArr = rr5Var.F;
        int i2 = rr5Var.G;
        byte[] bArr2 = this.X;
        int i3 = this.z;
        this.X = bArr;
        if (i2 == -1) {
            i2 = this.y;
        }
        this.z = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.X)) {
            return;
        }
        byte[] bArr3 = this.X;
        qxa qxaVar = null;
        if (bArr3 != null) {
            int i4 = this.z;
            int i5 = rxa.b;
            d0a d0aVar = new d0a(bArr3);
            try {
                d0aVar.N(4);
                int iM = d0aVar.m();
                d0aVar.M(0);
                if (iM == 1886547818) {
                    d0aVar.N(8);
                    int i6 = d0aVar.b;
                    int i7 = d0aVar.c;
                    while (true) {
                        if (i6 < i7) {
                            int iM2 = d0aVar.m() + i6;
                            if (iM2 > i6 && iM2 <= i7) {
                                int iM3 = d0aVar.m();
                                if (iM3 != 2037673328 && iM3 != 1836279920) {
                                    d0aVar.M(iM2);
                                    i6 = iM2;
                                }
                                d0aVar.L(iM2);
                                arrayListA = rxa.a(d0aVar);
                            }
                        }
                        arrayListA = null;
                    }
                } else {
                    arrayListA = rxa.a(d0aVar);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    pxa pxaVar = (pxa) arrayListA.get(0);
                    qxaVar = new qxa(pxaVar, pxaVar, i4);
                } else if (size == 2) {
                    qxaVar = new qxa((pxa) arrayListA.get(0), (pxa) arrayListA.get(1), i4);
                }
            }
        }
        if (qxaVar == null || !sxa.b(qxaVar)) {
            int i8 = this.z;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < 36; i11 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i11 * f) - f3;
                i = i11 + 1;
                float f5 = (i * f) - f3;
                int i12 = 0;
                while (i12 < 73) {
                    int i13 = i;
                    int i14 = 0;
                    int i15 = 2;
                    while (i14 < i15) {
                        float f6 = radians;
                        float f7 = i12 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i14 == 0 ? f4 : f5;
                        fArr[i9] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i9 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i16 = i9 + 3;
                        float f9 = f;
                        fArr[i9 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i10] = f7 / f8;
                        int i17 = i10 + 2;
                        fArr2[i10 + 1] = ((i11 + i14) * f9) / f6;
                        if ((i12 == 0 && i14 == 0) || (i12 == 72 && i14 == 1)) {
                            System.arraycopy(fArr, i9, fArr, i16, 3);
                            i9 += 6;
                            i15 = 2;
                            System.arraycopy(fArr2, i10, fArr2, i17, 2);
                            i10 += 4;
                        } else {
                            i15 = 2;
                            i9 = i16;
                            i10 = i17;
                        }
                        i14++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i12++;
                    i = i13;
                }
            }
            pxa pxaVar2 = new pxa(new p90(0, 1, fArr, fArr2));
            qxaVar = new qxa(pxaVar2, pxaVar2, i8);
        }
        this.f.f(j2, qxaVar);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            hkg.Z();
            this.c.a();
            hkg.Z();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            hkg.Z();
            int i = iArr[0];
            hkg.X(36197, i);
            this.w = i;
        } catch (jb6 e) {
            xo1.y("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.w);
        this.x = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: wec
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.x;
    }
}
