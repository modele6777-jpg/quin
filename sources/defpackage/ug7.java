package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ug7 implements l95 {
    public n95 b;
    public int c;
    public int d;
    public int e;
    public q39 g;
    public m95 h;
    public zy1 i;
    public q49 j;
    public final d0a a = new d0a(2);
    public long f = -1;

    @Override // defpackage.l95
    public final void a() {
        q49 q49Var = this.j;
        if (q49Var != null) {
            q49Var.getClass();
        }
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        String strU;
        d0a d0aVar = this.a;
        d0aVar.J(2);
        m95Var.o(d0aVar.a, 0, 2);
        if (d0aVar.G() == 65496) {
            while (true) {
                d0aVar.J(2);
                m95Var.o(d0aVar.a, 0, 2);
                int iG = d0aVar.G();
                this.d = iG;
                if (iG == 65498) {
                    break;
                }
                d0aVar.J(2);
                m95Var.o(d0aVar.a, 0, 2);
                int iG2 = d0aVar.G() - 2;
                if (iG2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    m95Var.f(iG2);
                } else {
                    d0aVar.J(iG2);
                    m95Var.o(d0aVar.a, 0, iG2);
                    if (Objects.equals(d0aVar.u(), "http://ns.adobe.com/xap/1.0/") && (strU = d0aVar.u()) != null) {
                        String[] strArr = qn4.p;
                        for (int i = 0; i < 4; i++) {
                            if (strU.contains(strArr[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            q49 q49Var = this.j;
            q49Var.getClass();
            q49Var.c(j, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        String strU;
        zy1 zy1VarJ;
        yob yobVar;
        int i;
        q39 q39Var;
        long j;
        int i2 = this.c;
        long j2 = -1;
        d0a d0aVar = this.a;
        if (i2 == 0) {
            d0aVar.J(2);
            m95Var.readFully(d0aVar.a, 0, 2);
            int iG = d0aVar.G();
            this.d = iG;
            if (iG == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                    return 0;
                }
                g();
                return 0;
            }
            if ((iG < 65488 || iG > 65497) && iG != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            d0aVar.J(2);
            m95Var.o(d0aVar.a, 0, 2);
            this.e = d0aVar.G() - 2;
            m95Var.l(2);
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    r3.l();
                    return 0;
                }
                if (this.i == null || m95Var != this.h) {
                    this.h = m95Var;
                    this.i = new zy1(m95Var, this.f);
                }
                q49 q49Var = this.j;
                q49Var.getClass();
                int iE = q49Var.e(this.i, d82Var);
                if (iE == 1) {
                    d82Var.b += this.f;
                }
                return iE;
            }
            long position = m95Var.getPosition();
            long j3 = this.f;
            if (position != j3) {
                d82Var.b = j3;
                return 1;
            }
            if (!m95Var.d(d0aVar.a, 0, 1, true)) {
                g();
                return 0;
            }
            m95Var.k();
            if (this.j == null) {
                this.j = new q49(d8e.V, 8);
            }
            zy1 zy1Var = new zy1(m95Var, this.f);
            this.i = zy1Var;
            if (!this.j.b(zy1Var)) {
                g();
                return 0;
            }
            q49 q49Var2 = this.j;
            long j4 = this.f;
            n95 n95Var = this.b;
            n95Var.getClass();
            q49Var2.f(new zy1(j4, n95Var, 5));
            q39 q39Var2 = this.g;
            q39Var2.getClass();
            n95 n95Var2 = this.b;
            n95Var2.getClass();
            k1f k1fVarN = n95Var2.n(UserMetadata.MAX_ATTRIBUTE_SIZE, 4);
            qr5 qr5Var = new qr5();
            qr5Var.n = qv8.l("image/jpeg");
            qr5Var.l = new su8(q39Var2);
            k1fVarN.g(new rr5(qr5Var));
            this.c = 5;
            return 0;
        }
        if (this.d == 65505) {
            d0a d0aVar2 = new d0a(this.e);
            m95Var.readFully(d0aVar2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(d0aVar2.u()) && (strU = d0aVar2.u()) != null) {
                long length = m95Var.getLength();
                if (length == -1) {
                    q39Var = null;
                } else {
                    try {
                        zy1VarJ = qn4.J(strU);
                    } catch (NumberFormatException | l0a | XmlPullParserException unused) {
                        xo1.V("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        zy1VarJ = null;
                    }
                    if (zy1VarJ != null && (i = (yobVar = (yob) zy1VarJ.c).d) >= 2) {
                        int i3 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i3 >= 0) {
                            p39 p39Var = (p39) yobVar.get(i3);
                            String str = p39Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i3 == 0) {
                                length -= p39Var.c;
                                j = 0;
                            } else {
                                j = length - p39Var.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i3 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i3--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            q39Var = null;
                        } else {
                            q39Var = new q39(j5, j6, zy1VarJ.b, j7, j8);
                        }
                    } else {
                        q39Var = null;
                    }
                }
                this.g = q39Var;
                if (q39Var != null) {
                    this.f = q39Var.d;
                }
            }
        } else {
            m95Var.l(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.b = n95Var;
    }

    public final void g() {
        n95 n95Var = this.b;
        n95Var.getClass();
        n95Var.j();
        this.b.q(new ir0(-9223372036854775807L));
        this.c = 6;
    }
}
