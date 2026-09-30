package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.ClaimReadingsRequest;
import tech.chatmind.api.ClaimReadingsResponse;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.DecisionCheckRequest;
import tech.chatmind.api.DecisionCheckResponse;
import tech.chatmind.api.DeleteReadingResponse;
import tech.chatmind.api.LegacyImportRequest;
import tech.chatmind.api.LegacyImportResponse;
import tech.chatmind.api.PauseReadingAudioResponse;
import tech.chatmind.api.PauseReadingAudioStatus;
import tech.chatmind.api.ReadingListResponse;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.RecommendQuestionsResponse;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.UserSelectedSpread;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uke implements yt6 {
    public final xie a;
    public final wie b;
    public final ije c;
    public final m8b d;

    public uke(xie xieVar, wie wieVar, ije ijeVar) {
        this.a = xieVar;
        this.b = wieVar;
        this.c = ijeVar;
        hf8.Q.getClass();
        this.d = ef8.a("TarotReadingRequester");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(List list, zn2 zn2Var) throws tu4 {
        rje rjeVar;
        if (zn2Var instanceof rje) {
            rjeVar = (rje) zn2Var;
            int i = rjeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rjeVar.label = i - Integer.MIN_VALUE;
            } else {
                rjeVar = new rje(this, zn2Var);
            }
        } else {
            rjeVar = new rje(this, zn2Var);
        }
        Object objC = rjeVar.result;
        int i2 = rjeVar.label;
        if (i2 == 0) {
            jzb.q(objC);
            ClaimReadingsRequest claimReadingsRequest = new ClaimReadingsRequest(list);
            rjeVar.L$0 = null;
            rjeVar.label = 1;
            objC = this.a.c(claimReadingsRequest, rjeVar);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objC);
        }
        ClaimReadingsResponse claimReadingsResponse = (ClaimReadingsResponse) ((ServerResponse) objC).getData();
        if (claimReadingsResponse != null) {
            return claimReadingsResponse;
        }
        throw new tu4("claimReadings data is null");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, zn2 zn2Var) {
        yje yjeVar;
        if (zn2Var instanceof yje) {
            yjeVar = (yje) zn2Var;
            int i = yjeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjeVar.label = i - Integer.MIN_VALUE;
            } else {
                yjeVar = new yje(this, zn2Var);
            }
        } else {
            yjeVar = new yje(this, zn2Var);
        }
        Object objA = yjeVar.result;
        int i2 = yjeVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            yjeVar.L$0 = null;
            yjeVar.L$1 = null;
            yjeVar.label = 1;
            objA = this.c.a(str, str2, yjeVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        return ((vyb) objA).b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(String str, zn2 zn2Var) {
        zje zjeVar;
        if (zn2Var instanceof zje) {
            zjeVar = (zje) zn2Var;
            int i = zjeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjeVar.label = i - Integer.MIN_VALUE;
            } else {
                zjeVar = new zje(this, zn2Var);
            }
        } else {
            zjeVar = new zje(this, zn2Var);
        }
        Object objA = zjeVar.result;
        int i2 = zjeVar.label;
        boolean zIsDecision = false;
        m8b m8bVar = this.d;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                wie wieVar = this.b;
                DecisionCheckRequest decisionCheckRequest = new DecisionCheckRequest(str);
                zjeVar.L$0 = null;
                zjeVar.label = 1;
                objA = wieVar.a(decisionCheckRequest, zjeVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objA);
            }
            ServerResponse serverResponse = (ServerResponse) objA;
            if (serverResponse.getSuccess()) {
                zIsDecision = ((DecisionCheckResponse) serverResponse.getData()).isDecision();
            } else {
                m8bVar.g("decisionCheck failed: errorCode=" + serverResponse.getErrorCode() + ", errorMessage=" + serverResponse.getErrorMessage());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m8bVar.c("decisionCheck request failed", e2);
        }
        return Boolean.valueOf(zIsDecision);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, zn2 zn2Var) throws tu4 {
        ake akeVar;
        if (zn2Var instanceof ake) {
            akeVar = (ake) zn2Var;
            int i = akeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                akeVar.label = i - Integer.MIN_VALUE;
            } else {
                akeVar = new ake(this, zn2Var);
            }
        } else {
            akeVar = new ake(this, zn2Var);
        }
        Object objI = akeVar.result;
        int i2 = akeVar.label;
        if (i2 == 0) {
            jzb.q(objI);
            akeVar.L$0 = null;
            akeVar.label = 1;
            objI = this.a.i(str, akeVar);
            bw2 bw2Var = bw2.a;
            if (objI == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objI);
        }
        DeleteReadingResponse deleteReadingResponse = (DeleteReadingResponse) ((ServerResponse) objI).getData();
        if (deleteReadingResponse != null) {
            return deleteReadingResponse;
        }
        throw new tu4("deleteReading data is null");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ArrayList arrayList, zn2 zn2Var) throws Throwable {
        bke bkeVar;
        if (zn2Var instanceof bke) {
            bkeVar = (bke) zn2Var;
            int i = bkeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkeVar.label = i - Integer.MIN_VALUE;
            } else {
                bkeVar = new bke(this, zn2Var);
            }
        } else {
            bkeVar = new bke(this, zn2Var);
        }
        Object objK = bkeVar.result;
        int i2 = bkeVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objK);
                xie xieVar = this.a;
                LegacyImportRequest legacyImportRequest = new LegacyImportRequest(arrayList);
                bkeVar.L$0 = null;
                bkeVar.label = 1;
                objK = xieVar.k(legacyImportRequest, bkeVar);
                bw2 bw2Var = bw2.a;
                if (objK == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objK);
            }
            LegacyImportResponse legacyImportResponse = (LegacyImportResponse) ((ServerResponse) objK).getData();
            if (legacyImportResponse != null) {
                return legacyImportResponse;
            }
            throw new tu4("legacyImport data is null");
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw nzc.b(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum f(String str, zn2 zn2Var) {
        cke ckeVar;
        if (zn2Var instanceof cke) {
            ckeVar = (cke) zn2Var;
            int i = ckeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ckeVar.label = i - Integer.MIN_VALUE;
            } else {
                ckeVar = new cke(this, zn2Var);
            }
        } else {
            ckeVar = new cke(this, zn2Var);
        }
        Object objL = ckeVar.result;
        int i2 = ckeVar.label;
        if (i2 == 0) {
            jzb.q(objL);
            ckeVar.L$0 = null;
            ckeVar.label = 1;
            objL = this.a.l(str, ckeVar);
            bw2 bw2Var = bw2.a;
            if (objL == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objL);
        }
        ServerResponse serverResponse = (ServerResponse) objL;
        boolean success = serverResponse.getSuccess();
        m8b m8bVar = this.d;
        if (success) {
            PauseReadingAudioStatus status = ((PauseReadingAudioResponse) serverResponse.getData()).getStatus();
            if (status == PauseReadingAudioStatus.UNKNOWN) {
                m8bVar.g("pauseReadingAudio returned an unknown or missing status");
            }
            return status;
        }
        m8bVar.g("pauseReadingAudio failed: errorCode=" + serverResponse.getErrorCode() + ", errorMessage=" + serverResponse.getErrorMessage());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, zn2 zn2Var) {
        dke dkeVar;
        if (zn2Var instanceof dke) {
            dkeVar = (dke) zn2Var;
            int i = dkeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkeVar.label = i - Integer.MIN_VALUE;
            } else {
                dkeVar = new dke(this, zn2Var);
            }
        } else {
            dkeVar = new dke(this, zn2Var);
        }
        Object objE = dkeVar.result;
        int i2 = dkeVar.label;
        if (i2 == 0) {
            jzb.q(objE);
            dkeVar.L$0 = str;
            dkeVar.label = 1;
            objE = this.a.e(str, dkeVar);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) dkeVar.L$0;
            jzb.q(objE);
        }
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) ((ServerResponse) objE).getData();
        if (tarotReadingHistory == null) {
            throw new tu4("queryReading data is null");
        }
        if (v4e.Q(tarotReadingHistory.getChatId()) || !c5e.v(v4e.o0(tarotReadingHistory.getChatId()).toString(), v4e.o0(str).toString(), true)) {
            throw new tu4("queryReading chatId does not match the requested reading");
        }
        return tarotReadingHistory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, String str2, Integer num, zn2 zn2Var) {
        eke ekeVar;
        if (zn2Var instanceof eke) {
            ekeVar = (eke) zn2Var;
            int i = ekeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekeVar.label = i - Integer.MIN_VALUE;
            } else {
                ekeVar = new eke(this, zn2Var);
            }
        } else {
            ekeVar = new eke(this, zn2Var);
        }
        Object objJ = ekeVar.result;
        int i2 = ekeVar.label;
        if (i2 == 0) {
            jzb.q(objJ);
            ekeVar.L$0 = null;
            ekeVar.L$1 = null;
            ekeVar.L$2 = null;
            ekeVar.label = 1;
            objJ = this.a.j(str, num, str2, ekeVar);
            bw2 bw2Var = bw2.a;
            if (objJ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objJ);
        }
        return ((ServerResponse) objJ).getData();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, Integer num, zn2 zn2Var) throws tu4 {
        fke fkeVar;
        if (zn2Var instanceof fke) {
            fkeVar = (fke) zn2Var;
            int i = fkeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkeVar.label = i - Integer.MIN_VALUE;
            } else {
                fkeVar = new fke(this, zn2Var);
            }
        } else {
            fkeVar = new fke(this, zn2Var);
        }
        Object objH = fkeVar.result;
        int i2 = fkeVar.label;
        if (i2 == 0) {
            jzb.q(objH);
            Integer num2 = new Integer(num != null ? num.intValue() : 100);
            fkeVar.L$0 = null;
            fkeVar.L$1 = null;
            fkeVar.label = 1;
            objH = this.a.h(num2, str, fkeVar);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objH);
        }
        ReadingListResponse readingListResponse = (ReadingListResponse) ((ServerResponse) objH).getData();
        if (readingListResponse != null) {
            return readingListResponse;
        }
        throw new tu4("queryReadings data is null");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, zn2 zn2Var) {
        gke gkeVar;
        if (zn2Var instanceof gke) {
            gkeVar = (gke) zn2Var;
            int i = gkeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkeVar.label = i - Integer.MIN_VALUE;
            } else {
                gkeVar = new gke(this, zn2Var);
            }
        } else {
            gkeVar = new gke(this, zn2Var);
        }
        Object objH = gkeVar.result;
        int i2 = gkeVar.label;
        if (i2 == 0) {
            jzb.q(objH);
            gkeVar.L$0 = null;
            gkeVar.label = 1;
            objH = this.b.h(str, gkeVar);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objH);
        }
        ServerResponse serverResponse = (ServerResponse) objH;
        List<RecommendQuestion> questions = serverResponse.getSuccess() ? ((RecommendQuestionsResponse) serverResponse.getData()).getQuestions() : null;
        return questions == null ? pu4.a : questions;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot, zn2 zn2Var) throws jzc {
        hke hkeVar;
        if (zn2Var instanceof hke) {
            hkeVar = (hke) zn2Var;
            int i = hkeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkeVar.label = i - Integer.MIN_VALUE;
            } else {
                hkeVar = new hke(this, zn2Var);
            }
        } else {
            hkeVar = new hke(this, zn2Var);
        }
        Object objA = hkeVar.result;
        int i2 = hkeVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            SubmitSpreadRequest submitSpreadRequest = new SubmitSpreadRequest(userSelectedSpread, cloudMixedDeckSnapshot);
            hkeVar.L$0 = null;
            hkeVar.L$1 = null;
            hkeVar.L$2 = null;
            hkeVar.label = 1;
            objA = this.a.a(str, submitSpreadRequest, hkeVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        ServerResponse serverResponse = (ServerResponse) objA;
        if (serverResponse.getErrorCode() == 0) {
            return wef.a;
        }
        throw new jzc(Constants.MINIMAL_ERROR_STATUS_CODE, serverResponse.getErrorCode(), serverResponse.getErrorMessage(), null, null, 248);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, zn2 zn2Var) {
        ike ikeVar;
        Object dzbVar;
        TarotReadingBody reading;
        String content;
        if (zn2Var instanceof ike) {
            ikeVar = (ike) zn2Var;
            int i = ikeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikeVar.label = i - Integer.MIN_VALUE;
            } else {
                ikeVar = new ike(this, zn2Var);
            }
        } else {
            ikeVar = new ike(this, zn2Var);
        }
        Object objG = ikeVar.result;
        int i2 = ikeVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objG);
                ikeVar.L$0 = null;
                ikeVar.L$1 = null;
                ikeVar.label = 1;
                objG = g(str, ikeVar);
                Object obj = bw2.a;
                if (objG == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objG);
            }
            dzbVar = (TarotReadingHistory) objG;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) dzbVar;
        if (tarotReadingHistory == null || (reading = tarotReadingHistory.getReading()) == null || (content = reading.getContent()) == null) {
            return null;
        }
        if (v4e.Q(content)) {
            content = null;
        }
        if (content != null) {
            return new j97(content, tarotReadingHistory);
        }
        return null;
    }
}
