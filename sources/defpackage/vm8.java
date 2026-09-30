package defpackage;

import androidx.compose.material3.c;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vm8 {
    public static final pr4 a;

    static {
        new ace(new fk8(3));
        a = new pr4(1, new fk8(4));
    }

    public static final void a(m82 m82Var, s39 s39Var, s5d s5dVar, p9f p9fVar, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(904511636);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(m82Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(s39Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.g(s5dVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(p9fVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(dd2Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            c cVarA = d5c.a(0.0f, 7, 0L, false);
            long j = m82Var.a;
            boolean zF = l46Var.f(j);
            Object objR = l46Var.R();
            if (zF || objR == sf2.a) {
                objR = new hue(j, y72.b(j, 0.4f));
                l46Var.p0(objR);
            }
            mh3.b(new e1b[]{o82.a.a(m82Var), a.a(s39Var), o17.a.a(cVarA), u5d.a.a(s5dVar), iue.a.a((hue) objR), r9f.a.a(p9fVar)}, af1.b0(-1750539308, new fw0(9, p9fVar, dd2Var), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(m82Var, s39Var, s5dVar, p9fVar, dd2Var, i, 8);
        }
    }

    public static final void b(m82 m82Var, s5d s5dVar, p9f p9fVar, dd2 dd2Var, l46 l46Var, int i, int i2) {
        s5d s5dVar2;
        p9f p9fVar2;
        l46Var.h0(-449719819);
        int i3 = (l46Var.g(m82Var) ? 4 : 2) | i | (((i2 & 2) == 0 && l46Var.g(s5dVar)) ? 32 : 16) | (((i2 & 4) == 0 && l46Var.g(p9fVar)) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if ((i & 3072) == 0) {
            i3 |= l46Var.i(dd2Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                if ((i2 & 2) != 0) {
                    s5dVar2 = (s5d) l46Var.k(u5d.a);
                    i3 &= -113;
                } else {
                    s5dVar2 = s5dVar;
                }
                if ((i2 & 4) != 0) {
                    p9fVar2 = (p9f) l46Var.k(r9f.a);
                    i3 &= -897;
                }
                l46Var.s();
                int i4 = i3 & 14;
                int i5 = i3 << 3;
                a(m82Var, (s39) l46Var.k(a), s5dVar2, p9fVar2, dd2Var, l46Var, (i5 & 57344) | i4 | (i5 & 896) | (i5 & 7168));
            } else {
                l46Var.Z();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                s5dVar2 = s5dVar;
            }
            p9fVar2 = p9fVar;
            l46Var.s();
            int i6 = i3 & 14;
            int i7 = i3 << 3;
            a(m82Var, (s39) l46Var.k(a), s5dVar2, p9fVar2, dd2Var, l46Var, (i7 & 57344) | i6 | (i7 & 896) | (i7 & 7168));
        } else {
            l46Var.Z();
            s5dVar2 = s5dVar;
            p9fVar2 = p9fVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(m82Var, s5dVar2, p9fVar2, dd2Var, i, i2, 4);
        }
    }
}
