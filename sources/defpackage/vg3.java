package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.navhost.DeckSelectionRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vg3 implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ vg3(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                kob kobVar = job.a;
                return new kic("kotlinx.datetime.DateTimeUnit", kobVar.b(ug3.class), new em7[]{kobVar.b(pg3.class), kobVar.b(rg3.class), kobVar.b(tg3.class)}, new xn7[]{yg3.a, c19.a, lxe.a});
            case 1:
                nyc[] nycVarArr = new nyc[0];
                if (v4e.Q("kotlinx.datetime.DayBased")) {
                    qc0.j("Blank serial names are prohibited");
                    return null;
                }
                q22 q22Var = new q22("kotlinx.datetime.DayBased");
                c77 c77Var = c77.a;
                q22Var.a("days", c77.b, false);
                return new pyc("kotlinx.datetime.DayBased", g5e.c, q22Var.c.size(), qd0.G0(nycVarArr), q22Var);
            case 2:
                return q1c.f(ArcanaGroup.Major);
            case 3:
                return q1c.f(xh3.a);
            case 4:
                return q1c.f(dwf.a);
            case 5:
                return q1c.f(Boolean.FALSE);
            case 6:
                return q1c.f(Boolean.FALSE);
            case 7:
                return q1c.f(Boolean.FALSE);
            case 8:
                return q1c.f(Boolean.FALSE);
            case 9:
                return q1c.f(Boolean.FALSE);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return DeckSelectionRoute._init_$_anonymous_();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return db6.A0(Boolean.FALSE);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                jcc.k(0, Integer.valueOf(R.string.network_common_error));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return wefVar;
            case 14:
                return Float.valueOf(1.0f);
            case 15:
                hs3 hs3Var = xqa.y0;
                ynb.V(lw2.a, null, null, new k44(hs3Var.a, Boolean.FALSE, null), 3);
                jcc.k(0, "已重置");
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ynb.V(lw2.a, null, null, new m54(xqa.c0.a, "", null), 3);
                jcc.k(0, "Daily limit reset");
                return wefVar;
            case 17:
                hs3 hs3Var2 = xqa.a;
                ynb.V(lw2.a, null, null, new r44(hs3Var2.a, Boolean.FALSE, null), 3);
                jcc.k(0, "重启 app 后可重走 onboarding");
                return wefVar;
            case 18:
                ynb.V(lw2.a, null, null, new l44(2, null), 3);
                jcc.k(0, "已重置 TP 显示标志");
                return wefVar;
            case 19:
                ynb.V(lw2.a, null, null, new r24(xqa.Y.a, "[\n    {\n        \"id\": \"2405\",\n        \"type\": \"invite\",\n        \"startAt\": \"2024-05-01T00:00:00+08:00\",\n        \"endAt\": \"2099-05-07T00:00:00+08:00\"\n    },\n    {\n        \"id\": \"Month_2407\",\n        \"type\": \"month\",\n        \"recommendQuestion\": \"🌙 我的七月运势\",\n        \"pattern\": \"5牌布局\",\n        \"patternData\": [\n            {\n                \"name\": \"月度第一周\",\n                \"desc\": \"表明你第一周的运势。\"\n            },\n            {\n                \"name\": \"月度第二周\",\n                \"desc\": \"表明你第二周的运势。\"\n            },\n            {\n                \"name\": \"月度第三周\",\n                \"desc\": \"表明你第三周的运势。\"\n            },\n            {\n                \"name\": \"月度第四周\",\n                \"desc\": \"表明你第四周的运势。\"\n            },\n            {\n                \"name\": \"七月概览\",\n                \"desc\": \"表明你七月的整体运势。\"\n            }\n        ],\n        \"popup\": {\n            \"background\": {\n                \"light\": \"https://staging.quin.love/images/month/bg.png\",\n                \"dark\": \"https://staging.quin.love/images/month/bg.png\"\n            },\n            \"icon\": {\n                \"light\": \"https://staging.quin.love/images/month/july_light.png\",\n                \"dark\": \"https://staging.quin.love/images/month/july_dark.png\"\n            },\n            \"canClose\": true,\n            \"title\": \"🌙 我的七月运势\",\n            \"desc\": \"接下来有哪些挑战和好的变化在等待你？正在做的努力有机会显现成果吗？\",\n            \"actions\": [\n                {\n                    \"type\": \"continue\",\n                    \"text\": \"点击接好运！\"\n                },\n                {\n                    \"type\": \"skip\",\n                    \"text\": \"跳过\"\n                }\n            ]\n        },\n        \"startAt\": \"2024-06-26T00:00:00+08:00\",\n        \"endAt\": \"2024-07-07T00:00:00+08:00\"\n    }\n]", null), 3);
                return wefVar;
            case 20:
                ynb.V(lw2.a, null, null, new u24(xqa.Y.a, " [\n    {\n        \"id\": \"2405\",\n        \"type\": \"invite\",\n        \"startAt\": \"2024-05-01T00:00:00+08:00\",\n        \"endAt\": \"2099-05-07T00:00:00+08:00\"\n    },\n    {\n        \"id\": \"Month_Daily_2024-07-24\",\n        \"type\": \"daily\",\n        \"recommendQuestion\": \"🌙 Daily Fortune\",\n        \"pattern\": \"THE DAILY SPREAD\",\n        \"patternData\": [\n            {\n                \"name\": \"Career Work\",\n                \"desc\": \"It represents your finances, sense of security, wealth, etc. today.\"\n            }\n        ],\n        \"startAt\": \"2024-06-26T00:00:00+08:00\",\n        \"endAt\": \"2029-07-29T00:00:00+08:00\"\n    }\n]", null), 3);
                return wefVar;
            case 21:
                ynb.V(lw2.a, null, null, new x24(xqa.Y.a, " [\n     {\n         \"id\": \"2405\",\n         \"type\": \"invite\",\n         \"startAt\": \"2024-05-01T00:00:00+08:00\",\n         \"endAt\": \"2099-05-07T00:00:00+08:00\"\n     },\n     {\n         \"id\": \"Month_2407\",\n         \"type\": \"month\",\n         \"recommendQuestion\": \"🌙 我的七月运势\",\n         \"pattern\": \"5牌布局\",\n         \"patternData\": [\n             {\n                 \"name\": \"月度第一周\",\n                 \"desc\": \"表明你第一周的运势。\"\n             },\n             {\n                 \"name\": \"月度第二周\",\n                 \"desc\": \"表明你第二周的运势。\"\n             },\n             {\n                 \"name\": \"月度第三周\",\n                 \"desc\": \"表明你第三周的运势。\"\n             },\n             {\n                 \"name\": \"月度第四周\",\n                 \"desc\": \"表明你第四周的运势。\"\n             },\n             {\n                 \"name\": \"七月概览\",\n                 \"desc\": \"表明你七月的整体运势。\"\n             }\n         ],\n         \"popup\": {\n             \"background\": {\n                 \"light\": \"https://staging.quin.love/images/month/bg.png\",\n                 \"dark\": \"https://staging.quin.love/images/month/bg.png\"\n             },\n             \"icon\": {\n                 \"light\": \"https://staging.quin.love/images/month/july_light.png\",\n                 \"dark\": \"https://staging.quin.love/images/month/july_dark.png\"\n             },\n             \"canClose\": true,\n             \"title\": \"🌙 我的七月运势\",\n             \"desc\": \"接下来有哪些挑战和好的变化在等待你？正在做的努力有机会显现成果吗？\",\n             \"actions\": [\n                 {\n                     \"type\": \"continue\",\n                     \"text\": \"点击接好运！\"\n                 },\n                 {\n                     \"type\": \"skip\",\n                     \"text\": \"跳过\"\n                 }\n             ]\n         },\n         \"startAt\": \"2024-06-26T00:00:00+08:00\",\n         \"endAt\": \"2024-07-07T00:00:00+08:00\"\n     },\n     {\n         \"id\": \"Month_Daily_2024-07-24\",\n         \"type\": \"daily\",\n         \"recommendQuestion\": \"🌙 Daily Fortune\",\n         \"pattern\": \"THE DAILY SPREAD\",\n         \"patternData\": [\n             {\n                 \"name\": \"Career Work\",\n                 \"desc\": \"It represents your finances, sense of security, wealth, etc. today.\"\n             }\n         ],\n         \"startAt\": \"2024-06-26T00:00:00+08:00\",\n         \"endAt\": \"2029-07-29T00:00:00+08:00\"\n     }\n]", null), 3);
                return wefVar;
            case 22:
                ynb.V(lw2.a, null, null, new o34(xqa.a1.a, "", null), 3);
                jcc.k(0, "已重置 popup 标志");
                return wefVar;
            case 23:
                hs3 hs3Var3 = xqa.N0;
                Boolean bool = Boolean.FALSE;
                isa isaVar = hs3Var3.a;
                qn2 qn2Var = lw2.a;
                ynb.V(qn2Var, null, null, new e44(isaVar, bool, null), 3);
                ynb.V(qn2Var, null, null, new h44(xqa.O0.a, bool, null), 3);
                jcc.k(0, "已重置");
                return wefVar;
            case 24:
                ynb.V(lw2.a, null, null, new i64(2, null), 3);
                return wefVar;
            case 25:
                hs3 hs3Var4 = xqa.t;
                ynb.V(lw2.a, null, null, new x14(hs3Var4.a, Boolean.FALSE, null), 3);
                jcc.k(0, "已重置");
                return wefVar;
            case 26:
                ynb.V(lw2.a, null, null, new b44(xqa.d0.a, "", null), 3);
                jcc.k(0, "已重置");
                return wefVar;
            case 27:
                hs3 hs3Var5 = xqa.B0;
                ynb.V(lw2.a, null, null, new m64(hs3Var5.a, Boolean.FALSE, null), 3);
                jcc.k(0, "已重置");
                return wefVar;
            case 28:
                hs3 hs3Var6 = xqa.a;
                ynb.V(lw2.a, null, null, new p54(hs3Var6.a, Boolean.FALSE, null), 3);
                jcc.k(0, "重启app后生效");
                return wefVar;
            default:
                return q1c.f(Boolean.FALSE);
        }
    }
}
