package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import com.adjust.sdk.sig.r3;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 {
    public static final Object p = new Object();
    public static ScheduledExecutorService q;
    public static int r;
    public final AudioTrack a;
    public final tj0 b;
    public final ssg c;
    public szc d;
    public final dl0 e;
    public final boolean f;
    public final int g;
    public final zk0 h;
    public final f98 i = new f98(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public int n;
    public int o;

    public al0(AudioTrack audioTrack, tj0 tj0Var, ssg ssgVar, ece eceVar) {
        int iQ;
        this.a = audioTrack;
        this.b = tj0Var;
        this.c = ssgVar;
        int i = tj0Var.a;
        boolean zE = pqf.E(i);
        this.f = zE;
        if (zE) {
            iQ = pqf.q(i) * Integer.bitCount(tj0Var.c);
            this.g = iQ;
        } else {
            iQ = -1;
            this.g = -1;
        }
        this.e = new dl0(new mjg(this), eceVar, audioTrack, tj0Var.a, iQ, tj0Var.f);
        if (ssgVar != null) {
            this.d = new szc(audioTrack, ssgVar);
        }
        this.h = c() ? new zk0(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:105:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x0121  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0139  */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:55:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:58:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:63:0x01de  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0234  */
    /* JADX WARN: Code duplicated, block: B:68:0x023d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0242  */
    /* JADX WARN: Code duplicated, block: B:73:0x024f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0253  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:79:0x0259 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x025d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0263 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0265  */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    /* JADX WARN: Code duplicated, block: B:87:0x026e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0275  */
    /* JADX WARN: Code duplicated, block: B:92:0x027e  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0198, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x01f1, please report this as an issue */
    public final long a() {
        ece eceVar;
        AudioTrack audioTrack;
        long j;
        dl0 dl0Var;
        long jB;
        int i;
        long j2;
        String str;
        long j3;
        boolean z;
        float f;
        long jB2;
        tk0 tk0Var;
        tk0 tk0Var2;
        int i2;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        boolean z2;
        AudioTimestamp audioTimestamp2;
        tk0 tk0Var3;
        int i3;
        int i4;
        AudioTimestamp audioTimestamp3;
        long j4;
        long j5;
        long j6;
        tk0 tk0Var4;
        mjg mjgVar;
        long j7;
        long jL;
        long j8;
        long j9;
        Method method;
        long jB3 = b();
        dl0 dl0Var2 = this.e;
        ece eceVar2 = dl0Var2.b;
        int i5 = dl0Var2.e;
        uk0 uk0Var = dl0Var2.h;
        AudioTrack audioTrack2 = dl0Var2.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = dl0Var2.c;
            eceVar2.getClass();
            j = 1000;
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - dl0Var2.l >= 30000) {
                long jL2 = pqf.L(i5, dl0Var2.a());
                if (jL2 == 0) {
                    jB3 = jB3;
                    dl0Var2 = dl0Var2;
                    eceVar = eceVar2;
                    i5 = i5;
                    audioTrack = audioTrack2;
                } else {
                    int i6 = dl0Var2.s;
                    float f2 = dl0Var2.i;
                    if (f2 != 1.0f) {
                        jL2 = Math.round(jL2 / ((double) f2));
                    }
                    jArr[i6] = jL2 - jNanoTime;
                    dl0Var2.s = (dl0Var2.s + 1) % 10;
                    int i7 = dl0Var2.t;
                    if (i7 < 10) {
                        dl0Var2.t = i7 + 1;
                    }
                    dl0Var2.l = jNanoTime;
                    dl0Var2.k = 0L;
                    int i8 = 0;
                    while (true) {
                        int i9 = dl0Var2.t;
                        if (i8 >= i9) {
                            break;
                        }
                        dl0Var2.k = (jArr[i8] / ((long) i9)) + dl0Var2.k;
                        i8++;
                        jArr = jArr;
                    }
                    j2 = dl0Var2.n;
                    if (dl0Var2.g || (method = dl0Var2.m) == null) {
                        str = "AudioTrackAudioOutput";
                        j3 = 500000;
                    } else {
                        j3 = 500000;
                        if (jNanoTime - dl0Var2.o >= 500000) {
                            try {
                                Integer num = (Integer) method.invoke(audioTrack2, null);
                                String str2 = pqf.a;
                                long jIntValue = (((long) num.intValue()) * 1000) - dl0Var2.f;
                                dl0Var2.n = jIntValue;
                                str = "AudioTrackAudioOutput";
                                try {
                                    long jMax = Math.max(jIntValue, 0L);
                                    dl0Var2.n = jMax;
                                    if (jMax > 10000000) {
                                        xo1.V(str, "Ignoring impossibly large audio latency: " + jMax);
                                        dl0Var2.n = 0L;
                                    }
                                } catch (Exception unused) {
                                    dl0Var2.m = null;
                                }
                            } catch (Exception unused2) {
                                str = "AudioTrackAudioOutput";
                            }
                            dl0Var2.o = jNanoTime;
                        } else {
                            str = "AudioTrackAudioOutput";
                        }
                    }
                    if (j2 != dl0Var2.n) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f = dl0Var2.i;
                    jB2 = dl0Var2.b(jNanoTime);
                    tk0Var = uk0Var.a;
                    tk0Var2 = uk0Var.a;
                    eceVar = eceVar2;
                    i2 = uk0Var.b;
                    audioTrack = audioTrack2;
                    if (!z || jNanoTime - uk0Var.g >= uk0Var.f) {
                        uk0Var.g = jNanoTime;
                        AudioTrack audioTrack3 = tk0Var.a;
                        audioTimestamp = tk0Var.b;
                        timestamp = audioTrack3.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            j8 = audioTimestamp.framePosition;
                            j9 = tk0Var.d;
                            if (j9 > j8) {
                                z2 = timestamp;
                                if (tk0Var.f) {
                                    tk0Var.g += j9;
                                    tk0Var.f = false;
                                } else {
                                    tk0Var.c++;
                                }
                            } else {
                                z2 = timestamp;
                            }
                            tk0Var.d = j8;
                            tk0Var.e = j8 + tk0Var.g + (tk0Var.c << 32);
                        } else {
                            z2 = timestamp;
                        }
                        if (z2) {
                            mjgVar = uk0Var.c;
                            j7 = audioTimestamp.nanoTime / 1000;
                            audioTimestamp2 = audioTimestamp;
                            jL = pqf.L(i2, tk0Var2.e) + pqf.v(jNanoTime - (tk0Var2.b.nanoTime / 1000), f);
                            if (Math.abs(j7 - jNanoTime) > 5000000) {
                                long j10 = tk0Var.e;
                                mjgVar.getClass();
                                String str3 = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                                HashSet hashSet = pp8.a;
                                xo1.V(str, str3);
                                uk0Var.a(4);
                            } else {
                                i5 = i5;
                                if (Math.abs(jL - jB2) > 5000000) {
                                    long j11 = tk0Var.e;
                                    mjgVar.getClass();
                                    dl0Var2 = dl0Var2;
                                    tk0Var3 = tk0Var2;
                                    String str4 = "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                                    HashSet hashSet2 = pp8.a;
                                    xo1.V(str, str4);
                                    i3 = 4;
                                    uk0Var.a(4);
                                } else {
                                    dl0Var2 = dl0Var2;
                                    tk0Var3 = tk0Var2;
                                    i3 = 4;
                                    if (uk0Var.d == 4) {
                                        uk0Var.a(0);
                                    }
                                }
                            }
                            i4 = uk0Var.d;
                            if (i4 != 0) {
                                audioTimestamp3 = audioTimestamp2;
                                if (z2) {
                                    j4 = audioTimestamp3.nanoTime;
                                    if (j4 / 1000 >= uk0Var.e) {
                                        uk0Var.h = tk0Var.e;
                                        uk0Var.i = j4 / 1000;
                                        uk0Var.a(1);
                                    }
                                } else if (jNanoTime - uk0Var.e > j3) {
                                    uk0Var.a(3);
                                }
                            } else if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != i3) {
                                            r3.l();
                                            return 0L;
                                        }
                                    } else if (z2) {
                                        uk0Var.a(0);
                                    }
                                } else if (!z2) {
                                    uk0Var.a(0);
                                }
                            } else if (z2) {
                                j5 = tk0Var.e;
                                j6 = uk0Var.h;
                                if (j5 <= j6) {
                                    tk0Var4 = tk0Var3;
                                    if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                        uk0Var.a(2);
                                    } else if (jNanoTime - uk0Var.e > 2000000) {
                                        uk0Var.a(3);
                                    } else {
                                        uk0Var.h = tk0Var.e;
                                        uk0Var.i = audioTimestamp2.nanoTime / 1000;
                                    }
                                } else if (jNanoTime - uk0Var.e > 2000000) {
                                    uk0Var.a(3);
                                } else {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else {
                                uk0Var.a(0);
                            }
                        } else {
                            audioTimestamp2 = audioTimestamp;
                        }
                        tk0Var3 = tk0Var2;
                        i3 = 4;
                        i4 = uk0Var.d;
                        if (i4 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= uk0Var.e) {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = j4 / 1000;
                                    uk0Var.a(1);
                                }
                            } else if (jNanoTime - uk0Var.e > j3) {
                                uk0Var.a(3);
                            }
                        } else if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != i3) {
                                        r3.l();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    uk0Var.a(0);
                                }
                            } else if (!z2) {
                                uk0Var.a(0);
                            }
                        } else if (z2) {
                            j5 = tk0Var.e;
                            j6 = uk0Var.h;
                            if (j5 <= j6) {
                                tk0Var4 = tk0Var3;
                                if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                    uk0Var.a(2);
                                } else if (jNanoTime - uk0Var.e > 2000000) {
                                    uk0Var.a(3);
                                } else {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - uk0Var.e > 2000000) {
                                uk0Var.a(3);
                            } else {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            uk0Var.a(0);
                        }
                    } else {
                        jB3 = jB3;
                        dl0Var2 = dl0Var2;
                        i5 = i5;
                    }
                }
            } else {
                j2 = dl0Var2.n;
                if (dl0Var2.g) {
                    str = "AudioTrackAudioOutput";
                    j3 = 500000;
                } else {
                    str = "AudioTrackAudioOutput";
                    j3 = 500000;
                }
                if (j2 != dl0Var2.n) {
                    z = true;
                } else {
                    z = false;
                }
                f = dl0Var2.i;
                jB2 = dl0Var2.b(jNanoTime);
                tk0Var = uk0Var.a;
                tk0Var2 = uk0Var.a;
                eceVar = eceVar2;
                i2 = uk0Var.b;
                audioTrack = audioTrack2;
                if (z) {
                    uk0Var.g = jNanoTime;
                    AudioTrack audioTrack4 = tk0Var.a;
                    audioTimestamp = tk0Var.b;
                    timestamp = audioTrack4.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j8 = audioTimestamp.framePosition;
                        j9 = tk0Var.d;
                        if (j9 > j8) {
                            z2 = timestamp;
                            if (tk0Var.f) {
                                tk0Var.g += j9;
                                tk0Var.f = false;
                            } else {
                                tk0Var.c++;
                            }
                        } else {
                            z2 = timestamp;
                        }
                        tk0Var.d = j8;
                        tk0Var.e = j8 + tk0Var.g + (tk0Var.c << 32);
                    } else {
                        z2 = timestamp;
                    }
                    if (z2) {
                        mjgVar = uk0Var.c;
                        j7 = audioTimestamp.nanoTime / 1000;
                        audioTimestamp2 = audioTimestamp;
                        jL = pqf.L(i2, tk0Var2.e) + pqf.v(jNanoTime - (tk0Var2.b.nanoTime / 1000), f);
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            long j12 = tk0Var.e;
                            mjgVar.getClass();
                            String str5 = "Spurious audio timestamp (system clock mismatch): " + j12 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                            HashSet hashSet3 = pp8.a;
                            xo1.V(str, str5);
                            uk0Var.a(4);
                        } else {
                            i5 = i5;
                            if (Math.abs(jL - jB2) > 5000000) {
                                long j13 = tk0Var.e;
                                mjgVar.getClass();
                                dl0Var2 = dl0Var2;
                                tk0Var3 = tk0Var2;
                                String str6 = "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                                HashSet hashSet4 = pp8.a;
                                xo1.V(str, str6);
                                i3 = 4;
                                uk0Var.a(4);
                            } else {
                                dl0Var2 = dl0Var2;
                                tk0Var3 = tk0Var2;
                                i3 = 4;
                                if (uk0Var.d == 4) {
                                    uk0Var.a(0);
                                }
                            }
                        }
                        i4 = uk0Var.d;
                        if (i4 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= uk0Var.e) {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = j4 / 1000;
                                    uk0Var.a(1);
                                }
                            } else if (jNanoTime - uk0Var.e > j3) {
                                uk0Var.a(3);
                            }
                        } else if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != i3) {
                                        r3.l();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    uk0Var.a(0);
                                }
                            } else if (!z2) {
                                uk0Var.a(0);
                            }
                        } else if (z2) {
                            j5 = tk0Var.e;
                            j6 = uk0Var.h;
                            if (j5 <= j6) {
                                tk0Var4 = tk0Var3;
                                if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                    uk0Var.a(2);
                                } else if (jNanoTime - uk0Var.e > 2000000) {
                                    uk0Var.a(3);
                                } else {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - uk0Var.e > 2000000) {
                                uk0Var.a(3);
                            } else {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            uk0Var.a(0);
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                    }
                    tk0Var3 = tk0Var2;
                    i3 = 4;
                    i4 = uk0Var.d;
                    if (i4 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        if (z2) {
                            j4 = audioTimestamp3.nanoTime;
                            if (j4 / 1000 >= uk0Var.e) {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = j4 / 1000;
                                uk0Var.a(1);
                            }
                        } else if (jNanoTime - uk0Var.e > j3) {
                            uk0Var.a(3);
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != i3) {
                                    r3.l();
                                    return 0L;
                                }
                            } else if (z2) {
                                uk0Var.a(0);
                            }
                        } else if (!z2) {
                            uk0Var.a(0);
                        }
                    } else if (z2) {
                        j5 = tk0Var.e;
                        j6 = uk0Var.h;
                        if (j5 <= j6) {
                            tk0Var4 = tk0Var3;
                            if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                uk0Var.a(2);
                            } else if (jNanoTime - uk0Var.e > 2000000) {
                                uk0Var.a(3);
                            } else {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (jNanoTime - uk0Var.e > 2000000) {
                            uk0Var.a(3);
                        } else {
                            uk0Var.h = tk0Var.e;
                            uk0Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        uk0Var.a(0);
                    }
                } else {
                    uk0Var.g = jNanoTime;
                    AudioTrack audioTrack5 = tk0Var.a;
                    audioTimestamp = tk0Var.b;
                    timestamp = audioTrack5.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j8 = audioTimestamp.framePosition;
                        j9 = tk0Var.d;
                        if (j9 > j8) {
                            z2 = timestamp;
                            if (tk0Var.f) {
                                tk0Var.g += j9;
                                tk0Var.f = false;
                            } else {
                                tk0Var.c++;
                            }
                        } else {
                            z2 = timestamp;
                        }
                        tk0Var.d = j8;
                        tk0Var.e = j8 + tk0Var.g + (tk0Var.c << 32);
                    } else {
                        z2 = timestamp;
                    }
                    if (z2) {
                        mjgVar = uk0Var.c;
                        j7 = audioTimestamp.nanoTime / 1000;
                        audioTimestamp2 = audioTimestamp;
                        jL = pqf.L(i2, tk0Var2.e) + pqf.v(jNanoTime - (tk0Var2.b.nanoTime / 1000), f);
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            long j14 = tk0Var.e;
                            mjgVar.getClass();
                            String str7 = "Spurious audio timestamp (system clock mismatch): " + j14 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                            HashSet hashSet5 = pp8.a;
                            xo1.V(str, str7);
                            uk0Var.a(4);
                        } else {
                            i5 = i5;
                            if (Math.abs(jL - jB2) > 5000000) {
                                long j15 = tk0Var.e;
                                mjgVar.getClass();
                                dl0Var2 = dl0Var2;
                                tk0Var3 = tk0Var2;
                                String str8 = "Spurious audio timestamp (frame position mismatch): " + j15 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((al0) mjgVar.a).b();
                                HashSet hashSet6 = pp8.a;
                                xo1.V(str, str8);
                                i3 = 4;
                                uk0Var.a(4);
                            } else {
                                dl0Var2 = dl0Var2;
                                tk0Var3 = tk0Var2;
                                i3 = 4;
                                if (uk0Var.d == 4) {
                                    uk0Var.a(0);
                                }
                            }
                        }
                        i4 = uk0Var.d;
                        if (i4 != 0) {
                            audioTimestamp3 = audioTimestamp2;
                            if (z2) {
                                j4 = audioTimestamp3.nanoTime;
                                if (j4 / 1000 >= uk0Var.e) {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = j4 / 1000;
                                    uk0Var.a(1);
                                }
                            } else if (jNanoTime - uk0Var.e > j3) {
                                uk0Var.a(3);
                            }
                        } else if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != i3) {
                                        r3.l();
                                        return 0L;
                                    }
                                } else if (z2) {
                                    uk0Var.a(0);
                                }
                            } else if (!z2) {
                                uk0Var.a(0);
                            }
                        } else if (z2) {
                            j5 = tk0Var.e;
                            j6 = uk0Var.h;
                            if (j5 <= j6) {
                                tk0Var4 = tk0Var3;
                                if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                    uk0Var.a(2);
                                } else if (jNanoTime - uk0Var.e > 2000000) {
                                    uk0Var.a(3);
                                } else {
                                    uk0Var.h = tk0Var.e;
                                    uk0Var.i = audioTimestamp2.nanoTime / 1000;
                                }
                            } else if (jNanoTime - uk0Var.e > 2000000) {
                                uk0Var.a(3);
                            } else {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else {
                            uk0Var.a(0);
                        }
                    } else {
                        audioTimestamp2 = audioTimestamp;
                    }
                    tk0Var3 = tk0Var2;
                    i3 = 4;
                    i4 = uk0Var.d;
                    if (i4 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        if (z2) {
                            j4 = audioTimestamp3.nanoTime;
                            if (j4 / 1000 >= uk0Var.e) {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = j4 / 1000;
                                uk0Var.a(1);
                            }
                        } else if (jNanoTime - uk0Var.e > j3) {
                            uk0Var.a(3);
                        }
                    } else if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != i3) {
                                    r3.l();
                                    return 0L;
                                }
                            } else if (z2) {
                                uk0Var.a(0);
                            }
                        } else if (!z2) {
                            uk0Var.a(0);
                        }
                    } else if (z2) {
                        j5 = tk0Var.e;
                        j6 = uk0Var.h;
                        if (j5 <= j6) {
                            tk0Var4 = tk0Var3;
                            if (Math.abs((pqf.v(jNanoTime - (tk0Var4.b.nanoTime / 1000), f) + pqf.L(i2, tk0Var4.e)) - (pqf.v(jNanoTime - uk0Var.i, f) + pqf.L(i2, j6))) < 1000) {
                                uk0Var.a(2);
                            } else if (jNanoTime - uk0Var.e > 2000000) {
                                uk0Var.a(3);
                            } else {
                                uk0Var.h = tk0Var.e;
                                uk0Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (jNanoTime - uk0Var.e > 2000000) {
                            uk0Var.a(3);
                        } else {
                            uk0Var.h = tk0Var.e;
                            uk0Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        uk0Var.a(0);
                    }
                }
            }
        } else {
            jB3 = jB3;
            dl0Var2 = dl0Var2;
            eceVar = eceVar2;
            i5 = i5;
            audioTrack = audioTrack2;
            j = 1000;
        }
        eceVar.getClass();
        long jNanoTime2 = System.nanoTime() / j;
        boolean z3 = uk0Var.d == 2;
        if (z3) {
            dl0Var = dl0Var2;
            float f3 = dl0Var.i;
            tk0 tk0Var5 = uk0Var.a;
            jB = pqf.v(jNanoTime2 - (tk0Var5.b.nanoTime / j), f3) + pqf.L(uk0Var.b, tk0Var5.e);
        } else {
            dl0Var = dl0Var2;
            jB = dl0Var.b(jNanoTime2);
        }
        long jI = jB;
        long jL3 = pqf.L(i5, jB3);
        if (jI >= jL3) {
            dl0Var.e();
            uk0Var.a(0);
            return jL3;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z3 || ((i = uk0Var.d) != 0 && i != 1)) {
                dl0Var.d(jI);
            }
            long j16 = dl0Var.z;
            if (j16 != -9223372036854775807L) {
                long j17 = jI - dl0Var.y;
                long jV = pqf.v(jNanoTime2 - j16, dl0Var.i);
                long j18 = dl0Var.y + jV;
                long jAbs = Math.abs(j18 - jI);
                if (j17 != 0 && jAbs < 1000000) {
                    long j19 = (jV * 10) / 100;
                    jI = pqf.i(jI, j18 - j19, j18 + j19);
                }
            }
            dl0Var.z = jNanoTime2;
            dl0Var.y = jI;
        } else if (playState == 1) {
            dl0Var.d(jI);
        }
        return jI;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = pqf.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        dl0 dl0Var = this.e;
        dl0Var.A = true;
        dl0Var.h.a.f = true;
    }

    public final void f(uha uhaVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdA = uhaVar.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.a.setLogSessionId(logSessionIdA);
    }

    public final boolean g(int i, long j, ByteBuffer byteBuffer) throws nj0 {
        int iWrite;
        boolean z;
        ssg ssgVar;
        cl0 cl0Var;
        ej0 ej0Var;
        tj0 tj0Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.n == 0) {
            this.n = jp3.i(tj0Var.a, byteBuffer);
        }
        f98 f98Var = this.i;
        f98Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = f98Var.a;
        AudioTrack audioTrack = this.a;
        if (threadCurrentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.o;
            this.o = underrunCount;
            if (z3) {
                f98Var.e(-1, new qc0(3));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (tj0Var.d) {
            if (j == Long.MIN_VALUE) {
                j = this.m;
            } else {
                this.m = j;
            }
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1, j * 1000);
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.k += (long) iWrite;
                return z;
            }
            if (z) {
                this.l = (((long) this.n) * ((long) i)) + this.l;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (ssgVar = this.c) != null && (ej0Var = (cl0Var = (cl0) ssgVar.b).h) != null) {
            bj0 bj0Var = bj0.f;
            cl0Var.g = bj0Var;
            ej0Var.b(bj0Var);
        }
        throw new nj0(iWrite, z);
    }
}
