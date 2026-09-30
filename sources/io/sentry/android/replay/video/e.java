package io.sentry.android.replay.video;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import com.adjust.sdk.Constants;
import defpackage.eb3;
import defpackage.ho7;
import defpackage.lw7;
import defpackage.tec;
import defpackage.v4e;
import defpackage.z18;
import io.sentry.android.replay.util.i;
import io.sentry.android.replay.util.k;
import io.sentry.q5;
import io.sentry.q6;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public final q6 a;
    public final a b;
    public final MediaCodec c;
    public final lw7 d;
    public final MediaCodec.BufferInfo e;
    public final b f;
    public Surface g;

    public e(q6 q6Var, a aVar) {
        q6Var.getClass();
        this.a = q6Var;
        this.b = aVar;
        c cVar = c.a;
        z18 z18Var = z18.c;
        MediaCodec mediaCodecCreateByCodecName = ((Boolean) eb3.N(z18Var, cVar).getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(aVar.f);
        mediaCodecCreateByCodecName.getClass();
        this.c = mediaCodecCreateByCodecName;
        this.d = eb3.N(z18Var, new d(this));
        this.e = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        absolutePath.getClass();
        this.f = new b(absolutePath, aVar.d);
    }

    public final void a(boolean z) {
        ByteBuffer byteBuffer;
        q6 q6Var = this.a;
        if (q6Var.getSessionReplay().m) {
            q6Var.getLogger().i(q5.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        }
        MediaCodec mediaCodec = this.c;
        if (z) {
            if (q6Var.getSessionReplay().m) {
                q6Var.getLogger().i(q5.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
            }
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        int i = 0;
        do {
            MediaCodec.BufferInfo bufferInfo = this.e;
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer != -1) {
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = mediaCodec.getOutputBuffers();
                } else {
                    b bVar = this.f;
                    if (iDequeueOutputBuffer == -2) {
                        if (bVar.c) {
                            ho7.n("format changed twice");
                            return;
                        }
                        MediaFormat outputFormat = mediaCodec.getOutputFormat();
                        outputFormat.getClass();
                        if (q6Var.getSessionReplay().m) {
                            q6Var.getLogger().i(q5.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                        }
                        MediaMuxer mediaMuxer = bVar.b;
                        bVar.d = mediaMuxer.addTrack(outputFormat);
                        mediaMuxer.start();
                        bVar.c = true;
                    } else if (iDequeueOutputBuffer < 0) {
                        if (q6Var.getSessionReplay().m) {
                            q6Var.getLogger().i(q5.DEBUG, tec.e(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                        }
                        i++;
                    } else {
                        if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                            ho7.n(tec.f(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
                            return;
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            if (q6Var.getSessionReplay().m) {
                                q6Var.getLogger().i(q5.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                            }
                            bufferInfo.size = 0;
                        }
                        if (bufferInfo.size != 0) {
                            if (!bVar.c) {
                                ho7.n("muxer hasn't started");
                                return;
                            }
                            long j = bVar.a;
                            int i2 = bVar.e;
                            bVar.e = i2 + 1;
                            long j2 = j * ((long) i2);
                            bVar.f = j2;
                            bufferInfo.presentationTimeUs = j2;
                            bVar.b.writeSampleData(bVar.d, byteBuffer, bufferInfo);
                            if (q6Var.getSessionReplay().m) {
                                q6Var.getLogger().i(q5.DEBUG, tec.g(bufferInfo.size, " bytes to muxer", new StringBuilder("[Encoder]: sent ")), new Object[0]);
                            }
                        }
                        mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            if (q6Var.getSessionReplay().m) {
                                if (z) {
                                    q6Var.getLogger().i(q5.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                                    return;
                                } else {
                                    q6Var.getLogger().i(q5.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                i = 0;
            } else {
                if (!z) {
                    return;
                }
                i++;
                if (q6Var.getSessionReplay().m) {
                    q6Var.getLogger().i(q5.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            }
        } while (i < 10);
        q6Var.getLogger().i(q5.WARNING, tec.f(i, "[Encoder]: encoder made no progress for ", " iterations, dropping the remaining frames"), new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public final void b(Bitmap bitmap) {
        Surface surface;
        Canvas canvasLockCanvas;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (v4e.F(str, Constants.REFERRER_API_XIAOMI, true) || v4e.F(str, "motorola", true)) {
            surface = this.g;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            i iVar = i.SOC_MANUFACTURER;
            if (k.a(iVar).equalsIgnoreCase("spreadtrum") || k.a(iVar).equalsIgnoreCase("unisoc")) {
                surface = this.g;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = this.g;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.g;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void c() {
        b logger = this.f;
        String str = "Failed to release Surface";
        String str2 = "Failed to release MediaCodec";
        MediaCodec mediaCodec = this.c;
        q6 q6Var = this.a;
        try {
            a(true);
            mediaCodec.stop();
        } catch (RuntimeException e) {
            q6Var.getLogger().d(q5.DEBUG, "Failed to properly release video encoder", e);
        } finally {
            try {
                mediaCodec.release();
            } catch (RuntimeException e2) {
                q6Var.getLogger().d(q5.DEBUG, str2, e2);
            }
            try {
                Surface surface = this.g;
                if (surface != null) {
                    surface.release();
                }
            } catch (RuntimeException e3) {
                q6Var.getLogger().d(q5.DEBUG, str, e3);
            }
            try {
                logger.a();
            } catch (RuntimeException e4) {
                q6Var.getLogger().d(q5.DEBUG, "Failed to release MediaMuxer", e4);
            }
        }
    }
}
