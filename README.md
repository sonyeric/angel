![](assets/angel_logo.png)


[![license](http://img.shields.io/badge/license-BSD3-brightgreen.svg?style=flat)](https://github.com/tencent/angel/blob/master/LICENSE)
[![Release Version](https://img.shields.io/badge/release-1.4.0-red.svg)](https://github.com/tencent/angel/releases)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/tencent/angel/pulls)

**Angel** is a high-performance distributed machine learning platform based on the philosophy of Parameter Server. It is tuned for performance with big data from Tencent and has a wide range of applicability and stability, demonstrating increasing advantage in handling higher dimension model. Angel is jointly developed by Tencent and Peking University, taking account of both high availability  in industry and innovation in academia.

With model-centered core design concept, **Angel** partitions parameters of complex models into multiple parameter-server nodes, and implements a variety of machine learning algorithms using efficient model-updating interfaces and functions, as well as flexible consistency model for synchronization.

**Angel** is developed with **Java** and **Scala**.  It supports running on **Yarn** and **Kubernetes**. With **PS Service** abstraction, it supports **Spark on Angel** and **Pytorch on Angel** now.  Graph computing and deep learning frameworks support is under development and with be released in the future.

We welcome everyone interested in machine learning to contribute code, create issues or pull requests. Please refer to  [Angel Contribution Guide](https://github.com/Tencent/angel/blob/master/CONTRIBUTING.md) for more detail.


## Quick Start
* [Compilation Guide](./docs/deploy/source_compile_en.md)
* [Running on Local](./docs/deploy/local_run_en.md)
* [Running on Yarn](./docs/deploy/run_on_yarn_en.md)
* [Running on Kubernetes](./docs/deploy/run_on_kubernetes_en.md)


## Algorithm
* [**Algorithm Parameter Description**](./docs/algo/model_config_details.md)
* [Logistic Regression](./docs/algo/lr_on_angel_en.md)
* [SVM](./docs/algo/svm_on_angel_en.md)
* [KMeans](./docs/algo/kmeans_on_angel_en.md)
* [GBDT](./docs/algo/gbdt_on_angel_en.md)
* [LDA](./docs/algo/lda_on_angel_en.md)
* [Linear Regression](./docs/algo/linear_on_angel_en.md)
* [Robust Regression](./docs/algo/robust_on_angel_en.md)
* [Softmax Regression](./docs/algo/softmax_on_angel_en.md)

## Deployment
* [Configuration Details](./docs/deploy/config_details_en.md)

## Development
* [Architecture](./docs/overview/architecture_en.md)
* [Angel PS Service](./docs/overview/ps_service_en.md)
* [Core API]((./docs/apis/core_api_en.md))

## FAQ
* [Angel FAQ](https://github.com/Tencent/angel/wiki/Angel%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98)

## Papers
  1. Lele Yu, Bin Cui, Ce Zhang, Yingxia Shao. [LDA*: A Robust and Large-scale Topic Modeling System](http://www.vldb.org/pvldb/vol10/p1406-yu.pdf). VLDB, 2017
  2. Jiawei Jiang, Bin Cui, Ce Zhang, Lele Yu. [Heterogeneity-aware Distributed Parameter Servers](http://net.pku.edu.cn/~cuibin/Papers/2017%20sigmod.pdf). SIGMOD, 2017
  3. Jie Jiang, Lele Yu, Jiawei Jiang, Yuhong Liu and Bin Cui. [Angel: a new large-scale machine learning system](http://net.pku.edu.cn/~cuibin/Papers/2017NSRangel.pdf). National Science Review (NSR), 2017
  4. Jie Jiang, Jiawei Jiang,  Bin Cui and Ce Zhang. [TencentBoost: A Gradient Boosting Tree System with Parameter Server](http://net.pku.edu.cn/~cuibin/Papers/2017%20ICDE%20boost.pdf).	ICDE, 2017
  5. Jiawei Jiang, Bin Cui, Ce Zhang and Fangcheng Fu. [DimBoost: Boosting Gradient Boosting Decision Tree to Higher Dimensions](https://dl.acm.org/citation.cfm?id=3196892). SIGMOD, 2018.
