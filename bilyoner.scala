
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class bilyoner extends Simulation {

	val httpProtocol = http
		.baseURL("https://mc.yandex.ru")
		.proxy(Proxy("192.168.12.51", 8080).httpsPort(8080))
		.inferHtmlResources()

	val headers_0 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Cache-Control" -> "max-age=0",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_3 = Map("User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_22 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_31 = Map(
		"Accept" -> "text/html, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_32 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_33 = Map(
		"Accept" -> "text/html, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_35 = Map(
		"Accept" -> "text/html, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_39 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_41 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"referer" -> "https://www.bilyoner.com/",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_42 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"cookie" -> "fr=0yJspLg2mAdVmbDgj..BYkd6J...1.0.BYkd6J.",
		"referer" -> "https://www.bilyoner.com/",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_44 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"cookie" -> """metrics_token="v1:14859552395433934114555011"""",
		"referer" -> "https://www.bilyoner.com/",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_73 = Map(
		"Accept" -> "text/javascript, application/javascript, application/ecmascript, application/x-ecmascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_76 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_89 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "https://www.bilyoner.com",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_90 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_102 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_131 = Map(
		"Accept" -> "text/plain, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate, sdch, br",
		"Accept-Language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_147 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"referer" -> "https://www.bilyoner.com/iddaa/iddaa-bahis-yap",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

	val headers_148 = Map(
		"accept" -> "image/webp,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, sdch, br",
		"accept-language" -> "en-GB,en;q=0.8,en-US;q=0.6,tr;q=0.4",
		"cookie" -> "fr=0yJspLg2mAdVmbDgj..BYkd6J...1.0.BYkd6J.",
		"referer" -> "https://www.bilyoner.com/iddaa/iddaa-bahis-yap",
		"user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.76 Safari/537.36")

    val uri01 = "https://connect.facebook.net/en_US/fbevents.js"
    val uri02 = "https://www.google-analytics.com"
    val uri04 = "https://www.facebook.com/tr"
    val uri05 = "https://www.bilyoner.com"
    val uri06 = "https://syndication.twitter.com/i/jot"
    val uri07 = "https://pbs.twimg.com"
    val uri08 = "https://www.googletagmanager.com/gtm.js"
    val uri09 = "https://statics.bilyoner.com"
    val uri10 = "https://cdn.syndication.twimg.com/widgets/timelines/279619564533325824"
    val uri11 = "https://platform.twitter.com"

	val scn = scenario("bilyoner")
		.exec(http("request_0")
			.post("/webvisor/26866029?rn=584309533&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=735077278&wv-part=3&wv-check=58697&browser-info=z%3A180%3Ai%3A20170201162134%3Arqnl%3A1%3Ast%3A1485955299%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "DzQBDEULGgCWAcAMwAIAAAKZZgJSDDJmAlIMPFQCUwxGPQJTDFAnAlQMVxcCVAxfAgJVC2abAQJVC2qSAQJWC2yNAQJWC26JAQJYC26FAQJYC2*BAQJZC3B8AloLcXgCWwtxdAJbC3JwAlwLcmwCXAtzaAJeC3NkAl4Lc2ACXwtzVQJfC3NCAmALcTMCYAtuKAJhC2wiAmELax4CYgtqGgJiC2kW"))
		.pause(2)
		.exec(http("request_1")
			.post("/webvisor/26866029?rn=726644575&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=735077278&wv-part=4&wv-check=42985&browser-info=z%3A180%3Ai%3A20170201162134%3Arqnl%3A1%3Ast%3A1485955301%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "DosBDQ__")
			.resources(http("request_2")
			.get(uri05 + "/")
			.headers(headers_2),
            http("request_3")
			.get(uri05 + "/styles/bilyoner.css?v=1.658")
			.headers(headers_3),
            http("request_4")
			.get(uri05 + "/styles/portal.css?v=1.658")
			.headers(headers_3),
            http("request_5")
			.get(uri05 + "/styles/iddaa.css?v=1.658")
			.headers(headers_3),
            http("request_6")
			.get(uri05 + "/styles/st.css?v=1.658")
			.headers(headers_3),
            http("request_7")
			.get(uri05 + "/styles/re-design.css?v=1.658")
			.headers(headers_3),
            http("request_8")
			.get(uri05 + "/styles/bjqs.css?v=1.658")
			.headers(headers_3),
            http("request_9")
			.get(uri09 + "/re-design/temp/other-5.png"),
            http("request_10")
			.get(uri05 + "/fancybox/jquery.fancybox-1.3.1.css")
			.headers(headers_3),
            http("request_11")
			.get(uri05 + "/styles/themes/default.css")
			.headers(headers_3),
            http("request_12")
			.get(uri05 + "/scripts/aggregate/head-vendor-min.a0fbda0b.js")
			.headers(headers_3),
            http("request_13")
			.get(uri05 + "/scripts/aggregate/head-min.9adc4949.js")
			.headers(headers_3),
            http("request_14")
			.get(uri05 + "/layerslider/css/layerslider.css?v=1.658")
			.headers(headers_3),
            http("request_15")
			.get(uri09 + "/portal/images/yilin_en_iyi_sans_oyunlari_uygulamasi.gif"),
            http("request_16")
			.get(uri09 + "/re-design/temp/banner-first-16.png"),
            http("request_17")
			.get(uri09 + "/re-design/temp/banner-second-3.png"),
            http("request_18")
			.get(uri09 + "/re-design/temp/banner-third-2.png"),
            http("request_19")
			.get(uri05 + "/scripts/aggregate/index-vendor-min.d780ec9e.js")
			.headers(headers_3),
            http("request_20")
			.get(uri05 + "/scripts/aggregate/index-min.82d96911.js")
			.headers(headers_3),
            http("request_21")
			.get(uri09 + "/common/site-bck.jpg"),
            http("request_22")
			.post(uri05 + "/gamelist/getEventTypes")
			.headers(headers_22),
            http("request_23")
			.get(uri05 + "/scripts/aggregate/footer-min.70573a93.js")
			.headers(headers_3),
            http("request_24")
			.get(uri09 + "/images/layout/sprite_v14.png"),
            http("request_25")
			.get(uri09 + "/images/layout/canli-yayin-sprite.png"),
            http("request_26")
			.get(uri05 + "/styles/new-bahisyap/images/tribune-menu-icon.png"),
            http("request_27")
			.get(uri11 + "/widgets.js")
			.headers(headers_3),
            http("request_28")
			.get(uri08 + "?id=GTM-58MM45")
			.headers(headers_3),
            http("request_29")
			.get("/metrika/watch.js")
			.headers(headers_3),
            http("request_30")
			.get(uri09 + "/images/layout/push-sprite.png"),
            http("request_31")
			.post(uri05 + "/loadLogin")
			.headers(headers_31),
            http("request_32")
			.get(uri05 + "/banner/data?type=banner&name=inApp-Splash&type=dynamic&name=AutoGeneratedBanner&type=duel&name=AutoGeneratedBanner-Duello")
			.headers(headers_32),
            http("request_33")
			.get(uri05 + "/kampanya-liste?tabView=1")
			.headers(headers_33),
            http("request_34")
			.get(uri05 + "/yenilikler?tabView=1")
			.headers(headers_33),
            http("request_35")
			.post(uri05 + "/iddaa/kuponum")
			.headers(headers_35)
			.formParam("bahisYap", "true"),
            http("request_36")
			.get(uri02 + "/analytics.js")
			.headers(headers_3),
            http("request_37")
			.get(uri01 + "")
			.headers(headers_3),
            http("request_38")
			.post("/webvisor/26866029?rn=441956766&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=735077278&wv-part=5&wv-check=3341&browser-info=z%3A180%3Ai%3A20170201162134%3Arqnl%3A2%3Ast%3A1485955302%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "DQ__"),
            http("request_39")
			.get("/watch/26866029?wmode=5&callback=_ymjsp3982971&page-ref=https%3A%2F%2Fwww.bilyoner.com%2F&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&browser-info=vc%3Aw%3As%3A1680x1050x24%3Ask%3A2%3Aadb%3A2%3Af%3A24.0.0%3Afpr%3A386535311001%3Acn%3A1%3Aw%3A1600x258%3Az%3A180%3Ai%3A20170201162141%3Aet%3A1485955302%3Aen%3Autf-8%3Av%3A759%3Ac%3A1%3Ala%3Aen-gb%3Apv%3A1%3Als%3A1020630884710%3Arqn%3A9%3Arn%3A526901284%3Ahid%3A763870184%3Ads%3A0%2C0%2C236%2C3%2C1%2C0%2C%2C314%2C22%2C%2C%2C%2C567%3Afp%3A552%3Awn%3A11503%3Ahl%3A7%3Arqnl%3A1%3Ast%3A1485955302%3Au%3A14859547291025395746%3At%3ABilyoner.com%20-%20T%C3%BCrkiye%27nin%20Lider%20%C5%9Eans%20Oyunlar%C4%B1%20Sitesi%20-%20%C4%B0ddaa%2C%20Spor%20Toto%2C%20Milli%20Piyango")
			.headers(headers_39),
            http("request_40")
			.get(uri11 + "/js/timeline.49f19f9e34b1f8ffe443c6d5e80fea48.js")
			.headers(headers_3),
            http("request_41")
			.get(uri02 + "/collect?v=1&_v=j47&a=1174139919&t=pageview&_s=1&dl=https%3A%2F%2Fwww.bilyoner.com%2F&ul=en-gb&de=UTF-8&dt=Bilyoner.com%20-%20T%C3%BCrkiye%27nin%20Lider%20%C5%9Eans%20Oyunlar%C4%B1%20Sitesi%20-%20%C4%B0ddaa%2C%20Spor%20Toto%2C%20Milli%20Piyango&sd=24-bit&sr=1680x1050&vp=1600x258&je=0&fl=24.0%20r0&_u=QACAAAABI~&jid=&cid=2045309266.1485954770&tid=UA-56629995-1&gtm=GTM-58MM45&z=1716485974")
			.headers(headers_41),
            http("request_42")
			.get(uri04 + "/?id=1369687263075659&ev=PageView&dl=https%3A%2F%2Fwww.bilyoner.com%2F&rl=https%3A%2F%2Fwww.bilyoner.com%2F&if=false&ts=1485955301940&v=2.5.1")
			.headers(headers_42),
            http("request_43")
			.get(uri10 + "?callback=__twttr.callbacks.tl_i0_279619564533325824_old&dnt=false&domain=www.bilyoner.com&lang=tr&suppress_response_codes=true&t=1651061")
			.headers(headers_3),
            http("request_44")
			.get(uri06 + "/syndication?l=%7B%22_category_%22%3A%22syndicated_impression%22%2C%22triggered_on%22%3A1485955301957%2C%22dnt%22%3Afalse%2C%22event_namespace%22%3A%7B%22client%22%3A%22tfw%22%2C%22page%22%3A%22timeline%22%2C%22action%22%3A%22impression%22%7D%7D")
			.headers(headers_44),
            http("request_45")
			.get(uri07 + "/ext_tw_video_thumb/826425373399404544/pu/img/Dr_vQFNlY9EnV0qR.jpg"),
            http("request_46")
			.get(uri07 + "/ext_tw_video_thumb/826003725101723649/pu/img/VRX5KcFG2TUc4tNh.jpg"),
            http("request_47")
			.get(uri07 + "/ext_tw_video_thumb/825976476696731648/pu/img/lj0ikNLk2dQzoung.jpg"),
            http("request_48")
			.get(uri07 + "/ext_tw_video_thumb/825598031059886080/pu/img/9bgeP4Vi4jDThUAf.jpg"),
            http("request_49")
			.get(uri07 + "/ext_tw_video_thumb/824538522170327040/pu/img/AsQ-7FsC2PWP_AnF.jpg"),
            http("request_50")
			.get(uri11 + "/css/timeline.3a5bba37d8a97ff1a6185653efe28c38.light.ltr.css")
			.headers(headers_3),
            http("request_51")
			.get(uri11 + "/css/timeline.3a5bba37d8a97ff1a6185653efe28c38.light.ltr.css")
			.headers(headers_3),
            http("request_52")
			.get(uri07 + "/profile_images/799501546232881152/Crz9jNkK_bigger.jpg"),
            http("request_53")
			.get(uri07 + "/media/C3lFNNVWIAElGNE.jpg:small"),
            http("request_54")
			.get(uri07 + "/media/C3bO86WWEAA57qE.jpg:small"),
            http("request_55")
			.get(uri07 + "/media/C3acC40WQAAFrQG.jpg:small"),
            http("request_56")
			.get(uri07 + "/media/C3ZlI9IWAAAyOG7.jpg:small"),
            http("request_57")
			.get(uri07 + "/media/C3V-H8nW8AQa09b.jpg:small"),
            http("request_58")
			.get(uri07 + "/media/C3VmjyhWQAYg6JM.jpg:small"),
            http("request_59")
			.get(uri07 + "/media/C3VZFGMWAAEM9vx.jpg:small"),
            http("request_60")
			.get(uri07 + "/media/C3VEXbfXAAAnXY4.jpg:small"),
            http("request_61")
			.get(uri07 + "/media/C3Q8FSvXUAEiOEs.jpg:small"),
            http("request_62")
			.get(uri07 + "/media/C3QU6onWYAA6L8A.jpg:small"),
            http("request_63")
			.get(uri07 + "/media/C3LTiajWcAEo39y.jpg:small"),
            http("request_64")
			.get(uri07 + "/media/C3K1Ck_XAAAlMfb.jpg:small"),
            http("request_65")
			.get(uri07 + "/media/C3GTCgRXgAEVcxT.jpg:small"),
            http("request_66")
			.get(uri07 + "/media/C3GIKsqWgAEjYRR.jpg:small"),
            http("request_67")
			.get(uri07 + "/media/C3F6YFrXEAcxn0a.jpg:small"),
            http("request_68")
			.get(uri05 + "/banner/segment-time")
			.headers(headers_32),
            http("request_69")
			.get(uri09 + "/portal/images/multiple_coupon_interruption_demo.png"),
            http("request_70")
			.get(uri09 + "/bahisYap/loading_32x32.gif"),
            http("request_71")
			.get(uri05 + "/styles/new-bahisyap/images/bet-plus-main-help-image.jpg"),
            http("request_72")
			.get(uri05 + "/styles/coupon.css?v=1.658")
			.headers(headers_3),
            http("request_73")
			.get(uri05 + "/scripts/aggregate/couponView-vendor-min.1861a15b.js?_=1485955302178")
			.headers(headers_73),
            http("request_74")
			.get(uri05 + "/scripts/aggregate/couponView-min.4b73db1f.js?_=1485955302328")
			.headers(headers_73),
            http("request_75")
			.post(uri05 + "/gamelist/getEventTypes")
			.headers(headers_22),
            http("request_76")
			.post(uri05 + "/iddaa/oturum-ata")
			.headers(headers_76)
			.formParam("Bv2", "true")
			.formParam("getCoupon", "true"),
            http("request_77")
			.get(uri09 + "/portal/images/th_tuyoverdi.png"),
            http("request_78")
			.get(uri09 + "/portal/images/th_canliyayin_16.png"),
            http("request_79")
			.get(uri05 + "/layerslider/skins/borderlesslight/skin.css")
			.headers(headers_3),
            http("request_80")
			.get(uri05 + "/iddaa/iddaageneric?instantType=4&priority=true&mainpage=ismainpage")
			.headers(headers_33),
            http("request_81")
			.get(uri09 + "/portal/images/th_tribun.png"),
            http("request_82")
			.get(uri09 + "/bahisYap/bahisyap_sprite_v5.png"),
            http("request_83")
			.get(uri06 + "?l=%7B%22widget_origin%22%3A%22https%3A%2F%2Fwww.bilyoner.com%2F%22%2C%22widget_frame%22%3Afalse%2C%22widget_id%22%3A%22279619564533325824%22%2C%22widget_data_source%22%3A%22279619564533325824%22%2C%22query%22%3Anull%2C%22profile_id%22%3Anull%2C%22widget_in_viewport%22%3Afalse%2C%22item_ids%22%3A%5B%22826768129451753473%22%2C%22826432187641774080%22%2C%22826075553769857024%22%2C%22826019746667716608%22%2C%22826003991213522944%22%2C%22825977370620416000%22%2C%22825958887551561729%22%2C%22825720168399663104%22%2C%22825678884951691264%22%2C%22825664071122968576%22%2C%22825641988015923201%22%2C%22825598518509322240%22%2C%22825350734883520513%22%2C%22825311075465830400%22%2C%22824954342868451328%22%2C%22824920939909545984%22%2C%22824615806642388993%22%2C%22824590597747068928%22%2C%22824575562513575936%22%2C%22824538697379041281%22%5D%2C%22item_details%22%3A%7B%22826768129451753473%22%3A%7B%22item_type%22%3A0%7D%2C%22826432187641774080%22%3A%7B%22item_type%22%3A0%7D%2C%22826075553769857024%22%3A%7B%22item_type%22%3A0%7D%2C%22826019746667716608%22%3A%7B%22item_type%22%3A0%7D%2C%22826003991213522944%22%3A%7B%22item_type%22%3A0%7D%2C%22825977370620416000%22%3A%7B%22item_type%22%3A0%7D%2C%22825958887551561729%22%3A%7B%22item_type%22%3A0%7D%2C%22825720168399663104%22%3A%7B%22item_type%22%3A0%7D%2C%22825678884951691264%22%3A%7B%22item_type%22%3A0%7D%2C%22825664071122968576%22%3A%7B%22item_type%22%3A0%7D%2C%22825641988015923201%22%3A%7B%22item_type%22%3A0%7D%2C%22825598518509322240%22%3A%7B%22item_type%22%3A0%7D%2C%22825350734883520513%22%3A%7B%22item_type%22%3A0%7D%2C%22825311075465830400%22%3A%7B%22item_type%22%3A0%7D%2C%22824954342868451328%22%3A%7B%22item_type%22%3A0%7D%2C%22824920939909545984%22%3A%7B%22item_type%22%3A0%7D%2C%22824615806642388993%22%3A%7B%22item_type%22%3A0%7D%2C%22824590597747068928%22%3A%7B%22item_type%22%3A0%7D%2C%22824575562513575936%22%3A%7B%22item_type%22%3A0%7D%2C%22824538697379041281%22%3A%7B%22item_type%22%3A0%7D%7D%2C%22_category_%22%3A%22tfw_client_event%22%2C%22triggered_on%22%3A1485955302480%2C%22dnt%22%3Afalse%2C%22client_version%22%3A%22cd22cbf%3A1485197404935%22%2C%22format_version%22%3A1%2C%22event_namespace%22%3A%7B%22client%22%3A%22tfw%22%2C%22page%22%3A%22timeline%22%2C%22component%22%3A%22timeline%22%2C%22element%22%3A%22initial%22%2C%22action%22%3A%22results%22%7D%7D")
			.headers(headers_41),
            http("request_84")
			.get(uri09 + "/images/splash/fener_cska_020202017.jpg")
			.headers(headers_3),
            http("request_85")
			.get(uri09 + "/images/splash/dgy_010217.jpg")
			.headers(headers_3),
            http("request_86")
			.get(uri09 + "/images/splash/rain_man_010217.jpg")
			.headers(headers_3),
            http("request_87")
			.get(uri09 + "/images/splash/atletico_barcelona_020217.jpg")
			.headers(headers_3),
            http("request_88")
			.get(uri09 + "/images/splash/westhamxmanchestercity_020217.jpg")
			.headers(headers_3),
            http("request_89")
			.post(uri05 + "/iddaa/oturum-ata")
			.headers(headers_89)
			.formParam("misli", "3")
			.formParam("sistem", "%2C")
			.formParam("sonuc", "")
			.formParam("hasRefundGame", "false")))
		.pause(3)
		.exec(http("request_90")
			.get("/clmap/26866029?page-url=https%3A%2F%2Fwww.bilyoner.com%2F&pointer-click=rn%3A642738262%3Ax%3A37265%3Ay%3A21845%3At%3A44%3Ap%3APWAAAA&browser-info=rqnl%3A1%3Ast%3A1485955306%3Au%3A14859547291025395746")
			.headers(headers_90))
		.pause(8)
		.exec(http("request_91")
			.get("/clmap/26866029?page-url=https%3A%2F%2Fwww.bilyoner.com%2F&pointer-click=rn%3A1000785084%3Ax%3A35279%3Ay%3A34327%3At%3A130%3Ap%3AP2WAAAA&browser-info=rqnl%3A1%3Ast%3A1485955315%3Au%3A14859547291025395746")
			.headers(headers_90)
			.resources(http("request_92")
			.post(uri05 + "/girisYap")
			.headers(headers_76)
			.formParam("j_username", "15787600")
			.formParam("j_password", "807871"),
            http("request_93")
			.post(uri05 + "/loadLogin")
			.headers(headers_31),
            http("request_94")
			.get(uri05 + "/styles/themes/gold.css")
			.headers(headers_3),
            http("request_95")
			.get(uri05 + "/banner/data?type=banner&name=inApp-Splash&type=dynamic&name=AutoGeneratedBanner&type=duel&name=AutoGeneratedBanner-Duello")
			.headers(headers_32),
            http("request_96")
			.get(uri09 + "/images/layout/gold-segment-d.png")
			.headers(headers_3),
            http("request_97")
			.get(uri05 + "/BirthdayMpGift?_=1485955315558")
			.headers(headers_32),
            http("request_98")
			.get(uri05 + "/AnniversaryMpGift?_=1485955315559")
			.headers(headers_32),
            http("request_99")
			.get(uri05 + "/banner/segment-time")
			.headers(headers_32)))
		.pause(1)
		.exec(http("request_100")
			.post("/webvisor/26866029?rn=363012606&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=763870184&wv-part=1&wv-check=11506&browser-info=z%3A180%3Ai%3A20170201162141%3Arqnl%3A1%3Ast%3A1485955317%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "HADADIICwAyFCwEBZAArAADADI8LCQBsAHMALQBnAGwAbwBiAGEAbALHMQECTQENtGsAAQNkAhqxAgDeB4ULBwB3AHIAYQBwAHAAZQByAAEEZAMatgIA1AeWAQsAaABlAGEAZABlAHIALQB3AHIAYQBwAAJLBNIEBgEFZAQa7QQKmAUYDwBsAG8AZwBpAG4ALQBjAG8AbgB0AGEAaQBuAGUAcgJrXQEGRQUa7QQKmAUXNscCyfoBB0EGSQGIBw9WD*IiAjdGAQhVBwGQBxBODOIi4iICZ1cCSwgDBwEJYAQaAbYCFNQHcwQAbQBlAG4AdQK2OAEKbAkaBgBtAGUAbgB1AC0AZgABC2wKGhIAdwBpAGQAZQAtAHMAYwByAGUAZQBuAC0AaABvAGwAZABlAHIAAkwL4AQTAkwL4AQaAk0L3gQeAk0L2gQgAk4L0gQjAk4LxQQnAk8LtQQpAk8LmwQqAk8LhwQqAlAL8gMlAlAL4AMgAlALzAMYAlELuQMQAQxFBkntBAybAhEAAAABDWQML*0EC5kBFQoAagBfAHUAcwBlAHIAbgBhAG0AZQItEQJRDXARAlINYwsCUg1bCAJUDVcHBFYNVwcBEVcNHlkNVwcBIFkNVwcBBYEBADEADQWEAQA1AA0FigEANwANBZUBADgADQWaAQA3AA0FngEANgANBa4BADAADQWzAQAwAA0FuQEACRANE7kBDQgAMQA1ADcAOAA3ADYAMAAwD7kBErkBDQ65AQEOYAwvAY4GCzoVCgBqAF8AcABhAHMAcwB3AG8AcgBkAkAbEbkBDgLxAQ1YBwLxAQ1hBwLyAQ1nBwLyAQ1tBwLzAQ1yBwLzAQ13CAL0AQ17CAL1AQ1-CAL1AQ2HAQgC9gENkQEIAvYBDJ4BBwL3AQ4MCAL3AQ4cCAL4AQ4wCgEPQQwvAtAGCzAVAAACvDEC*AEPAg0C*QEPEA4C*QEPFg4C*wEPGg0C-gEPGgwCggIPGgsEggIPGgsBD4ICEoICDg6CAhGCAg8ehAIPGgsBIIQCDxoLAQ*RAhKRAg8JsAIFywYKCrACBboDHAEQTQUaKxICSB4BEUUQGssGDcgBFirbAsBtARJVEUnaBhFLDGXMZcwAArACEhcFArECEToDArECEE4CArICBIUFBQKyAgSnBQE_"))
		.pause(4)
		.exec(http("request_101")
			.get(uri02 + "/collect?v=1&_v=j47&a=1174139919&t=event&ni=0&_s=1&dl=https%3A%2F%2Fwww.bilyoner.com%2F&ul=en-gb&de=UTF-8&dt=Bilyoner.com%20-%20T%C3%BCrkiye%27nin%20Lider%20%C5%9Eans%20Oyunlar%C4%B1%20Sitesi%20-%20%C4%B0ddaa%2C%20Spor%20Toto%2C%20Milli%20Piyango&sd=24-bit&sr=1680x1050&vp=1600x258&je=0&fl=24.0%20r0&ec=Ana%20Men%C3%BCden%20ve%20K%C4%B1sa%20Yoldan&ea=Click%20Event&el=Ana%20Men%C3%BCden%20%7C%20iddaa%20%7C%20Bahis%20Yap&_u=SACAAAABI~&jid=&cid=2045309266.1485954770&tid=UA-56629995-1&gtm=GTM-58MM45&z=1803423625")
			.headers(headers_41)
			.resources(http("request_102")
			.get(uri05 + "/iddaa/iddaa-bahis-yap")
			.headers(headers_102),
            http("request_103")
			.get(uri05 + "/styles/bilyoner.css?v=1.658")
			.headers(headers_3),
            http("request_104")
			.get(uri05 + "/styles/portal.css?v=1.658")
			.headers(headers_3),
            http("request_105")
			.get(uri05 + "/styles/iddaa.css?v=1.658")
			.headers(headers_3),
            http("request_106")
			.get(uri05 + "/styles/st.css?v=1.658")
			.headers(headers_3),
            http("request_107")
			.get(uri05 + "/styles/re-design.css?v=1.658")
			.headers(headers_3),
            http("request_108")
			.get(uri05 + "/styles/bjqs.css?v=1.658")
			.headers(headers_3),
            http("request_109")
			.get(uri05 + "/fancybox/jquery.fancybox-1.3.1.css")
			.headers(headers_3),
            http("request_110")
			.get(uri05 + "/styles/themes/default.css")
			.headers(headers_3),
            http("request_111")
			.get(uri09 + "/bahisYap/loading_32x32.gif"),
            http("request_112")
			.get(uri05 + "/styles/new-bahisyap/images/bet-plus-main-help-image.jpg"),
            http("request_113")
			.get(uri05 + "/scripts/aggregate/head-vendor-min.a0fbda0b.js")
			.headers(headers_3),
            http("request_114")
			.get(uri05 + "/scripts/aggregate/head-min.9adc4949.js")
			.headers(headers_3),
            http("request_115")
			.get(uri05 + "/styles/new-bahisyap/css/bahis-yap.css")
			.headers(headers_3),
            http("request_116")
			.get(uri05 + "/scripts/aggregate/newBahisYap-min.91fef8b6.js")
			.headers(headers_3),
            http("request_117")
			.get(uri09 + "/common/site-bck.jpg"),
            http("request_118")
			.post(uri05 + "/gamelist/getEventTypes")
			.headers(headers_22),
            http("request_119")
			.get(uri05 + "/scripts/aggregate/footer-min.70573a93.js")
			.headers(headers_3),
            http("request_120")
			.get(uri05 + "/styles/new-bahisyap/images/loader.gif")
			.headers(headers_3),
            http("request_121")
			.get(uri08 + "?id=GTM-58MM45")
			.headers(headers_3),
            http("request_122")
			.get("/metrika/watch.js")
			.headers(headers_3),
            http("request_123")
			.get(uri09 + "/images/layout/sprite_v14.png"),
            http("request_124")
			.get(uri09 + "/images/layout/canli-yayin-sprite.png"),
            http("request_125")
			.get(uri05 + "/styles/new-bahisyap/images/tribune-menu-icon.png"),
            http("request_126")
			.get(uri05 + "/styles/new-bahisyap/images/sprite-sc8565bf367.png")
			.headers(headers_3),
            http("request_127")
			.get(uri09 + "/bahisYap/eventExplanationBack.gif")
			.headers(headers_3),
            http("request_128")
			.get(uri09 + "/images/layout/push-sprite.png"),
            http("request_129")
			.post(uri05 + "/loadLogin")
			.headers(headers_31),
            http("request_130")
			.post(uri05 + "/gamelist/games?sports=1")
			.headers(headers_22),
            http("request_131")
			.get(uri05 + "/datetime?format=EEE,%20dd%20MMM%20yyyy%20HH:mm:ss")
			.headers(headers_131),
            http("request_132")
			.post(uri05 + "/iddaa/kuponum")
			.headers(headers_35)
			.formParam("bahisYap", "true"),
            http("request_133")
			.post("/clmap/26866029?page-url=https%3A%2F%2Fwww.bilyoner.com%2F&pointer-click=rn%3A27235983%3Ax%3A14113%3Ay%3A26214%3At%3A200%3Ap%3A%3BHQdQ1dAAA1AA&browser-info=rqnl%3A2%3Ast%3A1485955323%3Au%3A14859547291025395746")
			.headers(headers_0),
            http("request_134")
			.post("/webvisor/26866029?rn=257983046&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=763870184&wv-part=2&wv-check=26404&browser-info=z%3A180%3Ai%3A20170201162141%3Arqnl%3A2%3Ast%3A1485955323%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "DtcCAvECBMsCAQLxAgTEAgoC8gIEvwIRAvICC7oCAgLzAgu1AgcC8wILsAILAvQCC6wCDQL0AgunAhAC9QILpAITAvYCC6ECFgL3AgugAhoC*AILnQIeAvkCC5sCJAL5AguYAigBE0ULWqAEP*cCIPeIAqYbARRgEzUBqQRAPx4FAGkAZABkAGEAYQK9PgEVRRQjqQRAMx48lwABFl0VATyXPJcCsBkC*gIWJAAC-AIWIwMC-gIWIgQCgAMWIgUCggMWIgkCgwMWIg4ChAMWIxIChQMWJRYChgMWJxoBF0UUWqkEXqUBjwIQvQJLpwKGAxcpAAKHAxcrBAKIAxcsCAEYRRc1vQRofRwUSgACiQMYGQIBGUUYJL0Ebn0PFEoAARpdGQEUShRKAi9YAooDGhoAAosDGhsEAo4DGhsGBI8DGhsGAR6RAxobBgEgkQMaGwYBDQ__"),
            http("request_135")
			.post("/webvisor/26866029?rn=880525039&page-url=https%3A%2F%2Fwww.bilyoner.com%2F&wmode=0&wv-type=0&wv-hit=763870184&wv-part=3&wv-check=3341&browser-info=z%3A180%3Ai%3A20170201162141%3Arqnl%3A2%3Ast%3A1485955323%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "DQ__"),
            http("request_136")
			.get("/watch/26866029?wmode=5&callback=_ymjsp862247752&page-ref=https%3A%2F%2Fwww.bilyoner.com%2F&page-url=https%3A%2F%2Fwww.bilyoner.com%2Fiddaa%2Fiddaa-bahis-yap&browser-info=vc%3Aw%3Ailt%3AQmFoaXMgWWFw%3As%3A1680x1050x24%3Ask%3A2%3Aadb%3A2%3Af%3A24.0.0%3Afpr%3A386535311001%3Acn%3A1%3Aw%3A1600x258%3Az%3A180%3Ai%3A20170201162202%3Aet%3A1485955323%3Aen%3Autf-8%3Av%3A759%3Ac%3A1%3Ala%3Aen-gb%3Apv%3A1%3Als%3A1020630884710%3Arqn%3A10%3Arn%3A1030530411%3Ahid%3A198911605%3Ads%3A0%2C0%2C204%2C4%2C1%2C0%2C%2C628%2C40%2C%2C%2C%2C856%3Afp%3A898%3Awn%3A11503%3Ahl%3A8%3Arqnl%3A1%3Ast%3A1485955323%3Au%3A14859547291025395746%3At%3ABilyoner.com%20-%20T%C3%BCrkiye%27nin%20Lider%20%C5%9Eans%20Oyunlar%C4%B1%20Sitesi%20-%20%C4%B0ddaa%2C%20Spor%20Toto%2C%20Milli%20Piyango")
			.headers(headers_39),
            http("request_137")
			.get(uri02 + "/analytics.js")
			.headers(headers_3),
            http("request_138")
			.get(uri01 + "")
			.headers(headers_3),
            http("request_139")
			.get(uri09 + "/portal/images/multiple_coupon_interruption_demo.png"),
            http("request_140")
			.get(uri05 + "/styles/coupon.css?v=1.658")
			.headers(headers_3),
            http("request_141")
			.get(uri05 + "/scripts/aggregate/couponView-vendor-min.1861a15b.js?_=1485955322898")
			.headers(headers_73),
            http("request_142")
			.get(uri05 + "/scripts/aggregate/couponView-min.4b73db1f.js?_=1485955322956")
			.headers(headers_73),
            http("request_143")
			.post(uri05 + "/gamelist/getEventTypes")
			.headers(headers_22),
            http("request_144")
			.post(uri05 + "/iddaa/oturum-ata")
			.headers(headers_76)
			.formParam("Bv2", "true")
			.formParam("getCoupon", "true"),
            http("request_145")
			.get(uri05 + "/styles/themes/gold.css")
			.headers(headers_3),
            http("request_146")
			.post(uri05 + "/iddaa/sonSecimlerim")
			.headers(headers_22),
            http("request_147")
			.get(uri02 + "/collect?v=1&_v=j47&a=831311734&t=pageview&_s=1&dl=https%3A%2F%2Fwww.bilyoner.com%2Fiddaa%2Fiddaa-bahis-yap&ul=en-gb&de=UTF-8&dt=Bilyoner.com%20-%20T%C3%BCrkiye%27nin%20Lider%20%C5%9Eans%20Oyunlar%C4%B1%20Sitesi%20-%20%C4%B0ddaa%2C%20Spor%20Toto%2C%20Milli%20Piyango&sd=24-bit&sr=1680x1050&vp=1600x258&je=0&fl=24.0%20r0&_u=QACAAAABI~&jid=&cid=2045309266.1485954770&tid=UA-56629995-1&gtm=GTM-58MM45&z=2060879895")
			.headers(headers_147),
            http("request_148")
			.get(uri04 + "/?id=1369687263075659&ev=PageView&dl=https%3A%2F%2Fwww.bilyoner.com%2Fiddaa%2Fiddaa-bahis-yap&rl=https%3A%2F%2Fwww.bilyoner.com%2F&if=false&ts=1485955323060&v=2.5.1")
			.headers(headers_148),
            http("request_149")
			.post(uri05 + "/iddaa/sonSecimlerim")
			.headers(headers_22),
            http("request_150")
			.get(uri09 + "/images/layout/gold-segment-d.png"),
            http("request_151")
			.get(uri05 + "/BirthdayMpGift?_=1485955323184")
			.headers(headers_32),
            http("request_152")
			.get(uri05 + "/AnniversaryMpGift?_=1485955323185")
			.headers(headers_32),
            http("request_153")
			.post(uri05 + "/gamelist/recommendations")
			.headers(headers_22),
            http("request_154")
			.get(uri09 + "/images/layout/canli-lite.png")
			.headers(headers_3),
            http("request_155")
			.post(uri05 + "/iddaa/oturum-ata")
			.headers(headers_89)
			.formParam("misli", "3")
			.formParam("sistem", "%2C")
			.formParam("sonuc", "")
			.formParam("hasRefundGame", "false")))
		.pause(3)
		.exec(http("request_156")
			.post("/webvisor/26866029?rn=62200468&page-url=https%3A%2F%2Fwww.bilyoner.com%2Fiddaa%2Fiddaa-bahis-yap&wmode=0&wv-type=0&wv-hit=198911605&wv-part=1&wv-check=24231&browser-info=z%3A180%3Ai%3A20170201162202%3Arqnl%3A1%3Ast%3A1485955327%3Au%3A14859547291025395746")
			.headers(headers_0)
			.formParam("wv-data", "HADADIICwAzZBAEBRAArAADADMUiAscxAQJNAQ0R1wABA2UCGgAAwAy7IgcAdwByAGEAcABwAGUAcqZ5AAEEZAMatgIA1AeWAQsAaABlAGEAZABlAHIALQB3AHIAYQBwAqcpAQVgBBoBtgIU1AdzBABtAGUAbgB1ArY4AQZsBRoGAG0AZQBuAHUALQBmAAEHbAYaEgB3AGkAZABlAC0AcwBjAHIAZQBlAG4ALQBoAG8AbABkAGUAcgABCEUHWqAEP*cCIPeIAqYbAQlFCDWgBF*tAhhsCAI37AEKRQlaoQRgqwIAbAgAAQtFCjWtBGA5FhRKAqaMAk0LKBQCTQTbAYwBAk0EwwGUAQEMQQMaAq4ClgHkB*0fnhwC-c8BDVUMGq4ClgHkBxrQCXb5Ak9aAk4NlAEQAk4NcRgBDkEMGgGuArAB5Ae-HyidAtHCAQ9kDhquArAB5AfxHQoAcwBwAG8AcgB0AHMAYgBvAG8AawABEE0PGhgGAg0uARFsEBoOAHMAcABvAHIAdABzAGIAbwBvAGsARABhAHQAYQACTxFeBAESZBEauAK6AdAHIQ0AcwBwAG8AcgB0AHMAYgBvAG8AawBUAGEAYgABE2wSGggAeQBhAHAAQgBhAGgAaQBzAo7mARRsE1oQAGIAYQBoAGkAcwBZAGEAcABUAGEAYgBQAGEAbgBlAGwC77oBFUUUNbgCugFQIdeyAi33ARZNFQHXsgKuxwJPFjQCAk8WFAgCUBEHFgJQA6UCyQECUAORAswBAlEDgwLPAQJRA-gB0QECUgPvAdEBAlID5QHRAQJTA9oB0QECUwPMAdEBAlQDugHPAQJUA6UBzQECVQOPAcwBAlUDf8wBAlYDZ8wBAlYDV8wBAlYDR9ABAlcDN9gBAlcDKuEBAlgDH*0BAlgDGfkB"))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}