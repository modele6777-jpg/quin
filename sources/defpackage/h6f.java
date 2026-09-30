package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h6f extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ mmb $job;
    int label;
    final /* synthetic */ i6f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6f(i6f i6fVar, String str, mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = i6fVar;
        this.$chatId = str;
        this.$job = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h6f(this.this$0, this.$chatId, this.$job, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object obj2;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        jzb.q(obj);
                        g6f g6fVar = new g6f(this.this$0, this.$chatId, null);
                        this.label = 1;
                        obj = rs0.S(3000L, g6fVar, this);
                        if (obj == bw2Var) {
                            return bw2Var;
                        }
                    } else {
                        if (i != 1) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jzb.q(obj);
                    }
                    PauseReadingAudioStatus pauseReadingAudioStatus = (PauseReadingAudioStatus) obj;
                    i6f i6fVar = this.this$0;
                    String str = this.$chatId;
                    int i2 = i6f.f;
                    i6fVar.b(str, pauseReadingAudioStatus);
                    int i3 = pauseReadingAudioStatus == null ? -1 : f6f.a[pauseReadingAudioStatus.ordinal()];
                    if (i3 == -1) {
                        this.this$0.d().g("TTS pause failed or timed out for chatId=" + this.$chatId);
                    } else if (i3 != 1 && i3 != 2 && i3 != 3) {
                        if (i3 != 4) {
                            throw new rf9();
                        }
                        this.this$0.d().g("TTS pause returned an unknown status for chatId=" + this.$chatId);
                    }
                    i6f i6fVar2 = this.this$0;
                    obj2 = i6fVar2.e;
                    String str2 = this.$chatId;
                    mmb mmbVar = this.$job;
                    synchronized (obj2) {
                        Object obj3 = i6fVar2.c.get(str2);
                        Object obj4 = mmbVar.element;
                        if (obj4 == null) {
                            pa7.g0("job");
                            throw null;
                        }
                        if (obj3 == ((dg7) obj4)) {
                            i6fVar2.c.remove(str2);
                        }
                        return wef.a;
                    }
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Exception e2) {
                ynb.h0(e2);
                i6f i6fVar3 = this.this$0;
                String str3 = this.$chatId;
                int i4 = i6f.f;
                i6fVar3.b(str3, null);
                this.this$0.d().h("TTS pause request failed for chatId=" + this.$chatId, e2);
                i6f i6fVar4 = this.this$0;
                obj2 = i6fVar4.e;
                String str4 = this.$chatId;
                mmb mmbVar2 = this.$job;
                synchronized (obj2) {
                    Object obj5 = i6fVar4.c.get(str4);
                    Object obj6 = mmbVar2.element;
                    if (obj6 == null) {
                        pa7.g0("job");
                        throw null;
                    }
                    if (obj5 == ((dg7) obj6)) {
                        i6fVar4.c.remove(str4);
                    }
                }
            }
        } catch (Throwable th) {
            i6f i6fVar5 = this.this$0;
            Object obj7 = i6fVar5.e;
            String str5 = this.$chatId;
            mmb mmbVar3 = this.$job;
            synchronized (obj7) {
                Object obj8 = i6fVar5.c.get(str5);
                Object obj9 = mmbVar3.element;
                if (obj9 == null) {
                    pa7.g0("job");
                    throw null;
                }
                if (obj8 == ((dg7) obj9)) {
                    i6fVar5.c.remove(str5);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h6f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
