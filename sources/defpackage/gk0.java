package defpackage;

import android.content.Context;
import android.media.AudioRecord;
import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gk0 implements hf8 {
    public static final /* synthetic */ int z = 0;
    public final Context a;
    public int c;
    public AudioRecord e;
    public File f;
    public lyd g;
    public lyd v;
    public goa w;
    public goa x;
    public coa y;
    public bk0 b = bk0.a;
    public final ArrayList d = new ArrayList();

    public gk0(Context context) {
        this.a = context;
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) (i & 255), 0};
    }

    public static void h(FileOutputStream fileOutputStream) throws IOException {
        Charset charset = ox1.a;
        byte[] bytes = "RIFF".getBytes(charset);
        bytes.getClass();
        fileOutputStream.write(bytes);
        fileOutputStream.write(a(36));
        byte[] bytes2 = "WAVE".getBytes(charset);
        bytes2.getClass();
        fileOutputStream.write(bytes2);
        byte[] bytes3 = "fmt ".getBytes(charset);
        bytes3.getClass();
        fileOutputStream.write(bytes3);
        fileOutputStream.write(a(16));
        fileOutputStream.write(c(1));
        fileOutputStream.write(c(1));
        fileOutputStream.write(a(16000));
        fileOutputStream.write(a(32000));
        fileOutputStream.write(c(2));
        fileOutputStream.write(c(16));
        byte[] bytes4 = "data".getBytes(charset);
        bytes4.getClass();
        fileOutputStream.write(bytes4);
        fileOutputStream.write(a(0));
    }

    public final void b() {
        if (this.b == bk0.b) {
            f();
        }
        File file = this.f;
        if (file != null) {
            file.delete();
        }
        this.f = null;
        this.c = 0;
        this.d.clear();
        this.b = bk0.a;
    }

    public final void e(goa goaVar, goa goaVar2, coa coaVar) throws Exception {
        bk0 bk0Var = this.b;
        bk0 bk0Var2 = bk0.b;
        if (bk0Var == bk0Var2) {
            return;
        }
        this.w = goaVar;
        this.x = goaVar2;
        this.y = coaVar;
        this.c = 0;
        this.d.clear();
        File file = new File(this.a.getCacheDir(), kv2.m("voice_recording_", ".wav", System.currentTimeMillis()));
        this.f = file;
        try {
            int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
            int i = minBufferSize < 4096 ? 4096 : minBufferSize;
            AudioRecord audioRecord = new AudioRecord(1, 16000, 16, 2, i);
            if (audioRecord.getState() != 1) {
                audioRecord.release();
                throw new IllegalStateException("AudioRecord initialization failed");
            }
            this.e = audioRecord;
            audioRecord.startRecording();
            this.b = bk0Var2;
            js3 js3Var = ga4.a;
            this.g = ynb.V(jgb.k(hr3.c), null, null, new ck0(this, audioRecord, file, i, null), 3);
            this.v = ynb.V(jgb.k(mk8.a), null, null, new dk0(this, null), 3);
            d().e("Recording started (WAV): " + file.getAbsolutePath());
        } catch (Exception e) {
            d().c("Failed to start recording", e);
            lyd lydVar = this.v;
            if (lydVar != null) {
                lydVar.h(null);
            }
            this.v = null;
            lyd lydVar2 = this.g;
            if (lydVar2 != null) {
                lydVar2.h(null);
            }
            this.g = null;
            try {
                AudioRecord audioRecord2 = this.e;
                if (audioRecord2 != null) {
                    audioRecord2.release();
                }
            } catch (Exception unused) {
            }
            this.e = null;
            File file2 = this.f;
            if (file2 != null) {
                file2.delete();
            }
            this.f = null;
            this.b = bk0.a;
            this.c = 0;
            throw e;
        }
    }

    public final void f() {
        if (this.b != bk0.b) {
            return;
        }
        this.b = bk0.c;
        lyd lydVar = this.v;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.v = null;
        try {
            AudioRecord audioRecord = this.e;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception e) {
            d().c("Error stopping recorder", e);
        }
        AudioRecord audioRecord2 = this.e;
        this.e = null;
        lyd lydVar2 = this.g;
        if (lydVar2 != null) {
            lydVar2.h(null);
        }
        lyd lydVar3 = this.g;
        if (lydVar3 != null) {
            lydVar3.E(new c1(19, audioRecord2));
        }
        this.g = null;
        File file = this.f;
        if (file != null) {
            try {
                int length = (int) file.length();
                int i = length - 44;
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    randomAccessFile.seek(4L);
                    randomAccessFile.write(a(length - 8));
                    randomAccessFile.seek(40L);
                    randomAccessFile.write(a(i));
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(randomAccessFile, th);
                        throw th2;
                    }
                }
            } catch (Exception e2) {
                d().c("Failed to update WAV header", e2);
            }
        }
        d().e("Recording stopped, duration: " + this.c + "s");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object g(AudioRecord audioRecord, File file, int i, zn2 zn2Var) {
        ek0 ek0Var;
        kmb kmbVar;
        Closeable closeable;
        short[] sArr;
        byte[] bArr;
        FileOutputStream fileOutputStream;
        AudioRecord audioRecord2;
        Throwable th;
        int i2 = i;
        if (zn2Var instanceof ek0) {
            ek0Var = (ek0) zn2Var;
            int i3 = ek0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ek0Var.label = i3 - Integer.MIN_VALUE;
            } else {
                ek0Var = new ek0(this, zn2Var);
            }
        } else {
            ek0Var = new ek0(this, zn2Var);
        }
        Object obj = ek0Var.result;
        int i4 = ek0Var.label;
        if (i4 == 0) {
            jzb.q(obj);
            short[] sArr2 = new short[i2 / 2];
            byte[] bArr2 = new byte[i2];
            kmbVar = new kmb();
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file), file);
            try {
                h(fileOutputStreamE);
                sArr = sArr2;
                bArr = bArr2;
                fileOutputStream = fileOutputStreamE;
                closeable = fileOutputStream;
                audioRecord2 = audioRecord;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStreamE;
                th = th;
                throw th;
            }
        } else {
            if (i4 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = ek0Var.I$0;
            FileOutputStream fileOutputStream2 = (FileOutputStream) ek0Var.L$6;
            closeable = (Closeable) ek0Var.L$5;
            kmbVar = (kmb) ek0Var.L$4;
            bArr = (byte[]) ek0Var.L$3;
            sArr = (short[]) ek0Var.L$2;
            AudioRecord audioRecord3 = (AudioRecord) ek0Var.L$0;
            try {
                jzb.q(obj);
                fileOutputStream = fileOutputStream2;
                i2 = i5;
                audioRecord2 = audioRecord3;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                try {
                    throw th;
                } catch (Throwable th4) {
                    ym8.t(closeable, th);
                    throw th4;
                }
            }
        }
        while (this.b == bk0.b) {
            int i6 = audioRecord2.read(sArr, 0, sArr.length);
            if (i6 > 0) {
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    short s = sArr[i8];
                    int i9 = i8 * 2;
                    bArr[i9] = (byte) (s & 255);
                    bArr[i9 + 1] = (byte) ((s >> 8) & 255);
                    int iAbs = Math.abs((int) s);
                    if (iAbs > i7) {
                        i7 = iAbs;
                    }
                }
                fileOutputStream.write(bArr, 0, i6 * 2);
                float fN = mh3.n(i7 / 32767.0f, 0.0f, 1.0f);
                js3 js3Var = ga4.a;
                wg6 wg6Var = mk8.a;
                fk0 fk0Var = new fk0(kmbVar, this, fN, null);
                ek0Var.L$0 = audioRecord2;
                ek0Var.L$1 = null;
                ek0Var.L$2 = sArr;
                ek0Var.L$3 = bArr;
                ek0Var.L$4 = kmbVar;
                ek0Var.L$5 = closeable;
                ek0Var.L$6 = fileOutputStream;
                ek0Var.I$0 = i2;
                ek0Var.I$1 = i6;
                ek0Var.I$2 = i7;
                ek0Var.F$0 = fN;
                ek0Var.label = 1;
                Object objP0 = ynb.p0(wg6Var, fk0Var, ek0Var);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            }
        }
        ym8.t(closeable, null);
        return wef.a;
    }
}
