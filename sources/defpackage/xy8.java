package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xy8 implements d3b {
    public final inf a;
    public final t7 b;

    static {
        int i = inf.g;
    }

    public xy8(inf infVar, t7 t7Var) {
        this.a = infVar;
        this.b = t7Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws IOException {
        String strD = jrb.d(this.b);
        if (strD == null) {
            return new QaResult.Err("no signed-in account", "not_signed_in");
        }
        if (jrb.a == null) {
            return new QaResult.Err("popup host unavailable — foreground the Home screen first", "no_popup_host");
        }
        Instant instantMinus = Instant.now().minus(1L, (TemporalUnit) ChronoUnit.MINUTES);
        instantMinus.getClass();
        String strP = w4e.p("\n    {\n      \"login\": false,\n      \"success\": true,\n      \"error\": false,\n      \"errorCode\": 0,\n      \"errorMessage\": \"\",\n      \"data\": [\n        {\n          \"id\": \"popup_weekend-free-credit\",\n          \"type\": \"popup\",\n          \"category\": \"activity\",\n          \"startAt\": \"" + instantMinus + "\",\n          \"endAt\": \"" + instantMinus.plus(48L, (TemporalUnit) ChronoUnit.HOURS) + "\",\n          \"popup\": {\n            \"background\": {\n              \"light\": \"https://askquin.ai/images/popup/common/bg.png\",\n              \"dark\": \"https://askquin.ai/images/popup/common/bg.png\"\n            },\n            \"icon\": {\n              \"light\": \"https://askquin.ai/images/popup/test-report/icon.png\",\n              \"dark\": \"https://askquin.ai/images/popup/test-report/icon.png\"\n            },\n            \"iconSize\": [240, 168],\n            \"canClose\": true,\n            \"title\": \"周末免费占卜已到账\",\n            \"desc\": \"送您 1 次免费占卜（48 小时有效）\",\n            \"actions\": [\n              {\n                \"type\": \"continue\",\n                \"text\": \"立即体验\",\n                \"url\": \"quinlove:///app/chat\",\n                \"tracking\": {\n                  \"event\": \"button_click\",\n                  \"properties\": {\n                    \"btn\": \"enter_reading\",\n                    \"popup\": \"weekend_free_credit\",\n                    \"page_name\": \"homepage\"\n                  }\n                }\n              }\n            ],\n            \"tracking\": {\n              \"view\": {\n                \"event\": \"popup_view\",\n                \"properties\": {\"popup\": \"weekend_free_credit\"}\n              },\n              \"close\": {\n                \"event\": \"button_click\",\n                \"properties\": {\n                  \"btn\": \"close\",\n                  \"popup\": \"weekend_free_credit\",\n                  \"page_name\": \"homepage\"\n                }\n              }\n            }\n          }\n        }\n      ]\n    }\n  ");
        bm8.P(new wy8(this, strD, null));
        boolean z = jd9.a;
        ConcurrentHashMap concurrentHashMap = jd9.c;
        concurrentHashMap.put("/api/user/popup", new fd9(200, strP, "application/json"));
        hl hlVar = jrb.a;
        if (hlVar == null) {
            return new QaResult.Err("popup host unavailable — foreground the Home screen first", "no_popup_host");
        }
        new Handler(Looper.getMainLooper()).post(new wp(8, hlVar));
        return new QaResult.Ok(new ti7(bm8.H(new iy9("endpoint", oh7.c("/api/user/popup")), new iy9("code", oh7.b(200)), new iy9("responseBody", oh7.c(strP)), new iy9("presentationRequested", oh7.a(Boolean.TRUE)), new iy9("cleanupCapability", oh7.c("event.clear-weekend-free-popup-mock")))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.mock-weekend-free-popup";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "Mock 周末免费次数浮窗后端响应并展示";
    }
}
