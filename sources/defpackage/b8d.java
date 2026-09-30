package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.config.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b8d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ mmb $image;
    final /* synthetic */ Picture $picture;
    final /* synthetic */ long $sourceSize;
    final /* synthetic */ long $targetSize;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8d(mmb mmbVar, Context context, Picture picture, long j, long j2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$image = mmbVar;
        this.$context = context;
        this.$picture = picture;
        this.$sourceSize = j;
        this.$targetSize = j2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b8d(this.$image, this.$context, this.$picture, this.$sourceSize, this.$targetSize, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.File[]] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.File] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        mmb mmbVar;
        boolean z;
        ?? r4;
        Object g8dVar;
        mmb mmbVar2;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mmb mmbVar3 = this.$image;
            Context context = this.$context;
            context.getClass();
            Picture picture = this.$picture;
            long j = this.$sourceSize;
            long j2 = this.$targetSize;
            this.L$0 = mmbVar3;
            this.label = 1;
            pr4 pr4Var = d8d.a;
            File file = new File(context.getCacheDir(), "share-renders");
            if (!file.isDirectory() && !file.mkdirs()) {
                qc0.p("Check failed.");
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            ?? ListFiles = file.listFiles();
            if (ListFiles != 0) {
                ArrayList arrayList = new ArrayList();
                int length = ListFiles.length;
                int i2 = 0;
                while (i2 < length) {
                    ?? r13 = ListFiles[i2];
                    String name = r13.getName();
                    name.getClass();
                    mmb mmbVar4 = mmbVar3;
                    if (c5e.C(name, "quin-", false) && ne5.a0(r13).equals("png") && r13.lastModified() < jCurrentTimeMillis) {
                        arrayList.add(r13);
                    }
                    i2++;
                    mmbVar3 = mmbVar4;
                }
                mmbVar = mmbVar3;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            } else {
                mmbVar = mmbVar3;
            }
            File fileCreateTempFile = File.createTempFile("quin-", ".png", file);
            char c = ' ';
            int i3 = (int) (j2 >> 32);
            long j3 = 4294967295L;
            int i4 = (int) (j2 & 4294967295L);
            try {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, Math.min(256, i4), Bitmap.Config.ARGB_8888);
                    bitmapCreateBitmap.getClass();
                    try {
                        try {
                            fileCreateTempFile.getClass();
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a.e(new FileOutputStream(fileCreateTempFile), fileCreateTempFile), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                            try {
                                jad jadVar = new jad(bufferedOutputStream, i3, i4);
                                int i5 = 0;
                                while (i5 < i4) {
                                    try {
                                        try {
                                            tq.v(getContext());
                                            bitmapCreateBitmap.eraseColor(-1);
                                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                                            canvas.translate(0.0f, -i5);
                                            long j4 = j3;
                                            File file2 = fileCreateTempFile;
                                            try {
                                                canvas.scale(i3 / ((int) (j >> c)), i4 / ((int) (j & j4)));
                                                canvas.drawPicture(picture);
                                                int iMin = Math.min(bitmapCreateBitmap.getHeight(), i4 - i5);
                                                jadVar.l(bitmapCreateBitmap, iMin);
                                                i5 += iMin;
                                                fileCreateTempFile = file2;
                                                j3 = j4;
                                                c = ' ';
                                            } catch (Throwable th) {
                                                th = th;
                                                Throwable th2 = th;
                                                try {
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    cgg.t(jadVar, th2);
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        Throwable th6 = th;
                                        try {
                                            throw th6;
                                        } catch (Throwable th7) {
                                            ym8.t(bufferedOutputStream, th6);
                                            throw th7;
                                        }
                                    }
                                }
                                File file3 = fileCreateTempFile;
                                cgg.t(jadVar, null);
                                bufferedOutputStream.close();
                                bitmapCreateBitmap.recycle();
                                tq.v(getContext());
                                try {
                                    g8dVar = new g8d(file3, i3, i4);
                                    bw2 bw2Var = bw2.a;
                                    if (g8dVar == bw2Var) {
                                        return bw2Var;
                                    }
                                    mmbVar2 = mmbVar;
                                } catch (Throwable th8) {
                                    th = th8;
                                    z = true;
                                    r4 = file3;
                                    if (!z) {
                                        r4.delete();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            bitmapCreateBitmap.recycle();
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        bitmapCreateBitmap.recycle();
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    ListFiles = fileCreateTempFile;
                    z = false;
                    r4 = ListFiles;
                    if (!z) {
                        r4.delete();
                    }
                    throw th;
                }
            } catch (Throwable th13) {
                th = th13;
                z = false;
                r4 = ListFiles;
                if (!z) {
                    r4.delete();
                }
                throw th;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmb mmbVar5 = (mmb) this.L$0;
            jzb.q(obj);
            mmbVar2 = mmbVar5;
            g8dVar = obj;
        }
        mmbVar2.element = g8dVar;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
